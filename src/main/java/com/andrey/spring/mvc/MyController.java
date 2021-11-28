package com.andrey.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
    @RequestMapping("/askFrequencyAcceleration")
    public String askFrequencyAcceleration(Model model){
        model.addAttribute("initialData", new InitialData());
        return "ask-frequency-acceleration-view";
    }

    @RequestMapping("showDisplacement")
    public String showDisplacement(@ModelAttribute("initialData") InitialData initialData){
    double frequency = initialData.getFrequency();

    double acceleration = initialData.getAcceleration();
    double accelerationUnit = initialData.getAccelerationUnit();
    //double velocity =
    double displacement = acceleration*1000*accelerationUnit/(Math.pow(2*3.14159265359*frequency,2));
    initialData.setDisplacement(displacement);

        return "show-displacement-view";
    }


}
