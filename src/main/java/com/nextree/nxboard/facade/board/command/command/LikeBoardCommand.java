package com.nextree.nxboard.facade.board.command.command;

import lombok.Getter;

@Getter
public class LikeBoardCommand {
  //
  private String userId;
  private String boardId;
}
