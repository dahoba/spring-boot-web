package xyz.dahoba;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by siritas_s on 4/13/2017 AD.
 */
@Controller
public class DemoController {

    @Value("${application.message: Hola there ?!}")
    private String message;

    @RequestMapping("/")
    public String login(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", message);
        return "index";
    }
}
