package com.password.main.service;

import com.password.main.model.Password;
import com.password.main.repository.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// tells spring to create bean/object of class at startup and inject where necessary, @Autowired
@Service
public class PasswordService {

    @Autowired
    PasswordRepository passwordRepository;

    public Password findPasswordByEmployeeId(int employee_id){
        Password password = passwordRepository.findByEmployeeId(employee_id);
        // TODO: call method to send password via SendSafely
        // TODO: call method to send text via Twilio for US
        return password;
    }
/*
create form that prompts for phone number for US new hires
 */
}
