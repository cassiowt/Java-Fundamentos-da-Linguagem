package com.target.anotacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author cassio
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AnotacaoPersonalizada {
	String indicador();
/*
 * Esse codigo cria uma Annotation: AnotacaoPersonalizada, com a propriedade indicador; 
 */
}

