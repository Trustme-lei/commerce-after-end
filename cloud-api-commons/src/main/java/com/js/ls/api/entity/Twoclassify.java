package com.js.ls.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Twoclassify implements Serializable {

  private long id;
  private String name;
  private long oneclassifyId;
  private List<Threeclassify> threeclassifies = new ArrayList<Threeclassify>();

}
