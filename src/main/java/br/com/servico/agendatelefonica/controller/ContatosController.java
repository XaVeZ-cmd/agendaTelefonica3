package br.com.servico.agendatelefonica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.servico.agendatelefonica.services.ContatoService;
import br.com.servico.agendatelefonica.services.impl.dto.ContatosDTO;

@RestController
public class ContatosController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping("/contatos")
    public ResponseEntity<List<ContatosDTO>> getContatos() {
        return ResponseEntity.ok(contatoService.listarContato());
    }

    // @PostMapping("/contatos")
    // public ContatosDTO salvarContato(@RequestBody Contatos contato) {
    //     return contatoService.salvarContato(contato);
    // }
    
    // @PutMapping("/contatos")
    // public Contatos atualizarContato(@RequestBody Contatos contato) {
    //     return contatoService.atualizarContato(contato);
    // }

}