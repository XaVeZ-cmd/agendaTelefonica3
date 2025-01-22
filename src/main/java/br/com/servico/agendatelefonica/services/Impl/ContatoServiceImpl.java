package br.com.servico.agendatelefonica.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.servico.agendatelefonica.models.Contatos;
import br.com.servico.agendatelefonica.repository.ContatoRepository;
import br.com.servico.agendatelefonica.services.ContatoService;

@Service
public class ContatoServiceImpl implements ContatoService {
    
    @Autowired
    private ContatoRepository contatoRepository;

    @Override
    public List<Contatos> listarContato() {
        return contatoRepository.findAll();
    }
    @Override
    public Contatos salvarContato(Contatos contato) {
        return contatoRepository.save(contato);
    }
    @Override
    public Contatos buscarContato(Long id) {
        return contatoRepository.findById(id).get();
    }
    @Override
    public void deletarContato(Long id) {
        contatoRepository.deleteById(id);
    }
    @Override
    public Contatos atualizarContato(Contatos contato) {
        return contatoRepository.save(contato);
    }

}