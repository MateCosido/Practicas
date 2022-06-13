
package com.porfolio.seba.Services;

import com.porfolio.seba.Entity.AcercaDe;
import com.porfolio.seba.Repository.AcercaDeRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AcercaDeService {

    private final AcercaDeRepo acercaDeRepo;

    @Autowired
    public AcercaDeService(AcercaDeRepo acercaDeRepo) {
        this.acercaDeRepo = acercaDeRepo;
    }

    public AcercaDe addAcercaDe(AcercaDe acercaDe) {
        return acercaDeRepo.save(acercaDe);
    }

    public List<AcercaDe> buscarAcercaDe() {
        return acercaDeRepo.findAll();
    }

    public AcercaDe editarAcercaDe(AcercaDe acercaDe) {
        return acercaDeRepo.save(acercaDe);
    }

}