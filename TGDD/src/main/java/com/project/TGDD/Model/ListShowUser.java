package com.project.TGDD.Model;

import java.util.ArrayList;
import java.util.List;

public class ListShowUser {
    private Integer id;
    private Integer numberPhone;
    private String name;
    private String gender;
    private String address;

    public ListShowUser() {
    }
    public ListShowUser(Integer id,Integer numberPhone, String name, String gender, String address) {
        this.id = id;
        this.numberPhone = numberPhone;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Integer numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ListShowUser{" +
                "id=" + id +
                ", numberPhone=" + numberPhone +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
