// É a despensa: onde os ingredientes (dados) ficam armazenados e de onde o cozinheiro pega o que precisa.

package dev.java10x.Fridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository é uma interface do Spring Data que já traz CRUD completo
// Isso evita a implementação manual

// Interface pública: define um conjunto de métodos que devem ser implementados,
// sem conter código de como fazer isso.
public interface FoodRepository extends JpaRepository<Food, Long>{

}
