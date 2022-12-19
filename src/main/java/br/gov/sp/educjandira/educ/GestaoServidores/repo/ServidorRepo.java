package br.gov.sp.educjandira.educ.GestaoServidores.repo;

import br.gov.sp.educjandira.educ.GestaoServidores.model.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServidorRepo extends JpaRepository<Servidor, Long> {
    void deleteServidorById(Long id);

    Optional<Servidor> findServidorById(Long id);
}

