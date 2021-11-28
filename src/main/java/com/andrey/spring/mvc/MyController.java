package com.andrey.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
    @RequestMapping("/askFrequencyAcceleration")
    public String askFrequencyAcceleration(Model model){
        model.addAttribute("sineForm", new SineForm());
        return "ask-frequency-acceleration-view";
    }

    @RequestMapping("showDisplacement")
    public String showDisplacement(@ModelAttribute("sineForm") SineForm sineForm){

    double velocity = sineForm.calculateVelocity();
    double displacement = sineForm.calculateDisplacement();
    sineForm.setVelocity(velocity);
    sineForm.setDisplacement(displacement);

        return "show-displacement-view";
    }


}
