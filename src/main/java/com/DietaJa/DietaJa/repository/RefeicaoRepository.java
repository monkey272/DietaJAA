package com.DietaJa.DietaJa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DietaJa.DietaJa.model.refeicao;
import com.DietaJa.DietaJa.service.Refeicao;
import com.DietaJa.DietaJa.service.RefeicaoService;

public interface RefeicaoRepository extends JpaRepository<refeicao, Long> {

    RefeicaoService save(Refeicao refeicao);

   //Agora vai erdar os Métodos  CRUD: SAVE, FindById, FindAll, deleteById
// AGORA AJUDA A FAZER A CONEXÃO C0M O BANCO 
}
