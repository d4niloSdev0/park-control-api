package com.mballem.demo_park_api.repository;

import com.mballem.demo_park_api.enity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
