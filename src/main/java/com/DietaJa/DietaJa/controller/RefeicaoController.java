package com.DietaJa.DietaJa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DietaJa.DietaJa.model.refeicao;
import com.DietaJa.DietaJa.service.Refeicao;
import com.DietaJa.DietaJa.service.RefeicaoService;

@RestController
@RequestMapping("/api/refeicoes")//Os EndPoints Criados como POST, GET(buscar e listar), PUT, DELETE
public class RefeicaoController { // Essa classe faz parte do backend Spring Boot, ela é o Controller — ou seja, é quem recebe as requisições HTTP (ex: POST, GET, PUT, DELETE) e chama o Service que faz a lógica.

    private final RefeicaoService service; //To dizendo que "Este Controller precisa de um RefeicaoService para funcionar".

    public RefeicaoController(RefeicaoService service){
        this.service=service;
    }

    //criar 
    @PostMapping
    public RefeicaoService criar(@RequestBody Refeicao refeicao){
        return service.criar(refeicao);
    }
    
    //Listar todos 
    @GetMapping
    public List<refeicao> listarTodos(){
        return service.listarTodos();

    }
    //Buscar por Id
    @GetMapping("/{Id}")
    public refeicao buscarPorId(@PathVariable Long id){
        return service.buscarId(id);
    }
    //Atualizar 
    @PutMapping("/{id}")
    public refeicao atualizar(@PathVariable Long id, @RequestBody Refeicao refeicao){
        return service.atualizar(id, refeicao);
    }
    //Deletar 
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }



}

//✅ Endpoints disponíveis:
//Métodos : POST, GET(LISTAR E BUSCAR), PUT, DELETE
//URL: /api/refeicoes(POST DE POSTAR A REFEIÇÃO), /api/refeicoes(GET DE ATUALIZAR), 	/api/refeicoes/{id}(GET DE BUSCAR PELO ID), /api/refeicoes/{id}(PUT DE ATUALIZAR ), 	/api/refeicoes/{id}(DELETE)   




