package br.com.servico.agendatelefonica.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contatos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContato;

    @NotEmpty
    @Column(name = "Nome")
    private String nome;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "Contatos")
    @NotEmpty
    @Column(name = "Email")
    private Email email;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "Contatos")
    @NotEmpty
    @Column(name = "Telefone")
    private Telefone telefone;
}
