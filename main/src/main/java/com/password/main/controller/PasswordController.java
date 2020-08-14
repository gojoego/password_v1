package com.password.main.controller;

import com.password.main.exception.PasswordNotFoundException;
import com.password.main.model.Password;
import com.password.main.repository.PasswordRepository;
import com.password.main.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {

    @Autowired
    PasswordRepository passwordRepository;

    @Autowired
    PasswordService passwordService;

    @GetMapping("/password/{employee_id}")
    public Password getPasswordById(@PathVariable(value = "employee_id") int employee_id)
            throws PasswordNotFoundException {
        return passwordService.findPasswordByEmployeeId(employee_id);
    }
}
