package br.com.ivanfsilva.mymoney.repository;

import br.com.ivanfsilva.mymoney.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
