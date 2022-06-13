
package com.porfolio.seba.Repository;

import com.porfolio.seba.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillsRepo extends JpaRepository <Skills, Long> {
    
}