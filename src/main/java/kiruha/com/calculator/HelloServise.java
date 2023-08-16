package kiruha.com.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HelloServise {

    public  String welcome() {
        return "<div>Добро пожаловать в <a href='/calculator'>калькулятор</a><div>";
    }
}
