package br.gov.sp.educjandira.educ.GestaoServidores;

import br.gov.sp.educjandira.educ.GestaoServidores.model.Servidor;
import br.gov.sp.educjandira.educ.GestaoServidores.service.ServidorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servidor")
public class ServidorResource {
    private final ServidorService servidorService;

    public ServidorResource(ServidorService servidorService) {
        this.servidorService = servidorService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Servidor>> getAllServidores () {
        List<Servidor> servidores = servidorService.findAllServidores();
        return new ResponseEntity<>(servidores, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Servidor> getServidorById (@PathVariable("id") Long id) {
        Servidor servidor = servidorService.findServidorById(id);
        return new ResponseEntity<>(servidor, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Servidor> addServidor(@RequestBody Servidor servidor) {
        Servidor newServidor = servidorService.addServidor(servidor);
        return new ResponseEntity<>(newServidor, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Servidor> updateServidor(@RequestBody Servidor servidor) {
        Servidor updateServidor = servidorService.updateServidor(servidor);
        return new ResponseEntity<>(updateServidor, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteServidor(@PathVariable("id") Long id) {
        servidorService.deleteServidor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
