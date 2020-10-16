package br.com.maxxmobi.pesquisaweb.service.interfaces;

import br.com.maxxmobi.pesquisaweb.model.dto.UsuarioDTO;
import br.com.maxxmobi.pesquisaweb.model.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UsuarioService {

    Usuario adicionaNovoUsuario(UsuarioDTO usuarioDTO);

    void excluiUsuario(Long id);

    Page<UsuarioDTO> buscaTodosUsuarios(Pageable pageable);

    UsuarioDTO buscaUsuarioPeloCpf(String cpf);
}
