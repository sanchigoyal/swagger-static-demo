package com.sanchi.java.spring.swagger.swaggerstaticdemo.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class User {

  private int userId;

  @ApiModelProperty(value = "User's first name", required = true)
  private String firstName;

  @ApiModelProperty(value = "User's last name")
  private String lastName;

  @ApiModelProperty(value = "User's phone number")
  private String phoneNumber;

  @ApiModelProperty(value = "User's array of addresses", required = true)
  private List<Address> addresses;

  public User(int userId, String firstName, String lastName, String phoneNumber,
      List<Address> addresses) {
    this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.addresses = addresses;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }
}
