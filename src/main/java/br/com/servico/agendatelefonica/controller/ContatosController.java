package br.com.servico.agendatelefonica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.servico.agendatelefonica.models.Contatos;
import br.com.servico.agendatelefonica.services.ContatoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ContatosController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping("/contatos")
    public List<Contatos> getContatos() {
        return contatoService.listarContato();
    }

    @PostMapping("/contatos")
    public Contatos salvarContato(@RequestBody Contatos contato) {
        return contatoService.salvarContato(contato);
    }
    
}
