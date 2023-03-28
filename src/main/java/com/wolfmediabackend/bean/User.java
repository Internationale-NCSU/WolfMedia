package com.wolfmediabackend.bean;

public class User {
    private Integer listenerId;

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private String statusOfSubscription;

    public Integer getListenerId() {
        return listenerId;
    }

    public void setListenerId(Integer listenerId) {
        this.listenerId = listenerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getStatusOfSubscription() {
        return statusOfSubscription;
    }

    public void setStatusOfSubscription(String statusOfSubscription) {
        this.statusOfSubscription = statusOfSubscription == null ? null : statusOfSubscription.trim();
    }
}