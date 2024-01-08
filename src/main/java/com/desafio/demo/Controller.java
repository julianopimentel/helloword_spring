package com.desafio.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Controller {

    //retornar hellowor.d em Json
    @GetMapping("/hello")
    public ResponseEntity<Response> helloWorld(){
        return ResponseEntity.ok(new Response("Hello World"));
    }

}
