// É o cozinheiro: recebe o pedido do garçom e prepara a comida.

package dev.java10x.Fridge.service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service indica que esta classe é um componente de serviço.
// O Spring cria e gerencia essa classe para ser usada como serviço para controllers.
@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // Retorna uma lista com todos os alimentos do banco de dados usando FoodRepository.
    // LISTAR
    public List<Food> getAll() {return foodRepository.findAll();}
    // CRIAR
    public Food save(Food food) {return foodRepository.save(food);}
    // DELETAR
    public void delete(Long id) {foodRepository.deleteById(id);}

}
