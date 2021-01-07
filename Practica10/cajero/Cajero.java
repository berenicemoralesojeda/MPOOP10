/**
 * 
 */
package cajero;
/**
 * 
 * @author Marionuñez
 *
 */
public class Cajero {
    public static void main(String[]args){
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(500);
        try {
        while(cuenta.saldo>0){
            
            System.out.println("coloque la cantidad que quieras retirar: ");
            KeyboardInput in = new KeyboardInput();
            float a = in.readInteger();
            cuenta.retirar(a);
                        
        }
        System.out.println("tu saldo es de 0");
            
            
            
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Saldo Insuficiente");
        }
        
        
        }
}