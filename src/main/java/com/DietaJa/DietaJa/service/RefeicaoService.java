package com.DietaJa.DietaJa.service;

import java.util.List;

import com.DietaJa.DietaJa.model.refeicao;
import com.DietaJa.DietaJa.repository.RefeicaoRepository;

import org.springframework.stereotype.Service;

@Service
public class RefeicaoService {

    private final RefeicaoRepository repository;

    public RefeicaoRepository getRepository() {
        return repository;
    }

    public RefeicaoService(RefeicaoRepository repository) {
        this.repository = repository;
    }

    public RefeicaoService criar(Refeicao refeicao) {
        return repository.save(refeicao);
    }

    public List<refeicao> listarTodos() {
        return repository.findAll();
    }

    public refeicao buscarId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public refeicao atualizar(Long id, Refeicao novaRefeicao) {
        return repository.findById(id).map(refeicao -> {
            refeicao.setNome(novaRefeicao.getNome());
            refeicao.setDescricao(novaRefeicao.getDescricao());
            refeicao.setQuantidade(novaRefeicao.getQuantidade());
            refeicao.setUnidade(novaRefeicao.getUnidade());
            refeicao.setDataHora(novaRefeicao.getDataHora());
            return repository.save(refeicao);
        }).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
