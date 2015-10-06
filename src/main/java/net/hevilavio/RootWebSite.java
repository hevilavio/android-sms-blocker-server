package net.hevilavio;

import net.hevilavio.model.Sms;
import net.hevilavio.repository.SmsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hevilavio on 10/6/15.
 */
@Controller
public class RootWebSite {


    @Autowired
    private SmsRepository smsRepository;


    @RequestMapping("/")
    public String hello(Model model){
        StringBuilder content = new StringBuilder();

        try {
            Iterable<Sms> smss = smsRepository.findAll();
            for (Sms sms : smss) {
                content.append(sms.toString());
                content.append("</br>");
            }

        }catch (Exception e){
            content.append("Exception\n");
            content.append(e.getCause() + "\n" + e.getMessage());
        }

        model.addAttribute("content", content.toString());

        return "hello";
    }
}
