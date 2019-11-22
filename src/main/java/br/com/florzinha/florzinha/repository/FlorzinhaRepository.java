package br.com.florzinha.florzinha.repository;

import br.com.florzinha.florzinha.model.Florzinha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlorzinhaRepository extends JpaRepository<Florzinha, Long> {
    List<Florzinha> findByNome(String nome);
    List<Florzinha> findByCor(String cor);
}
