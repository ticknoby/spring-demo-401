package com.example.demo401;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/response")
public class ResponseController {

  @GetMapping("/200")
  public ResponseEntity<?> respond200() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping("/401")
  public ResponseEntity<?> respond401() {
    return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
  }
  
}
