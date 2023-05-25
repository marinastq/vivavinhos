package br.com.marinas.vivavinhos.domain;

import java.sql.Timestamp;

public record DadosDetalhamentoVinho(
		 Long id,
//		 Timestamp dataCadastro,
		 Timestamp dataDegustacao,
		 String nome,
		 String produtor,
		 String uvas,
		 String paisRegiao,
		 String safra,
		 double alcool,
		 double precoPago,
		 TipoVinho tipoVinho,
		 String harmonizacao,
		 String observacoes){
	
	public DadosDetalhamentoVinho(Vinho vinho) {
		this(
				vinho.getId(),
				vinho.getDataDegustacao(),
				vinho.getNome(),
				vinho.getProdutor(),
				vinho.getUvas(),
				vinho.getPaisRegiao(),
				vinho.getSafra(),
				vinho.getAlcool(),
				vinho.getPrecoPago(),
				vinho.getTipoVinho(),
				vinho.getHarmonizacao(),
				vinho.getObservacoes()
				);
	}

}
