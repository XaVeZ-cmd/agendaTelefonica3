package br.com.servico.agendatelefonica.services.impl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class TelefoneDTO {

    private Long idTelefone;

    private String telefone;
}
