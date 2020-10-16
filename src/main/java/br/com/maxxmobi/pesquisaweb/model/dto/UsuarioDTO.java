package br.com.maxxmobi.pesquisaweb.model.dto;

import br.com.maxxmobi.pesquisaweb.model.entity.Endereco;
import br.com.maxxmobi.pesquisaweb.validation.annotations.MaiorIdade;
import br.com.maxxmobi.pesquisaweb.validation.annotations.UnicoCPF;
import br.com.maxxmobi.pesquisaweb.validation.annotations.UnicoEmail;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.time.LocalDate;

public class UsuarioDTO implements Serializable {


    @NotEmpty(message = " {campo.nome.obrigatorio}")
    private String nome;

    @NotEmpty(message = "{campo.sobrenome.obrigatorio}")
    private String sobrenome;

    @Email(message = "{campo.email.invalido}")
    @UnicoEmail(message = "{campo.email.repetido}")
    private String email;

    @CPF(message = "{campo.cpf.invalido}")
    @UnicoCPF(message = "{campo.cpf.repetido}")
    private String cpf;

    @NotNull(message = "{campo.data-nascimento.obrigatorio}")
    @MaiorIdade(message = "{campo.data-nascimento.maioridade}")
    @Past(message = "{campo.data-nascimento.invalida}")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    private Endereco endereco;
    public UsuarioDTO() {
    }

    public UsuarioDTO(String nome, String sobrenome, String email, String cpf, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
