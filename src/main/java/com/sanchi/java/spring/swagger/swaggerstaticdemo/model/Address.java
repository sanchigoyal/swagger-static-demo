package com.sanchi.java.spring.swagger.swaggerstaticdemo.model;

import io.swagger.annotations.ApiModelProperty;

public class Address {

  @ApiModelProperty(value = "Address line 1", required = true)
  private String addressLine1;
  @ApiModelProperty(value = "Address line 2")
  private String addressLine2;
  @ApiModelProperty(value = "User's city of residence", required = true)
  private String city;
  @ApiModelProperty(value = "User's state of residence", required = true)
  private String state;
  @ApiModelProperty(value = "User's country of residence", required = true)
  private String country;
  @ApiModelProperty(value = "User's zip code of residence", required = true)
  private String zipCode;
  @ApiModelProperty(value = "Type of address", required = true)
  private AddressType addressType;

  public Address(String addressLine1, String addressLine2, String city,
      String state,
      String country, String zipCode, AddressType addressType) {
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.city = city;
    this.state = state;
    this.country = country;
    this.zipCode = zipCode;
    this.addressType = addressType;
  }

  public AddressType getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressType addressType) {
    this.addressType = addressType;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
}
