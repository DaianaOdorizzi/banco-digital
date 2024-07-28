package banco_digital;

public class Main {

    public static void main(String[] args) {
        Cliente daiana = new Cliente();
        daiana.setNome("Daiana");

        Conta cc = new ContaCorrente(daiana);
        Conta poupanca = new ContaPoupanca(daiana);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}