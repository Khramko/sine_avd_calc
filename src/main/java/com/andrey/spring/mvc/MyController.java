package com.andrey.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;


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

    @RequestMapping("showResult")
    public String showResult(@Valid @ModelAttribute("sineForm") SineForm sineForm
            , BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-frequency-acceleration-view";
        } else {

            double velocity = sineForm.calculateVelocity();
            double displacement = sineForm.calculateDisplacement();
            sineForm.setVelocity(velocity);
            sineForm.setDisplacement(displacement);

            return "show-result-view";
        }
    }


}
