package kiruha.com.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
      private  CalculateService calculateService=new CalculateService();
//
//    public CalculateService(CalculateService calculateService) {
//        this.calculateService = calculateService;
//    }
    @GetMapping
    public String startPage() {
        return calculateService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculateService.plus(num1,num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculateService.minus(num1,num2);
    }

    @GetMapping(path = "/div")
    public String div(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculateService.div(num1,num2);
    }

    @GetMapping(path = "/mult")
    public String mult(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculateService.mult(num1,num2);
    }


}
