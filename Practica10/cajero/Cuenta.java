/**
 * 
 */
package cajero;

/**
 *
 * @author JOSE
 */
public class Cuenta {
    double saldo;
    /**
     * 
     */
    public Cuenta(){
        this.saldo=0;
    }
    /**
     * 
     * @param monto
     */
    public void depositar(double monto){
        System.out.println("Deposintando: " + monto + "pesos");
        saldo+=monto;
    }
    /**
     * 
     * @param monto
     * @throws SaldoInsuficienteException
     */
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("retirando monto");
        if(saldo<monto)
            throw new SaldoInsuficienteException();
        else{
            saldo -= monto;
        }
        
        System.out.println("Nuevo saldo: "+ saldo + " pesos");
    }
    
}