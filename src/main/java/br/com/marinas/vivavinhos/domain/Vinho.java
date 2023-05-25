package br.com.marinas.vivavinhos.domain;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="vinho")
@Entity(name="Vinho")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Vinho {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//	private Timestamp dataCadastro;
	private Timestamp dataDegustacao;
	private String nome;
	private String produtor; 
	private String uvas;
	private String paisRegiao;
	private String safra;
	private double alcool;
	private double precoPago;
	
	@Enumerated(EnumType.STRING)
	private TipoVinho tipoVinho;
	private String harmonizacao;
	private String observacoes;
	
	public Vinho(DadosCadastroVinho dados) {
//		this.dataCadastro = dados.dataCadastro();
		this.dataDegustacao = dados.dataDegustacao();
		this.nome = dados.nome();
		this.produtor = dados.produtor(); 
		this.uvas = dados.uvas();
		this.paisRegiao = dados.paisRegiao();
		this.safra = dados.safra();
		this.alcool = dados.alcool();
		this.precoPago = dados.precoPago();
		this.tipoVinho = dados.tipoVinho();
		this.harmonizacao = dados.harmonizacao();
		this.observacoes = dados.observacoes();
	}
	
}
