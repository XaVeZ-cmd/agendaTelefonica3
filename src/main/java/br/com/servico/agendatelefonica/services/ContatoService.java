package br.com.servico.agendatelefonica.services;

import java.util.List;

import br.com.servico.agendatelefonica.services.impl.dto.ContatosDTO;

public interface ContatoService {
    
    List<ContatosDTO> listarContato();
   /* Contatos salvarContato(Contatos contato);
    Contatos buscarContato(Long id);
    void deletarContato(Long id);
    Contatos atualizarContato(Contatos contato);*/
}
