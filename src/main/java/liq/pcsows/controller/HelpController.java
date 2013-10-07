package liq.pcsows.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import liq.pcsows.domain.About;

@Controller
@RequestMapping("help")
public class HelpController {
    
    @RequestMapping("about")
    @ResponseBody
    public About about() {
        About returnValue = new About();
        about.setInfo("Web Service wrapper of PCSO (http://www.pcso.gov.ph/)");
        about.setVersion("0.1");
        return returnValue;
    }
}