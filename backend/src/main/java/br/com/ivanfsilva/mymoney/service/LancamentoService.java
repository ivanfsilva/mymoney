package br.com.ivanfsilva.mymoney.service;

import java.util.Optional;

import br.com.ivanfsilva.mymoney.model.Lancamento;
import br.com.ivanfsilva.mymoney.model.Pessoa;
import br.com.ivanfsilva.mymoney.repository.LancamentoRepository;
import br.com.ivanfsilva.mymoney.repository.PessoaRepository;
import br.com.ivanfsilva.mymoney.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
        if (pessoa.isEmpty() || pessoa.get().isInativo()) {
            throw new PessoaInexistenteOuInativaException();
        }

        return lancamentoRepository.save(lancamento);
    }

}
