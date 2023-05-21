package org.launchcode.spaday.controllers;


import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/index")
    public String user(){
        return "user/index.html";
    }
    @GetMapping("/add")
    public String displayAddUserForm(){
    return "user/add";

    }

    @PostMapping("/add")
        public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        // add form submission handling code here
        if(user.getPassword().equals(verify)){
            return "redirect:";
        }
        model.addAttribute("username", user.getUsername());

        return "user/add";
        }

    }



