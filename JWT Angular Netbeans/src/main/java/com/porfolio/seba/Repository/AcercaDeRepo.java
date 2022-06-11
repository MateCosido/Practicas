
package com.porfolio.seba.Repository;

import com.porfolio.seba.Entity.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AcercaDeRepo extends JpaRepository <AcercaDe, Long>{
    
}