package br.com.servico.agendatelefonica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.servico.agendatelefonica.models.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {}
