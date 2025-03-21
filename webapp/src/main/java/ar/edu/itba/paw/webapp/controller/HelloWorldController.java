package ar.edu.itba.paw.webapp.controller;

import ar.edu.itba.paw.interfaces.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    private UserService us;

    @RequestMapping("/")
    public ModelAndView helloWorld() {
        final ModelAndView mav = new ModelAndView("helloworld/index");
        mav.addObject("greeting", "PAW");
        return mav;
    }

    @RequestMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("helloworld/register");
    }
}