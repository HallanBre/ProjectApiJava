package com.br.apirest.dto;

public class LoginDto {

    private String login;
    private String senha;

    public LoginDto(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public LoginDto() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}