/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;


import com.example.model.generic.GenericAbstractClass;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author prabin
 */
@Entity(name = "tbl_user")
@Table(name = "tbl_user")
public class User extends GenericAbstractClass {

    @Column(name = "user_name", nullable = false, length = 50, unique = true)
    private String userName;
    @Column(name = "full_name", nullable = false, length = 50)
    private String fullName;
    @Column(name = "email_address", nullable = false, length = 50, unique = true)
    private String emailAddress;
    @Column(nullable = false)
    private String password;

    public User() {
    }

    public User(Long id, String userName, String fullName, String emailAddress, String password) {
        this.setId(id);
        this.userName = userName;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
