package com.js.ls.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

  private long id;
  private String username;
  private String mobile;
  private String password;
  private String email;
  private long status;
}
