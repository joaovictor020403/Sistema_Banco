package sistemabancosimples;


public class SistemaBancoSimples {

    public static void main(String[] args) {
        
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(123456);
        pessoa1.setTipoConta("cc");
        pessoa1.setDono("João Victor");
        pessoa1.abrirConta();
        pessoa1.mostarRegistro();
        pessoa1.depositar(150);
        pessoa1.sacar(30);
        pessoa1.saldo();
        pessoa1.pagarMensal();
        pessoa1.saldo();
     
    }
    
}
