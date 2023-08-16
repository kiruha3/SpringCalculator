package kiruha.com.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculateService implements CalculateSirviceInterface {

    public String calculator() {
        return "<style>" +
                ".columns{margin-left:20px;}" +
                "body{text-align: center;'}" +
                "</style>" +
                "<div class='header' >Выберите действие</div>" +
                    "<div style='display:inline-flex;' >" +
                    "<div class='columns'>" +
                        "<a >Сложение     </a>" +
                        "<br> <a href= 'calculator/plus?num1=5&num2=8'>5+8 </a> " +
                        "<br> <a href= 'calculator/plus?num1=12&num2=6'>12+6 </a> " +
                        "<br> <a href= 'calculator/plus?num1=7&num2=4'>7+4 </a> " +
                        "<br> <a href= 'calculator/plus?num1=4.6&num2=4'>4.6+4 </a>" +
                        "<br>" +
                    "</div>" +
                    "<div class='columns'>" +
                        "<a >Вычитание     </a>" +
                        "<br> <a href= 'calculator/minus?num1=5&num2=8'>5-8 </a> " +
                        "<br> <a href= 'calculator/minus?num1=12&num2=6'>12-6 </a> " +
                        "<br> <a href= 'calculator/minus?num1=7&num2=4'>7-4 </a> " +
                        "<br> <a href= 'calculator/minus?num1=4.6&num2=4'>4.6-4 </a>" +
                        "<br>" +
                    "</div>" +
                    "<div class='columns'>" +
                        "<a >Деление     </a>" +
                        "<br> <a href= 'calculator/div?num1=5&num2=8'>5/8 </a> " +
                        "<br> <a href= 'calculator/div?num1=12&num2=6'>12/6 </a> " +
                        "<br> <a href= 'calculator/div?num1=7&num2=4'>7/4 </a> " +
                        "<br> <a href= 'calculator/div?num1=4.6&num2=4'>4.6/4 </a>" +
                        "<br>" +
                    "</div>" +
                    "<div class='columns'>" +
                        "<a >Умножение     </a>" +
                        "<br> <a href= 'calculator/mult?num1=5&num2=8'>5*8 </a> " +
                        "<br> <a href= 'calculator/mult?num1=12&num2=6'>12*6 </a> " +
                        "<br> <a href= 'calculator/mult?num1=7&num2=4'>7*4 </a> " +
                        "<br> <a href= 'calculator/mult?num1=4.6&num2=4'>4.6*4 </a>" +
                        "<br>" +
                    "</div>" +
                "</div>";
    }

    @Override
    public String plus(Double num1, Double num2) {
        return "Сложение: "+checkNumber(num1, num2, "+");
    }

    @Override
    public String minus(Double num1, Double num2) {
        return "Вычитание: " +checkNumber(num1, num2, "-");
    }

    @Override
    public String div(Double num1, Double num2) {
        return "Деление: "+checkNumber(num1, num2, "/");
    }

    @Override
    public String mult(Double num1, Double num2) {
        return "Умножение: "+checkNumber(num1, num2, "*");
    }

    @Override
    public Double simvoleAndResult(Double num1, Double num2, String simbol) {
        double result = 0;
        switch (simbol) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
        }
        return result;
    }

    @Override
    public String checkNumber(Double num1, Double num2, String simvol) {
        if (num1 == null || num2 == null) {
            return "Вы указали не полное колличество данных";
        } else {
            return num1 + "+" + num2 + "=" + simvoleAndResult(num1, num2, simvol);
        }
    }

}
