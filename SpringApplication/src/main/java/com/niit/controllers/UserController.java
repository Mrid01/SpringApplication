package com.niit.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.models.User;
import com.niit.services.UserService;

 

@Controller

public class UserController {

@Autowired

private UserService userService;

@GetMapping(value = "/user")

public ModelAndView showForm() {

	
    return new ModelAndView("login", "user", new User());

}

 

@RequestMapping("/allUsers")

public String listUsers(Model model)

{

                model.addAttribute("user", new User());

                model.addAttribute("listUsers",userService.getAllUsers());

                return "userList";

}

 

 

@PostMapping("/user/add")

public String addUser(@ModelAttribute("user") User u)

{

                userService.addUser(u);

//            if(u.getUserId() == 0)

//            {

//                            userService.addUser(u);

//            }

//            else

//            {

//                            userService.updateUser(u);

//            }

                return "redirect:/allUsers";

}

}