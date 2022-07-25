package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, length = 30)
    private String adminName;
    @Column(nullable = false, length = 20)
    private String passWord;


    public Admin(String adminName, String passWord) {
        this.adminName = adminName;
        this.passWord = passWord;
    }

    public Admin() {

    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
