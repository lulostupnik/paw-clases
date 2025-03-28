package ar.edu.itba.paw.webapp.controller;

import ar.edu.itba.paw.interfaces.UserService;
import ar.edu.itba.paw.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    private final UserService us;

    @Autowired
    public HelloWorldController(final UserService us){
        this.us = us;
    }

    @RequestMapping("/")
    public ModelAndView index(@RequestParam(value = "userId", required = true) final int id) {
            final ModelAndView mav = new ModelAndView("/helloworld/index");
            mav.addObject("user", us.findById(id));
            return mav;
    }
    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "name", required = true) final String username) {
            final User u = us.create(username);
            return new ModelAndView("redirect:/?userId=" + u.getUserId());
            }
}
