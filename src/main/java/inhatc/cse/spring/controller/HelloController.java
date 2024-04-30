package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.PersonDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller //@RestController --> 클라이언트 별도
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(Model model){
        PersonDto person = new PersonDto("김용진", 20, 170.4);
        model.addAttribute("name", person);
        return "index";
    }
}
