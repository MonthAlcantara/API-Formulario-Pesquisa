package br.com.maxxmobi.pesquisaweb.model.entity;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Column(length = 20, nullable = false)
    private String nome;

    @NotEmpty
    @Column(length = 100)
    private String sobrenome;

    @Email
    @Column(nullable = false)
    private String email;

    @CPF
    @Column(nullable = false)
    private String cpf;

    @NotNull
    @Past
    private LocalDate dataNascimento;

    private Endereco endereco;
}
