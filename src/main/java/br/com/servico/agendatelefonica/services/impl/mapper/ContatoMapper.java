package br.com.servico.agendatelefonica.services.impl.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.servico.agendatelefonica.models.Contato;
import br.com.servico.agendatelefonica.services.impl.dto.ContatoDTO;

@Component
public class ContatoMapper {

    public Contato toContato(ContatoDTO contatosDTO){
        // Telefone telefone = TelefoneMapper.toTelefone(contatosDTO.getTelefone());
        // Email email = EmailMapper.toEmail(contatosDTO.getEmail());
        Contato contato = new Contato();
        contato.setIdContato(contatosDTO.getId());
        contato.setNome(contatosDTO.getNome());
        contato.setEmail(EmailMapper.toEmail(contatosDTO.getEmail()));
        contato.setTelefone(TelefoneMapper.toTelefone(contatosDTO.getTelefone()));
        // contato.setEmail(email);
        // contato.setTelefone(telefone);
        return contato;
    }
    
    public ContatoDTO toContatoDTO(Contato contatos){
        // EmailDTO emailDTO = EmailMapper.toEmailDTO(contatos.getEmail());
        // TelefoneDTO telefoneDTO = TelefoneMapper.toTelefoneDTO(contatos.getTelefone());
        ContatoDTO contatoDTO = new ContatoDTO();
        contatoDTO.setId(contatos.getIdContato());
        contatoDTO.setNome(contatos.getNome());
        contatoDTO.setEmail(contatos.getEmail().getEmail());
        contatoDTO.setTelefone(contatos.getTelefone().getTelefone());
        // contatoDTO.setEmail(emailDTO);
        // contatoDTO.setTelefone(telefoneDTO);
        return contatoDTO;
    }
    
    public List<ContatoDTO> toListContatosDTO(List<Contato> listContatos){
		return listContatos.stream().map(this::toContatoDTO).collect(Collectors.toList());
    	
    }
}
