package br.com.servico.agendatelefonica.services;

import br.com.servico.agendatelefonica.models.Contatos;

public interface InterfaceContatoService {
   
    public List<Contatos> listarContato();
	public void salvar(Contato contato);
	public void eliminar(Long idContato);
}
