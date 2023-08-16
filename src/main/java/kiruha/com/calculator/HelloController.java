package kiruha.com.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloServise helloServise;

    public HelloController(HelloServise helloServise) {
        this.helloServise = helloServise;
    }
    @GetMapping
    public String startPage() {
        return helloServise.welcome();
    }


}
