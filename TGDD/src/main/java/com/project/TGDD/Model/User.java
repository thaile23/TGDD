package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer numberPhone;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer gender;

    @Column(nullable = false)
    private String address;

    public User() {
    }

    public User(Integer numberPhone, String name, Integer gender, String address) {
        this.numberPhone = numberPhone;
        this.name = name;
        this.gender = gender;
        this.address = address;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
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
        return "User{" +
                "numberPhone=" + numberPhone +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
