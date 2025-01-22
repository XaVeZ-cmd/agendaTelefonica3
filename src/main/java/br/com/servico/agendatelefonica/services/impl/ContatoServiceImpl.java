package br.com.servico.agendatelefonica.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.servico.agendatelefonica.models.Contatos;
import br.com.servico.agendatelefonica.repository.ContatoRepository;
import br.com.servico.agendatelefonica.services.ContatoService;
import br.com.servico.agendatelefonica.services.impl.dto.ContatosDTO;
import br.com.servico.agendatelefonica.services.impl.mapper.ContatoMapper;


@Service
public class ContatoServiceImpl implements ContatoService {
    
    @Autowired
    private ContatoRepository contatoRepository;

    private ContatoMapper contatoMapper;

    public ContatoServiceImpl(ContatoRepository contatoRepository, ContatoMapper contatoMapper) {
        this.contatoRepository = contatoRepository;
        this.contatoMapper = contatoMapper;
    }
    

    @Override
    public List<ContatosDTO> listarContato() {
        List<Contatos> contatos = contatoRepository.findAll();
        return contatoMapper.toContatoDTO(contatos);
        // return contatoRepository.findAll();
    }
    @Override
    public ContatosDTO salvarContato(Contatos contato) {
        Contatos response = contatoRepository.save(contato);
        ContatosDTO contatoDTO = contatoMapper.toContatoDTO(response);
        return contatoDTO;
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