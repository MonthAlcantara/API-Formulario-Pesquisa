package br.com.maxxmobi.pesquisaweb.service.interfaces;

import br.com.maxxmobi.pesquisaweb.model.entity.Pergunta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PerguntaService {
    Page<Pergunta> buscaTodasPerguntas(Pageable pageable);

    Pergunta buscaPerguntaPeloId(Long id);

    Pergunta adicionaNovaPergunta();

    Pergunta atualizaPerguntaPeloId(Long id);

    Pergunta deletePerguntaPeloId(Long id);
}
