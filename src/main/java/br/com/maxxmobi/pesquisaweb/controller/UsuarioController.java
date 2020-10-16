package br.com.maxxmobi.pesquisaweb.controller;

import br.com.maxxmobi.pesquisaweb.model.dto.UsuarioDTO;
import br.com.maxxmobi.pesquisaweb.model.entity.Usuario;
import br.com.maxxmobi.pesquisaweb.service.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("admin")
    public Page<UsuarioDTO> buscaTodosUsuarios(Pageable pageable){
        return usuarioService.buscaTodosUsuarios(pageable);
    }

    @GetMapping("admin/cpf/{cpf}")
    public UsuarioDTO buscaTodosUsuariosPeloCpf(@PathVariable("cpf") String cpf, Pageable pageable){
        return usuarioService.buscaUsuarioPeloCpf(cpf);
    }

    @PostMapping
    public Usuario salvaUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO){
        return usuarioService.adicionaNovoUsuario(usuarioDTO);
    }

    @DeleteMapping("admin/{id}")
    public void excluiUsuario(@PathVariable("id") Long id){
        usuarioService.excluiUsuario(id);
    }
}
