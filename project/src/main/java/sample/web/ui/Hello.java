package sample.web.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hevilavio on 10/6/15.
 */
@Controller
public class Hello {


    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
}
