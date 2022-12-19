package br.gov.sp.educjandira.educ.GestaoServidores.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Servidor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String emailInstitucional;
    private String cargoAtual;
    private String cargoOrigem;
    private String telefone;
    private String lotacao;
    private String matricula;
    @Column(nullable = false, updatable = false)
    private String codigoServidor;

    public Servidor() {}

    public Servidor (String nome, String cpf, String email,
                     String emailInstitucional, String cargoAtual,
                     String cargoOrigem, String telefone,
                     String lotacao, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.emailInstitucional = emailInstitucional;
        this.cargoAtual = cargoAtual;
        this.cargoOrigem = cargoOrigem;
        this.telefone = telefone;
        this.lotacao = lotacao;
        this.matricula = matricula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getCargoAtual() {
        return cargoAtual;
    }

    public void setCargoAtual(String cargoAtual) {
        this.cargoAtual = cargoAtual;
    }

    public String getCargoOrigem() {
        return cargoOrigem;
    }

    public void setCargoOrigem(String cargoOrigem) {
        this.cargoOrigem = cargoOrigem;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCodigoServidor() {
        return codigoServidor;
    }

    public void setCodigoServidor(String codigoServidor) {
        this.codigoServidor = codigoServidor;
    }

    @Override
    public String toString() {
        return "Servidor{" +
                "id=" + id +
                ", nome=' " + nome + '\'' +
                ", cpf=' " + cpf + '\'' +
                ", email=' " + email + '\'' +
                ", email institucional=' " + emailInstitucional + '\'' +
                ", cargo atual=' " + cargoAtual + '\'' +
                ", cago origem=' " + cargoOrigem + '\'' +
                ", telefone=' " + telefone + '\'' +
                ", lotação=' " + lotacao + '\'' +
                ", matricula=' " + matricula + '\'' +
                ", codigo do servidor=' " + codigoServidor + '\'' +
                '}';
    }
}


