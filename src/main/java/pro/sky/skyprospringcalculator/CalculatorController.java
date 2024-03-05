package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping (path = "/calculator")
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping (path = "/calculator/plus")
    public String sumNumbers(@RequestParam("num1") int nam1, @RequestParam("num2") int num2) {
        return String.valueOf(calculatorService.summa(nam1, num2));
    }

    @GetMapping (path = "/calculator/minus")
    public String subtractionNumbers(@RequestParam("num1") int nam1, @RequestParam("num2") int num2) {
        return String.valueOf(calculatorService.subtraction(nam1, num2));
    }

    @GetMapping (path = "/calculator/multiply")
    public String multiplicationNumbers(@RequestParam("num1") int nam1, @RequestParam("num2") int num2) {
        return String.valueOf(calculatorService.multiplication(nam1, num2));
    }

    @GetMapping (path = "/calculator/divide")
    public String divisionNumbers(@RequestParam("num1") int nam1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя";
        }
        return String.valueOf(calculatorService.division(nam1, num2));
    }
}
