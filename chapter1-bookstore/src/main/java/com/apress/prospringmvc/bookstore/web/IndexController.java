package com.apress.prospringmvc.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller shows the index page.
 * 
 * @author Marten Deinum
 * @author Koen Serneels
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index.htm")
    public ModelAndView indexPage() {
        ModelAndView mav = new ModelAndView("/WEB-INF/views/index.jsp");
        mav.addObject("theModelKey", "Junias Spring says HI!");
        return mav;
    }
}
