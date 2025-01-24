package br.com.servico.agendatelefonica.services.impl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ContatoDTO {

    private Long id;

    private String nome;

    @JsonProperty("email")
    private String email;

    private String telefone;

}
