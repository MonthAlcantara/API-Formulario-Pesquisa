package br.com.maxxmobi.pesquisaweb.validation.validators;

import br.com.maxxmobi.pesquisaweb.repository.UsuarioRepository;
import br.com.maxxmobi.pesquisaweb.validation.annotations.UnicoEmail;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UnicoEmailValidator implements ConstraintValidator<UnicoEmail, String> {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return !usuarioRepository.findByEmail(email).isPresent();
    }
}
