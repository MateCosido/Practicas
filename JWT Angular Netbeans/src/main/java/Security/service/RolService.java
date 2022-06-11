
package Security.service;

import Security.entity.Rol;
import Security.enume.RolNombre;
import Security.repo.RolRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepo rolRepo;
    
    public Optional<Rol> getByeRolNombre(RolNombre rolNombre){
        return rolRepo.findByRolNombre(rolNombre);
    }
    
    
}
