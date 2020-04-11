
package sistemabancosimples;

public class ContaBanco {
    public Integer numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    public void mostarRegistro(){
        System.out.println("Conta: " + numConta);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Dono: " + dono);
        System.out.println("Saldo: " + saldo);
        System.out.println("Status: " + status);
    }
    
    public void abrirConta(){
        this.setTipoConta(tipoConta);
        this.setStatus(true); 
        System.out.println("conta aberta com sucesso ");
        if (tipoConta == "cc"){
            this.setSaldo(50);
        } else if (tipoConta == "cp"){
            this.setSaldo(150);
        }
    }
    
    
    
    public void fecharConta(){
        if (this.getSaldo() == 0){
            this.status = false;
            System.out.println("Conta Fechada");
        }
        else {
            System.out.println("Saque seu dinheiro pra poder fechar a conta");
        }
    }
    
    public void depositar(float deposito){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo()+ deposito);
            System.out.println("Valor de deposito: " + deposito + " Realizado");
        }else {
            System.out.println("Esta conta esta fechada");
        }
              
    }
    
    public void sacar(float saque) {
        if(this.isStatus()){
        if(this.getSaldo()>= saque ){
            this.setSaldo(this.getSaldo()-saque);
            System.out.println("Dinheiro sacado: " + saque);
           
        }else{
            System.out.println("Saldo insuficiente para saque");
        }
        }else{
            System.out.println("Esta conta esta fechada");
        }
    }
    
    public void pagarMensal(){
        int mensal = 0;
        if(this.getTipoConta() == "cc"){
            mensal = 12;
        } else if (this.getTipoConta()== "cp"){
            mensal = 20; 
            
        }if(this.isStatus()){
            this.setSaldo(this.getSaldo()- mensal) ;
            System.out.println("pagamento mensal realizado");
        }else{
            System.out.println("Esta conta esta fechada");
        }
    }
    
    public void saldo(){
        System.out.println("Seu saldo é: " + this.saldo);
    }
    
       public ContaBanco(){
        this.saldo = 0.0f;
        this.status= false;
              
    }
    
    
    
    
    
    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
     
}
