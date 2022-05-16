package br.com.ivanfsilva.mymoney.repository;

import br.com.ivanfsilva.mymoney.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
