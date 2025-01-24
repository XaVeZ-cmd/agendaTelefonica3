package br.com.servico.agendatelefonica.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.servico.agendatelefonica.models.Contato;
import br.com.servico.agendatelefonica.repository.ContatoRepository;
import br.com.servico.agendatelefonica.services.ContatoService;
import br.com.servico.agendatelefonica.services.impl.dto.ContatoDTO;
import br.com.servico.agendatelefonica.services.impl.mapper.ContatoMapper;


@Service
public class ContatoServiceImpl implements ContatoService {
    
    @Autowired
    private ContatoRepository contatoRepository;

    private ContatoMapper contatoMapper;

    public ContatoServiceImpl(ContatoRepository contatoRepository, 
                            ContatoMapper contatoMapper) {
        this.contatoRepository = contatoRepository;
        this.contatoMapper = contatoMapper;
    }
    
    @Override
    public List<ContatoDTO> listarContato() {
        List<Contato> contatos = contatoRepository.findAll();
        return contatoMapper.toListContatosDTO(contatos);

    }
    @Override
    public ContatoDTO salvarContato(ContatoDTO contatoDTO) {
        Contato contato = contatoMapper.toContato(contatoDTO);
        Contato response = contatoRepository.save(contato);
        ContatoDTO contatoDTOResponse = contatoMapper.toContatoDTO(response);
        return contatoDTOResponse;
    }

   /* @Override
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
    }*/




}