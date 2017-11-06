package com.example.sisillia.bikebank.model;

/**
 * Created by Sisillia on 11/4/2017.
 */

public class UserModel {

    public Boolean smoker;
    public Integer age;
    public String gender;
    public Boolean heart_disease;
    public String username;
    public String email;

    public UserModel(Boolean smoker, Integer age, String gender, Boolean heart_disease, String username, String email){
        this.smoker = smoker;
        this.age = age;
        this.gender = gender;
        this.heart_disease = heart_disease;
        this.username = username;
        this.email = email;
    }

    public UserModel(){

    }

    public Integer getHeart_disease() {
        if(heart_disease){
            return 1;
        }else{
            return 0;
        }
    }

    public Integer getSmoker() {
        if(smoker){
            return 1;
        }
        else{
            return 0;
        }
    }

    public Integer getAge() {
        int val = (age - 8)/67;
        return val;
    }

    public Integer getGender() {
        if (gender.equalsIgnoreCase("male")){
            return 1;
        }
        else{
            return 0;
        }
    }

    public String getUsername(){
        return this.username;
    }
}
