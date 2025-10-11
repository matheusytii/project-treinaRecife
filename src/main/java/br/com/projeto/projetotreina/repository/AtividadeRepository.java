package main.java.br.com.projeto.projetotreina.repository;

import br.com.projeto.projetotreina.model.Atividade;
import br.com.projeto.projetotreina.model.pessoa;
import br.com.projeto.projetotreina.model.Status;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;


public interface AtividadeRepository  extends JpaRepository <Atividade, Long>{

  List<Atividade> findByResponsavel(Pessoa pessoa);
  List<Atividade> findByStatus (Status status);
  
  @Query("SELECT a FROM  Atividade a WHERE a.responsavel.id = pessoaId ORDER BY a.stauts.nome ASC")
  List <Atividade> findyByResponsavelOrderByStatusName (Long pessoaId);


  @Query( "SELECT a FROM Atividade a WHERE a.status.nome = :statusNome ORDER BY a.dataFimProposta DESC")
  List <Atividade> findByStatusOrderByFimPropostaDesc (String statusNome);
    
}
