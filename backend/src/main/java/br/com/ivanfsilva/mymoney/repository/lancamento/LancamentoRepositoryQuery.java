package br.com.ivanfsilva.mymoney.repository.lancamento;

import br.com.ivanfsilva.mymoney.model.Lancamento;
import br.com.ivanfsilva.mymoney.repository.filter.LancamentoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LancamentoRepositoryQuery {

    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
