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
        Double frequencyDouble = Double.parseDouble(frequency);
        Double accelerationDouble = Double.parseDouble(acceleration);
        Double displacementDouble = accelerationDouble*9780/(Math.pow(2*3.14159265359*frequencyDouble,2));
        model.addAttribute("displacementAttribute", displacementDouble);
        return "show-displacement-view";
    }


}
