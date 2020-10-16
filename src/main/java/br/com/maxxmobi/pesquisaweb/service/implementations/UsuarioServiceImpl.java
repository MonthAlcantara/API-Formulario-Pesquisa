package br.com.maxxmobi.pesquisaweb.service.implementations;

import br.com.maxxmobi.pesquisaweb.model.dto.UsuarioDTO;
import br.com.maxxmobi.pesquisaweb.model.entity.Usuario;
import br.com.maxxmobi.pesquisaweb.service.interfaces.UsuarioService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Override
    public Usuario adicionaNovoUsuario(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public void excluiUsuario(Long id) {

    }

    @Override
    public Page<UsuarioDTO> buscaTodosUsuarios(Pageable pageable) {
        return null;
    }

    @Override
    public UsuarioDTO buscaUsuarioPeloCpf(String cpf) {
        return null;
    }
}
