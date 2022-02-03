package br.com.servico.agendatelefonica.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.servico.agendatelefonica.models.Email;

@Repository
public interface TelefoneRepository extends CrudRepository<Email, Long> {}
