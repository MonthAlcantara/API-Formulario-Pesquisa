package br.com.maxxmobi.pesquisaweb.validation.annotations;

import br.com.maxxmobi.pesquisaweb.validation.validators.UnicoEmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UnicoEmailValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UnicoEmail {

    String message() default "{br.com.maxxmobi.pesquisaweb.validation.annotations.UnicoEmail}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}

