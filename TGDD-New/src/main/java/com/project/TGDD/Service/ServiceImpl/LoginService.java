package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Model.LoginAD;
import com.project.TGDD.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository repo;

    public LoginAD login(String username, String password) {
        LoginAD user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
}
