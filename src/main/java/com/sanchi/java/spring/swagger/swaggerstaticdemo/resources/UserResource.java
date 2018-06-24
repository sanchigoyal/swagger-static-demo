package com.sanchi.java.spring.swagger.swaggerstaticdemo.resources;

import com.sanchi.java.spring.swagger.swaggerstaticdemo.model.User;
import com.sanchi.java.spring.swagger.swaggerstaticdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "Users", description = "Operations about user.")
@RestController
@RequestMapping("/users")
public class UserResource {

  @Autowired
  private UserService service;

  @ApiOperation(value = "Get all users in the database",
      notes = "This operation returns all users from the database.")
  @RequestMapping(
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public List<User> getAllUsers() {
    return service.getAllUsers();
  }

  @ApiOperation(value = "Get a user for the provided identifier",
      notes = "This operation returns a single user matching "
          + "the provided identifier.")
  @RequestMapping(
      value = "/{user-id}",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public User getUser(@PathVariable("user-id") int userId) {
    return service.getUser(userId);
  }
}
