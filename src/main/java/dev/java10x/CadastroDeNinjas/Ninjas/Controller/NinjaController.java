package dev.java10x.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    // Adicionar Ninja
    @PostMapping("/adicionar")
    public String criarNinja(){
        return "Ninja Adicionado";
    }

    // Mostrar todos od ninjas
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrando todos os ninjas";
    }

    // Mostra Ninja por ID
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrando os ninjas por ID";
    }

    // Alterar dados dos ninjas
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Ninja Alterado";
    }


    // Deletar Ninja
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja Deletado";
    }
}
