package br.com.servico.agendatelefonica.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.servico.agendatelefonica.services.impl.dto.UsuarioDTO;

@Service
public interface UsuarioService {

    List<UsuarioDTO> listarTodos();

    void inserir(UsuarioDTO usuario);

    UsuarioDTO alterar(UsuarioDTO usuario);

    void excluir(Long id);

}
