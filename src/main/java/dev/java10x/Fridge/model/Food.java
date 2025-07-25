// É a receita ou a ficha da comida: descreve como é cada prato (dados que representam os alimentos).

package dev.java10x.Fridge.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

// JPA (Java Persistence API) é uma forma de mapear classes Java para tabelas no banco de dados relacional.
// @Entity indica que essa classe é uma entidade JPA, ou seja, será transformada em uma tabela no banco de dados.

// @Table define o nome exato da tabela no banco; aqui, a tabela será chamada "food_table" em vez de "food" (nome da classe).
@Entity
@Table(name = "food_table")
public class Food {
    // @Id indica que este atributo é a chave primária da tabela, ou seja, o identificador único de cada registro.
    @Id
    // @GeneratedValue define a estratégia para geração automática do valor da chave primária.
    // Aqui, GenerationType.IDENTITY significa que o banco de dados será responsável por gerar valores únicos,
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime expirationDate;
    private Integer quantity;

    // Construtor
    public Food(Long id, String name, LocalDateTime expirationDate, Integer quantity) {
        this.id = id;
        this.name = name;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
    }

    // Getters e Setters:
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
