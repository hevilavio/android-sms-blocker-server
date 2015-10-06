package net.hevilavio.api;

import net.hevilavio.model.Sms;
import net.hevilavio.repository.SmsRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hevilavio on 10/6/15.
 */
@RestController
@RequestMapping("/sms")
public class SmsStatisticsApi {

    private static Logger logger = LoggerFactory.getLogger(SmsStatisticsApi.class);

    @Autowired
    private SmsRepository smsRepository;

    @RequestMapping(value = "/teste", method = RequestMethod.POST, headers = "Content-Type=application/json")
    public @ResponseBody String smsReceived(@RequestBody(required = false) Sms sms){

        logger.info("sms recebido, sms={}", sms);

        smsRepository.save(sms);

        logger.info("sms salvo, sms={}", sms);

        return "OK";
    }

}
