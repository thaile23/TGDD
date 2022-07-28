package com.project.TGDD.Repository;

import com.project.TGDD.Model.LoginAD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginAD, Long>{
    LoginAD findByUsernameAndPassword(String username, String password);

}