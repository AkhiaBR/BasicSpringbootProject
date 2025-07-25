// Camada responsável por receber as requisições HTTP e direcionar para o serviço apropriado.
// Atua como um garçom: recebe o pedido do cliente (requisição HTTP) e leva para a cozinha (serviço).

package dev.java10x.Fridge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController indica que esta classe é um controlador REST, ou seja,
// ela vai tratar requisições HTTP e retornar respostas JSON diretamente,

// @RequestMapping("/food") define o caminho base para todas as requisições
// que este controller vai atender. Ou seja, qualquer requisição que comece
// com "/food" será direcionada para esta classe.
@RestController
@RequestMapping("/food")
public class FoodController {
    // Injeção de dependência: o Spring cria e fornece a instância de FoodService automaticamente.
    // Diferente de um import, que só traz a classe para o código, a injeção disponibiliza o objeto pronto para uso, sem precisar instanciá-lo manualmente.
    private final FoodService foodService; // final: a referência não pode ser alterada depois de inicializada (imutabilidade).

    // O construtor recebe a instância de FoodService para fazer a injeção via construtor.
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    // Trata requisição GET para "/food", retorna a lista de todos os alimentos.
    @GetMapping
    public List<Food> getAll() {return foodService.getAll()}

    @PostMapping
}
