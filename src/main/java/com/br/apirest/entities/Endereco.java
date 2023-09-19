package com.br.apirest.entities;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Endereco {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rua;
    private int numero;
    private String bairro;
    private int CEP;
    private String cidade;


    //OneToMany de endereço para pedido
     @OneToMany(mappedBy = "endereco")
    private List<Pedido> pedidos;

public Endereco(int id, String rua, int numero, String bairro, int CEP, String cidade) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.CEP = CEP;
        this.cidade = cidade;
        
    }
public Endereco(){

}





    //getters and setters
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getRua() {
        return rua;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public int getCEP() {
        return CEP;
    }


    public void setCEP(int CEP) {
        this.CEP = CEP;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public List<Pedido> getPedidos() {
        return pedidos;
    }


    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
}
