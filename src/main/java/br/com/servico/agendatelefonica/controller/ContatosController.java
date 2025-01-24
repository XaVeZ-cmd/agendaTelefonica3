package br.com.servico.agendatelefonica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    import br.com.servico.agendatelefonica.services.ContatoService;
import br.com.servico.agendatelefonica.services.impl.dto.ContatoDTO;

@RestController
@RequestMapping("/contato")
public class ContatosController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping
    public ResponseEntity<List<ContatoDTO>> getContatos() {
            return ResponseEntity.ok(contatoService.listarContato());
    }

    @GetMapping("/{nome}")
    public ResponseEntity<ContatoDTO> getContato(@PathVariable String nome) throws Exception {
        return ResponseEntity.ok(contatoService.buscarContatoNome(nome));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<ContatoDTO> getContato(@PathVariable Long id) {
        return ResponseEntity.ok(contatoService.buscarContatoId(id));
    }

    @PostMapping
    public ContatoDTO salvarContato(@RequestBody ContatoDTO contatoDTO) {
        return contatoService.salvarContato(contatoDTO);
    }
    
    @DeleteMapping("/{id}")
    public void deletarContato(@PathVariable Long id) {
        contatoService.deletarContato(id);
    }
}