package br.com.academy.dao;

import br.com.academy.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoDao extends JpaRepository<Aluno, String>{

}
