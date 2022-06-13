
package com.porfolio.seba.Repository;

import com.porfolio.seba.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository <Usuario, Long> {
    
}