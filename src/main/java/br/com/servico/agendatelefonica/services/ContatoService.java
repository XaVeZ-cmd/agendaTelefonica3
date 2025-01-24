package br.com.servico.agendatelefonica.services;

import java.util.List;

import br.com.servico.agendatelefonica.services.impl.dto.ContatoDTO;

public interface ContatoService {
    
    List<ContatoDTO> listarContato();
    ContatoDTO salvarContato(ContatoDTO contatoDTO);
    ContatoDTO buscarContatoNome(String nome) throws Exception;
    ContatoDTO buscarContatoId(Long id);
    void deletarContato(Long id);

   /* 
    Contatos buscarContato(Long id);
    void deletarContato(Long id);
    Contatos atualizarContato(Contatos contato);*/

}
