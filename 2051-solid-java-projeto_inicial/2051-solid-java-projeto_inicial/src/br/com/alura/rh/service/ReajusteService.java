package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento){

        this.validacoes.forEach(validacaoReajuste -> validacaoReajuste.validar(funcionario,aumento));

        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atulizarSalario(salarioReajustado);
    }
}
