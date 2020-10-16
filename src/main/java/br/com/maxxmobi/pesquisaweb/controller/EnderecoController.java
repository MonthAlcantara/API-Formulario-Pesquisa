package br.com.maxxmobi.pesquisaweb.controller;

import br.com.maxxmobi.pesquisaweb.model.dto.EnderecoDTO;
import br.com.maxxmobi.pesquisaweb.service.interfaces.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/enderecos")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @PostMapping
    public EnderecoDTO salvaEndereco(@RequestBody @Valid EnderecoDTO enderecoDTO){
        return enderecoService.adicionaNovoEndereco(enderecoDTO);
    }

    @GetMapping("admin")
    public Page<EnderecoDTO> busqueTodosEnderecos(@PageableDefault(size = 20) Pageable pageable) {
        return enderecoService.buscaTodosEnderecos(pageable);
    }

    @DeleteMapping("admin/{id}")
    public void excluiUsuario(@PathVariable("id") Long id){
        enderecoService.excluiEndereco(id);
    }
}
