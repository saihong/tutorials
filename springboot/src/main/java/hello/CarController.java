package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping("/all")
    public String all(@RequestParam(value="name", required=true) String name) {
        return "Hello "+name ;
    }

    @GetMapping("/home")
    public String home(@RequestParam String name) {
        return "Welcome to home !! "+name ;
    }
}