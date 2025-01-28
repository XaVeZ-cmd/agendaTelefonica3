package br.com.servico.agendatelefonica.services.impl.dto;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.servico.agendatelefonica.models.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    
    private Long id;	

    @JsonProperty("nome")
	private String nome;

    @JsonProperty("login")	
	private String login;	

    @JsonProperty("senha")
	private String senha;

    @JsonProperty("email")
	private String email;
	// private TipoSituacaoUsuario situacao;
	
	public UsuarioDTO(Usuario usuario) {
		BeanUtils.copyProperties(usuario, this);
	}
    
}
