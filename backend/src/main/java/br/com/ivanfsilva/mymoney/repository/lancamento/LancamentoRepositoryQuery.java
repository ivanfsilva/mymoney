package br.com.ivanfsilva.mymoney.repository.lancamento;

import br.com.ivanfsilva.mymoney.model.Lancamento;
import br.com.ivanfsilva.mymoney.repository.filter.LancamentoFilter;
import br.com.ivanfsilva.mymoney.repository.projection.ResumoLancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRepositoryQuery {

    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
    public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
