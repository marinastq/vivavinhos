package br.com.marinas.vivavinhos.domain;

import java.sql.Timestamp;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroVinho(
	Timestamp dataDegustacao,
	
	@NotBlank
	String nome,
	
	@NotBlank
	String produtor,
	
	@NotBlank
	String uvas,
	
	@NotBlank
	String paisRegiao,
	
	@NotBlank
	String safra,
	
	double alcool,
	
	double precoPago,
	
	@NotNull
	TipoVinho tipoVinho,
	
	String harmonizacao,
	
	String observacoes){
}
