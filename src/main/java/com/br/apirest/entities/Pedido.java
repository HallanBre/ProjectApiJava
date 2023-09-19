package com.br.apirest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
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

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    //manyToOne varios pedido para um endereco
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    
    //ManyToOne para pagamento
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "pagamento_id")
    private Pagamento pagamento;
    //construtor

    public Pedido(int id, int data, Usuario usuario) {
        this.id = id;
        this.data = data;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
