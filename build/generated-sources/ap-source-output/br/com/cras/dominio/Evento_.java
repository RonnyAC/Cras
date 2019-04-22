package br.com.cras.dominio;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Evento.class)
public abstract class Evento_ {

	public static volatile SingularAttribute<Evento, String> nomeCoordenador;
	public static volatile SingularAttribute<Evento, String> nomeEvento;
	public static volatile SingularAttribute<Evento, String> endereco;
	public static volatile SingularAttribute<Evento, String> horario;
	public static volatile SingularAttribute<Evento, String> dataTermino;
	public static volatile SingularAttribute<Evento, Integer> id;
	public static volatile SingularAttribute<Evento, String> dataInicio;
	public static volatile SingularAttribute<Evento, String> duracao;
	public static volatile SingularAttribute<Evento, Integer> cod_cras;
	public static volatile SingularAttribute<Evento, String> descricao;
	public static volatile SingularAttribute<Evento, Boolean> status;

}

