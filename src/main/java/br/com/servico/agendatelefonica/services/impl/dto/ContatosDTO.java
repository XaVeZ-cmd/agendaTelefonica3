package br.com.servico.agendatelefonica.services.impl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ContatosDTO {

    private Long idContato;

    private String nome;

    private EmailDTO email;

    private TelefoneDTO telefone;
}
