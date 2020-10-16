package br.com.maxxmobi.pesquisaweb.service.implementations;

import br.com.maxxmobi.pesquisaweb.model.entity.Pergunta;
import br.com.maxxmobi.pesquisaweb.service.interfaces.PerguntaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PerguntaServiceImpl implements PerguntaService {
    @Override
    public Page<Pergunta> buscaTodasPerguntas(Pageable pageable) {
        return null;
    }

    @Override
    public Pergunta buscaPerguntaPeloId(Long id) {
        return null;
    }

    @Override
    public Pergunta adicionaNovaPergunta() {
        return null;
    }

    @Override
    public Pergunta atualizaPerguntaPeloId(Long id) {
        return null;
    }

    @Override
    public Pergunta deletePerguntaPeloId(Long id) {
        return null;
    }
}
