package com.mpr.cursobatch.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientsTransaction {

  private String id;
  private String description;
  private Double value;

}