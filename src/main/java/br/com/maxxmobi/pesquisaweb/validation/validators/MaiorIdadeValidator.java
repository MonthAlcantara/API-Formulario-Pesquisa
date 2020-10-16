package br.com.maxxmobi.pesquisaweb.validation.validators;

import br.com.maxxmobi.pesquisaweb.validation.annotations.MaiorIdade;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;

public class MaiorIdadeValidator implements ConstraintValidator<MaiorIdade, LocalDate> {
    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        LocalDate agora = LocalDate.now();
        return Period.between(localDate, agora).toTotalMonths() >= 216;
    }
}
