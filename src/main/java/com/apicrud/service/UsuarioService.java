package com.apicrud.service;

import com.apicrud.dto.Usuario;
import com.apicrud.repositories.UsuarioRepository;

import java.util.Optional;

public class UsuarioService {

    UsuarioRepository usuario;

    public Usuario consultById(Integer id){

        if(id > 0){
            return usuario.findById(id).orElse(null);
        } else {
            return null;
        }
    }
}
