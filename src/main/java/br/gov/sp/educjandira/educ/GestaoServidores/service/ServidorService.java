package br.gov.sp.educjandira.educ.GestaoServidores.service;

import br.gov.sp.educjandira.educ.GestaoServidores.exception.UserNotFoundException;
import br.gov.sp.educjandira.educ.GestaoServidores.model.Servidor;
import br.gov.sp.educjandira.educ.GestaoServidores.repo.ServidorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServidorService {
    private final ServidorRepo servidorRepo;

    @Autowired
    public ServidorService(ServidorRepo servidorRepo) {
        this.servidorRepo = servidorRepo;
    }

    public Servidor addServidor(Servidor servidor) {
        servidor.setCodigoServidor(UUID.randomUUID().toString());
        return servidorRepo.save(servidor);
    }

    public List<Servidor> findAllServidores() {
        return servidorRepo.findAll();
    }

    public Servidor updateServidor(Servidor servidor) {
        return servidorRepo.save(servidor);
    }

    public Servidor findServidorById(Long id) {
        return servidorRepo.findServidorById(id).
                orElseThrow(() -> new UserNotFoundException("Usuário com o id " + id + " não foi encontrado"));
    }

    public void deleteServidor(Long id) {
        servidorRepo.deleteServidorById(id);
    }
}
