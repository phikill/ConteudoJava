package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.desafio_heranca_e_sobreposicao_5_17;

//O método pagar() deve apenas exibir na tela as informações do pagamento (descrição da conta, valor, data de vencimento e nome do fornecedor).
//        Quando finalizar a criação das classes ContaPagar e Fornecedor, crie uma outra classe chamada Principal com o código-fonte abaixo:

public class Principal {
    public static void main(String[] args) {
        // instanciando fornecedores

        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");
        // instanciando clientes

        Cliente atacadista = new Cliente();
        atacadista.setNome("Triângulo Quadrado Atacadista");
        Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicações");

        // instanciando contas a pagar
        //Conta receber!
        ContaPagar contaPagar1 = new ContaPagar();
        contaPagar1.setDescricao("Aluguel da matriz");
        contaPagar1.setValor(1230d);
        contaPagar1.setDataVencimento("10/05/2012");
        contaPagar1.setFornecedor(imobiliaria);

        ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d , "19/05/2012");
        // instanciando contas a receber
        ContaReceber contaReceber1 = new ContaReceber();
        contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
        contaReceber1.setValor(89500d);
        contaReceber1.setDataVencimento("23/05/2012");
        contaReceber1.setCliente(atacadista);

        ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 53200d, "13/05/2012");
        // pagamento e cancelamento de contas a pagar
        contaPagar1.pagar();
        contaPagar2.cancelar();
        // recebimento e cancelamento de contas a receber
        contaReceber1.receber();
        contaReceber2.cancelar();
    }
}