package vladek.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/test")
public class TestController {

    @GetMapping("/protected-data")
    public String getProtectedData() {
        return "Доступ к защищенному ресурсу";
    }
}
