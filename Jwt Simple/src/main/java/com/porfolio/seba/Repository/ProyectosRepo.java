
package com.porfolio.seba.Repository;

import com.porfolio.seba.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepo extends JpaRepository <Proyectos, Long>{
    
}