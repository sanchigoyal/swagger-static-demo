package com.sanchi.java.spring.swagger.swaggerstaticdemo.service;

import com.sanchi.java.spring.swagger.swaggerstaticdemo.model.Address;
import com.sanchi.java.spring.swagger.swaggerstaticdemo.model.AddressType;
import com.sanchi.java.spring.swagger.swaggerstaticdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  private static List<User> users = new ArrayList<>();

  static {
    Address primary = new Address(
        "1xxxx MxxxxxS Ln",
        "",
        "San Diego",
        "California",
        "United States",
        "92128",
        AddressType.PRIMARY
    );
    Address secondary = new Address(
        "2xxx FxxxxM Rd",
        "",
        "San Antonio",
        "Texas",
        "United States",
        "78250",
        AddressType.SECONDARY
    );

    List<Address> addresses = new ArrayList<>();
    addresses.add(primary);
    addresses.add(secondary);

    User james = new User(
        1,
        "James",
        "Brown",
        "123456789",
        addresses
    );

    User rob = new User(
        2,
        "Rob",
        "Stewart",
        "123456789",
        addresses
    );

    users.add(james);
    users.add(rob);
  }

  public List<User> getAllUsers() {
    return users;
  }

  public User getUser(int userId) {
    for (User user : users) {
      if (user.getUserId() == userId) {
        return user;
      }
    }
    return null;
  }
}
