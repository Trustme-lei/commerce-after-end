package com.js.ls.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wares {

  private long id;
  private String ictures;
  private String headline;
  private double price;
  private long sellerId;



}
