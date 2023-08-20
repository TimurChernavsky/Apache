package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class controller {
    @RequestMapping("/")
    public String showFirstView() {
        return "myView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeeDetails(Model model) {
       model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }
    @RequestMapping("ahowDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee employee){
        return "show-emp-details-view";
    }
}
