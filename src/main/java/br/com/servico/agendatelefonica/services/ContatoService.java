package br.com.servico.agendatelefonica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.servico.agendatelefonica.models.Contatos;
import br.com.servico.agendatelefonica.repository.ContatoRepository;

@Service
public class ContatoService implements InterfaceContatoService {
    
    @Autowired
    private ContatoRepository contatoRepository;

    
	@Override
	public List<Contatos> listarContato() {
		return (List<Contato>) contatoRepository.findAll();
	}

	@Override
	public void salvar(Contato contato) {
		contatoRepository.save(contato);
	}

	@Override
	public void eliminar(Long idContato) {
		contatoRepository.deleteById(idContato);

	}

}
