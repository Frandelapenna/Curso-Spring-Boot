package com.cursoSpringBoot.Curso.Spring.Boot.dao;

import com.cursoSpringBoot.Curso.Spring.Boot.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);
}
