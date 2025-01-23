package br.com.servico.agendatelefonica.services.impl.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.servico.agendatelefonica.models.Contato;
import br.com.servico.agendatelefonica.models.Email;
import br.com.servico.agendatelefonica.models.Telefone;
import br.com.servico.agendatelefonica.services.impl.dto.ContatoDTO;
import br.com.servico.agendatelefonica.services.impl.dto.EmailDTO;
import br.com.servico.agendatelefonica.services.impl.dto.TelefoneDTO;

@Component
public class ContatoMapper {

    public Contato toContato(ContatoDTO contatosDTO){
        Telefone telefone = TelefoneMapper.toTelefone(contatosDTO.getTelefone());
        Email email = EmailMapper.toEmail(contatosDTO.getEmail());
        Contato contato = new Contato();
        contato.setNome(contatosDTO.getNome());
        contato.setEmail(email);
        contato.setTelefone(telefone);
        return contato;
    }
    
    public ContatoDTO toContatoDTO(Contato contatos){
        EmailDTO emailDTO = EmailMapper.toEmailDTO(contatos.getEmail());
        TelefoneDTO telefoneDTO = TelefoneMapper.toTelefoneDTO(contatos.getTelefone());
        ContatoDTO contatoDTO = new ContatoDTO();
        contatoDTO.setNome(contatos.getNome());
        contatoDTO.setEmail(emailDTO);
        contatoDTO.setTelefone(telefoneDTO);
        return contatoDTO;
    }

    
    public List<ContatoDTO> toListContatosDTO(List<Contato> listContatos){
		return listContatos.stream().map(this::toContatoDTO).collect(Collectors.toList());
    	
    }
}
