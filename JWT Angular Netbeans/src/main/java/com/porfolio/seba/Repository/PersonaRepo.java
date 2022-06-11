
package com.porfolio.seba.Repository;

import com.porfolio.seba.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepo extends JpaRepository <Persona, Long> {
    
}