package com.js.ls.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：雷升
 * @date ：Created in 2020/4/29 0:57
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classifygather {
  private long one_id;
  private String one_name;
  private long two_id;
  private String two_name;
  private long oneclassifyId;
  private long three_id;
  private String three_name;
  private String imgurl;
}
