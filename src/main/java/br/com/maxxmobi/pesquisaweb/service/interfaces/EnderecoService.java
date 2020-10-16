package br.com.maxxmobi.pesquisaweb.service.interfaces;

import br.com.maxxmobi.pesquisaweb.model.dto.EnderecoDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EnderecoService {
    Page<EnderecoDTO> buscaTodosEnderecos(Pageable pageable);

    EnderecoDTO adicionaNovoEndereco(EnderecoDTO enderecoDTO);

    void excluiEndereco(Long id);
}
