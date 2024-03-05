package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int summa(int num1, int num2) {
        return num1+num2;
    }

    public int subtraction(int num1, int num2){
        return num1-num2;
    }

    public int multiplication(int num1, int num2) {
        return num1*num2;
    }

    public int division(int num1, int num2) {
        return num1/num2;
    }



}
