package com.Inspired.SpringBoot.Model;

import java.util.UUID;

public class User {

   public enum Gender{
        MALE, FEMALE
    }
    // User
    private UUID userUid;
    private String firstname;
    private String lastname;
    private Gender gender;
    private Integer age;
    private String email;

    public User() {
    }

    public User(UUID userUid, String firstname, String lastname, Gender gender, Integer age, String email) {
        this.userUid = userUid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }


    public UUID getUserUid() {
        return userUid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setUserUid(UUID userUid) {
        this.userUid = userUid;
    }

    @Override
    public String toString() {
        return "User{" +
                "userUid=" + userUid +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
