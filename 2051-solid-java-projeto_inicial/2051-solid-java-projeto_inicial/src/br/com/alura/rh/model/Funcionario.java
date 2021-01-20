package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {

	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;
	private DadosPessoais dadosPessoais;

	public Funcionario(BigDecimal salario, LocalDate dataUltimoReajuste, DadosPessoais dadosPessoais) {
		this.salario = salario;
		this.dataUltimoReajuste = dataUltimoReajuste;
		this.dadosPessoais = dadosPessoais;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public void atulizarSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}




	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}
}
