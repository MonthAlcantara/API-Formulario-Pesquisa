package br.com.maxxmobi.pesquisaweb.validation.annotations;

import br.com.maxxmobi.pesquisaweb.validation.validators.UnicoCPFValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UnicoCPFValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UnicoCPF {

    String message() default "{br.com.maxxmobi.pesquisaweb.validation.annotations.UnicoCPF}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
