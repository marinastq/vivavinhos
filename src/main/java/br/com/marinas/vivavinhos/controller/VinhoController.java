package br.com.marinas.vivavinhos.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.marinas.vivavinhos.domain.DadosCadastroVinho;
import br.com.marinas.vivavinhos.domain.DadosDetalhamentoVinho;
import br.com.marinas.vivavinhos.domain.Vinho;
import br.com.marinas.vivavinhos.domain.VinhoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("vinho")
public class VinhoController {
	
	@Autowired
	private VinhoRepository repository;

	@PostMapping
	@Transactional
	public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroVinho dados,
			UriComponentsBuilder uriBuilder) {
		Vinho vinho = new Vinho(dados);
		repository.save(vinho);
		
		URI uri = uriBuilder.path("/vinho/{id}").buildAndExpand(vinho.getId()).toUri();
		
		//codigo 201 - created
		return ResponseEntity.created(uri).body(new DadosDetalhamentoVinho(vinho));
	}
}
