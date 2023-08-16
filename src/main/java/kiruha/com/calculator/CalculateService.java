package kiruha.com.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculateService implements CalculateSirviceInterface{

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
    public String plus(String num1, String num2) {
        String result = "Сложение: " + num1 + "+" + num2 + "=" + (Double.parseDouble(num1) + Double.parseDouble(num2));
        return result;
    }
    @Override
    public String minus(String num1, String num2) {
        String result = "Вычтание: " + num1 + "+" + num2 + "=" + (Double.parseDouble(num1) - Double.parseDouble(num2));
        return result;
    }
    @Override
    public String div(String num1, String num2) {
        String result = "Деление: " + num1 + "+" + num2 + "=" + (Double.parseDouble(num1) / Double.parseDouble(num2));
        return result;
    }
    @Override
    public String mult(String num1, String num2) {
        String result = "Умножение: " + num1 + "+" + num2 + "=" + (Double.parseDouble(num1) * Double.parseDouble(num2));
        return checkNumber(num1, num2, result);
    }

    public String checkNumber(String num1, String num2, String result) {
        if (num1 != null || num2 != null) {
            return result;
        } else {
            return "Вы указали не полное колличество данных";

        }
    }

}
