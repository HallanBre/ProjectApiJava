package com.br.apirest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido {


    //fazer anotation do id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int data;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
    //construtor

    public Pedido(int id, int data) {
        this.id = id;
        this.data = data;
    }

    public Pedido() {
        
    }

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    
}
