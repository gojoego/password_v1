package com.password.main.controller;

import com.password.main.exception.PasswordNotFoundException;
import com.password.main.model.Password;
import com.password.main.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class PasswordWebController {

    @Autowired
    PasswordService passwordService;

    @GetMapping("/password/{id}")
    public String getPasswordById(@PathVariable(value = "id") String id, Model model){
        Integer i = Integer.parseInt(id);
        Password obj = passwordService.findPasswordByEmployeeId(i);
        model.addAttribute("password", obj.getPassword());
        return "test";
    }

}
