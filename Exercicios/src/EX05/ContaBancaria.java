package EX05;

public class ContaBancaria {
    private double saldo; 
    private double limite; 

    public ContaBancaria(double valorSaldo, double valorLimite){
        this.saldo = valorSaldo;
        this.limite = valorLimite;
    }
    public double getSaldo(){
        return saldo;
    };
    protected double getLimite(){
        return limite;
    };
    public double getSaldoComLimite(){
        return saldo + limite;
    };
    public boolean sacar(double valor) throws contaException {
        if(valor > 500){
            throw new contaException("O valor do saque não pode ser maior que 500 reais");
        }
        else if(valor > saldo + limite){
            throw new contaException("Limite insuficiente!!!");
        }
        else{
            saldo = saldo - valor;
            if(saldo < 0){
                limite = limite + saldo;
                saldo = 0;
            }
            return true;
        }
    };
    public void depositar(double valor) throws contaException {
        if (valor > 1000){
            throw new contaException("São aceitos depósitos de até R$1.000,00");
        }
        else{
            saldo = saldo + valor;
        }
    }
}