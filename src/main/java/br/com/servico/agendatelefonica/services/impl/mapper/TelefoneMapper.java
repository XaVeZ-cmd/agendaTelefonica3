package br.com.servico.agendatelefonica.services.impl.mapper;

import org.springframework.stereotype.Component;

import br.com.servico.agendatelefonica.models.Telefone;
import br.com.servico.agendatelefonica.services.impl.dto.TelefoneDTO;

@Component
public class TelefoneMapper {
    public static final Telefone toTelefone(TelefoneDTO telefoneDTO){
        Telefone telefone = new Telefone();
        telefone.setTelefone(telefoneDTO.getTelefone());
        return telefone;
    }
    
    public static final TelefoneDTO toTelefoneDTO(Telefone telefone) {
    	TelefoneDTO telefoneDTO = new TelefoneDTO();
    	telefoneDTO.setTelefone(telefone.getTelefone());
    	return telefoneDTO;
    }
}
