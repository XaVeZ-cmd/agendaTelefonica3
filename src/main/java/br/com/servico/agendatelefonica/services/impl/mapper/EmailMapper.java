package br.com.servico.agendatelefonica.services.impl.mapper;

import org.springframework.stereotype.Component;

import br.com.servico.agendatelefonica.models.Email;
import br.com.servico.agendatelefonica.services.impl.dto.EmailDTO;

@Component
public class EmailMapper {
	public static final Email toEmail(String emailDTO){
        Email email = new Email();
        email.setEmail(emailDTO);
        return email;
    }
	
	public static final EmailDTO toEmailDTO(Email email){
		EmailDTO emailDTO = new EmailDTO();
		emailDTO.setEmail(email.getEmail());
        return emailDTO;
    }
}