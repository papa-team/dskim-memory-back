package com.nextree.nxboard.domian.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class User {
  //
  String userId;
  String userName;
  List<Follow> followers;
  List<Follow> following;
  String signUpTime;
}
