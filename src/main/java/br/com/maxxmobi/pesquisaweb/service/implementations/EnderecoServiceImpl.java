package br.com.maxxmobi.pesquisaweb.service.implementations;

import br.com.maxxmobi.pesquisaweb.model.dto.EnderecoDTO;
import br.com.maxxmobi.pesquisaweb.service.interfaces.EnderecoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {
    @Override
    public Page<EnderecoDTO> buscaTodosEnderecos(Pageable pageable) {
        return null;
    }

    @Override
    public EnderecoDTO adicionaNovoEndereco(EnderecoDTO enderecoDTO) {
        return null;
    }

    @Override
    public void excluiEndereco(Long id) {

    }
}
