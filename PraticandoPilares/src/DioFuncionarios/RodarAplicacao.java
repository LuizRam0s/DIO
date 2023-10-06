package DioFuncionarios;

public class RodarAplicacao {
    Faxineiro faxineiro = new Faxineiro();
    Gerente gerente = new Gerente();
    Vendedor vendedor = new Vendedor();

/*
    !!!!!Evitar o downcast pois ele sempre pode dar erro
    Faxineiro faxineiro = (Faxineiro) ew Faxineiro;
    Gerente gerente = (Gerente) new Funcionario();
    Vendedor vendedor = (Vendedor) new Funcionario();
*/
}

