package com.example.demo401;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/response")
public class ResponseController {

  @GetMapping("/200")
  public ResponseEntity<?> respond200() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PostMapping("/201")
  public ResponseEntity<?> respond201() {
    return new ResponseEntity<>(null, HttpStatus.CREATED);
  }

  @PutMapping("/204")
  @DeleteMapping("/204")
  public ResponseEntity<?> respond204() {
    return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
  }

  @GetMapping("/401")
  @PostMapping("/401")
  @PutMapping("/401")
  @DeleteMapping("/401")
  public ResponseEntity<?> respond401() {
    return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
  }
  
}
