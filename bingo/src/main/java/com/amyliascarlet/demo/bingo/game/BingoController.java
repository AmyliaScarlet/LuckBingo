package com.amyliascarlet.demo.bingo.game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BingoController {

    @GetMapping("/")
    public ModelAndView Index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("bingo");
        //modelAndView.addObject("bingo_obj", new Bingo());
        return modelAndView;
    }

}
