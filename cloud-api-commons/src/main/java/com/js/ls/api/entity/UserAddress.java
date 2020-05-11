package com.js.ls.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress implements Serializable {

  private long id;
  private long userId;
  private String username;
  private String mobile;
  private String province;
  private String city;
  private String district;
  private String address;
  private String street;
  private long defaultz;
  private long status;
}
