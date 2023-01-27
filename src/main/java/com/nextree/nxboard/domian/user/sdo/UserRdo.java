package com.nextree.nxboard.domian.user.sdo;

import com.nextree.nxboard.domian.user.vo.Follow;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRdo {
  private String id;
  private String userId;
  private String userName;
  private String signUpTime;
  private String description;
  private List<Follow> followers;
  private List<Follow> following;
  private List<String> bookmarks;
}
