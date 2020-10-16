package br.com.maxxmobi.pesquisaweb.validation.validators;

import br.com.maxxmobi.pesquisaweb.model.entity.Usuario;
import br.com.maxxmobi.pesquisaweb.repository.UsuarioRepository;
import br.com.maxxmobi.pesquisaweb.validation.annotations.UnicoCPF;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UnicoCPFValidator implements ConstraintValidator<UnicoCPF, String> {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public boolean isValid(String cpf, ConstraintValidatorContext constraintValidatorContext) {
        return !usuarioRepository.findByCpf(cpf).isPresent();
    }
}
