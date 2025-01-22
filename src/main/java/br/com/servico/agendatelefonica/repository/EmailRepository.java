package br.com.servico.agendatelefonica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.servico.agendatelefonica.models.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {}
