package br.com.ivanfsilva.mymoney.repository;

import br.com.ivanfsilva.mymoney.model.Lancamento;
import br.com.ivanfsilva.mymoney.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
