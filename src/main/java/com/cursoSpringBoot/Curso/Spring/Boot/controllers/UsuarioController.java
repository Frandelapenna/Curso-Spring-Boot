package com.cursoSpringBoot.Curso.Spring.Boot.controllers;

import com.cursoSpringBoot.Curso.Spring.Boot.dao.UsuarioDao;
import com.cursoSpringBoot.Curso.Spring.Boot.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Franicsco");
        usuario.setApellido("Delapenna");
        usuario.setEmail("delapenna98@gmail.com");
        usuario.setTelefono("2284538398");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuario() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Franicsco");
        usuario.setApellido("Delapenna");
        usuario.setEmail("delapenna98@gmail.com");
        usuario.setTelefono("2284538398");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);

    }
    @RequestMapping(value = "usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Franicsco");
        usuario.setApellido("Delapenna");
        usuario.setEmail("delapenna98@gmail.com");
        usuario.setTelefono("2284538398");
        return usuario;
    }
}
