package br.com.servico.agendatelefonica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.servico.agendatelefonica.models.Contato;
import br.com.servico.agendatelefonica.services.ContatoService;
import br.com.servico.agendatelefonica.services.impl.dto.ContatoDTO;

@RestController
public class ContatosController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping("/contato")
    public ResponseEntity<List<ContatoDTO>> getContatos() {
        return ResponseEntity.ok(contatoService.listarContato());
    }

    @PostMapping("/contato")
    public ContatoDTO salvarContato(@RequestBody ContatoDTO contatoDTO) {
        return contatoService.salvarContato(contatoDTO);
    }
    
    // @PutMapping("/contatos")
    // public Contatos atualizarContato(@RequestBody Contatos contato) {
    //     return contatoService.atualizarContato(contato);
    // }

}