package br.com.servico.agendatelefonica.services;

import java.util.List;

import br.com.servico.agendatelefonica.models.Contatos;

public interface ContatoService {
    
    List<Contatos> listarContato();
    Contatos salvarContato(Contatos contato);
    Contatos buscarContato(Long id);
    void deletarContato(Long id);
    Contatos atualizarContato(Contatos contato);
}
