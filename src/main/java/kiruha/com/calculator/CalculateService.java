package kiruha.com.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculateService  {
    public String welcome(){
        return  "<div>Добро пожаловать в калькулятор<div>" +
                "<a href= '/plus'>Сложение</a>" + " " +
                "<a href= '/minus'>Вычитание</a>" + " " +
                "<a href= '/div'>Деление</a>" + " " +
                "<a href= '/mult'>Умнножение</a>" + " " ;
    }
    public String plus(double num1,double num2) {
        return "Сложение: " + num1 + "+" + num2 + "=" + (num1 + num2);
    }
    public String minus(double num1,double num2) {
        return "Вычтание: "+ num1 + "+" + num2 + "=" + (num1 - num2);
    }
    public String div(double num1,double num2) {
        return "Деление: "+ num1 + "+" + num2 + "=" + (num1 / num2);
    }
    public String mult(double num1,double num2) {
        return "Умножение: "+ num1 + "+" + num2 + "=" + (num1 * num2);
    }

}
