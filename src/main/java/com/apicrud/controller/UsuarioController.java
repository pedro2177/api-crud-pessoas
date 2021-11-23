package com.apicrud.controller;

import com.apicrud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @GetMapping(path = "/api-crud/ID={id}")
    public String consultById(@PathVariable("id") Integer id){
        return null;
    }

}
