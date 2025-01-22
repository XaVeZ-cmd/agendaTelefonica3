package br.com.servico.agendatelefonica.services.impl.mapper;

import br.com.servico.agendatelefonica.models.Contatos;
import br.com.servico.agendatelefonica.models.Telefone;
import br.com.servico.agendatelefonica.services.impl.dto.ContatosDTO;


public class ContatoMapper {

    private final TelefoneMapper telefoneMapper;

    public static Contatos toContato(ContatosDTO contatosDTO){
        Telefone telefone = telefoneMapper.toTelefone(contatosDTO.getTelefone());
        Contatos contato = new Contatos();
        contato.setNome(contatosDTO.getNome());
        contato.setTelefone(telefone.getTelefone());
        contato.setEmail(contatosDTO.getEmail());
        return contato;
    }
    
}
