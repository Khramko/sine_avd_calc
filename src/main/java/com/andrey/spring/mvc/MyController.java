package com.andrey.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
    @RequestMapping("/askFrequencyAcceleration")
    public String askFrequencyAcceleration(){
        return "ask-frequency-acceleration-view";
    }
//    @RequestMapping("showDisplacement")
//    public String showDisplacement(){
//        return "show-displacement-view";
//    }

    @RequestMapping("showDisplacement")
    public String showDisplacement(HttpServletRequest request, Model model){
        String frequency = request.getParameter("frequency");
        String acceleration = request.getParameter("acceleration");
        Double newFrequency = Double.parseDouble(frequency);
        model.addAttribute("frequencyAttribute", newFrequency);
        return "show-displacement-view";
    }


}
