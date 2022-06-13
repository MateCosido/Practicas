
package com.porfolio.seba.Controller;

import com.porfolio.seba.Entity.AcercaDe;
import com.porfolio.seba.Services.AcercaDeService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/about")
@CrossOrigin(origins = "*")
public class AcercaDeController {
    private final AcercaDeService acercaDeService;
    
    public AcercaDeController (AcercaDeService acercaDeService){
    this.acercaDeService =acercaDeService;
    }
    @GetMapping("/all")
    public ResponseEntity <List<AcercaDe>> obtenerAcercaDe(){
        List<AcercaDe> acercaDe = acercaDeService.buscarAcercaDe();
        return new ResponseEntity<>(acercaDe, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<AcercaDe> editarAcercaDe(@RequestBody AcercaDe acercaDe) {
        AcercaDe updateAcercaDe = acercaDeService.editarAcercaDe(acercaDe);
        return new ResponseEntity<>(updateAcercaDe, HttpStatus.OK);
    }
    
    
}