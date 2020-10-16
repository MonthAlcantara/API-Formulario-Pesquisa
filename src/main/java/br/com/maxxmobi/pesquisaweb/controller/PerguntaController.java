package br.com.maxxmobi.pesquisaweb.controller;

import br.com.maxxmobi.pesquisaweb.model.entity.Pergunta;
import br.com.maxxmobi.pesquisaweb.service.interfaces.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/perguntas")
public class PerguntaController {

    @Autowired
    PerguntaService perguntaService;

    @GetMapping("admin")
    public Page<Pergunta> buscaTodasPerguntas(@PageableDefault(size = 20) Pageable pageable){
        return perguntaService.buscaTodasPerguntas(pageable);
    }

    @GetMapping("admin/{id}")
    public Pergunta buscaPerguntaPeloId(@PathVariable("id") Long id){
        return perguntaService.buscaPerguntaPeloId(id);
    }

    @PostMapping("admin")
    public Pergunta salvaPergunta(@RequestBody Pergunta pergunta){
        return perguntaService.adicionaNovaPergunta();
    }

    @PutMapping("admin/{id}")
    public Pergunta atualizaPerguntaPeloId(@PathVariable("id") Long id){
        return perguntaService.atualizaPerguntaPeloId(id);
    }

    @DeleteMapping("admin/{id}")
    public Pergunta deletePerguntaPeloId(@PathVariable("id") Long id){
        return perguntaService.deletePerguntaPeloId(id);
    }

}
