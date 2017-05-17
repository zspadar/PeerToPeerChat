package com.greenfox.peertopeerchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



/**
 * Created by zsuzsanna.padar on 2017. 05. 17..
 */
@Controller
public class PeerToPeerChatController {

  @GetMapping(value = "/")
  public String getHomePage(){
    return "index";
  }



}
