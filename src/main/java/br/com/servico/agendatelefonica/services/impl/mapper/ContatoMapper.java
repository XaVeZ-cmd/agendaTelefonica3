package br.com.servico.agendatelefonica.services.impl.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.servico.agendatelefonica.models.Contatos;
import br.com.servico.agendatelefonica.models.Email;
import br.com.servico.agendatelefonica.models.Telefone;
import br.com.servico.agendatelefonica.services.impl.dto.ContatosDTO;
import br.com.servico.agendatelefonica.services.impl.dto.EmailDTO;
import br.com.servico.agendatelefonica.services.impl.dto.TelefoneDTO;

@Component
public class ContatoMapper {

    private static TelefoneMapper telefoneMapper;
    private static EmailMapper emailMapper;

    public Contatos toContato(ContatosDTO contatosDTO){
        Telefone telefone = telefoneMapper.toTelefone(contatosDTO.getTelefone());
        Email email = emailMapper.toEmail(contatosDTO.getEmail());
        Contatos contato = new Contatos();
        contato.setNome(contatosDTO.getNome());
        contato.setTelefone(telefone);
        contato.setEmail(email);
        return contato;
    }
    
    public ContatosDTO toContatoDTO(Contatos contatos){
        TelefoneDTO telefoneDTO = telefoneMapper.toTelefoneDTO(contatos.getTelefone());
        EmailDTO emailDTO = emailMapper.toEmailDTO(contatos.getEmail());
        ContatosDTO contatoDTO = new ContatosDTO();
        contatoDTO.setNome(contatos.getNome());
        contatoDTO.setTelefone(telefoneDTO);
        contatoDTO.setEmail(emailDTO);
        return contatoDTO;
    }

    
    public List<ContatosDTO> toListContatosDTO(List<Contatos> listContatos){
		return listContatos.stream().map(this::toContatoDTO).collect(Collectors.toList());
    	
    }
}
