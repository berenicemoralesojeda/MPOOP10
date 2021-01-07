package practica10;

/**
 *
 * @author JOSE
 */
public class Practica10{
	
    public static void main (String[] args){
        try{
            System.out.println("******");
                String mensaje[]={"antonio", "Javier", "Gabriela"};
                for (int i =0; i < 4; i++){
                    System.out.println(mensaje[i]);
                }
        
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: apuntador fuera de rango");
        }
        
        System.out.println("2*****");
        
        
        
        try{
            System.out.println("escriba el numerador  presione enter y depues escriba el denominador y presione enter: ");
            
            KeyboardInput in = new KeyboardInput();
            
            float a = in.readInteger();
            
            
            float b = in.readInteger();
            
            float equis= a/b;
            
            System.out.println("Equis = "+ equis);
        }catch(ArithmeticException ae){
            System.out.println("Error: division entre 0");
        }finally{
            System.out.println("A pesar de todo se ejecuta finally");
        }
        System.out.println("Fuera de Try-Catch");
        
        
        System.out.println("3*****");
        
        try{
            System.out.println("escriba el numerador  presione enter y depues escriba el denominador y presione enter: ");
            
            KeyboardInput in = new KeyboardInput();
            
            float a = in.readInteger();
            
            
            float b = in.readInteger();
            
            float equis= a/b;
            System.out.println("Equis = "+ equis);
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: apuntador fuera de rango");
        }catch(ArithmeticException ae){
            System.out.println("Error: division entre 0");
        }catch (Exception e){
            System.out.println("Excepcion general");
        
        
        }finally{
            System.out.println("A pesar de todo se ejecuta finally");
        }
        System.out.println("Fuera de Try-Catch");
        
        
        
        
        System.out.println("4*****");
        //propagacionde excepciones
        try{
            int division = division(8,0);
        System.out.println("Division = "+ division);
            
        }catch(ArithmeticException e){
            System.out.println("Excepction aritmetica");
            
        }
        
        
         System.out.println("5*****");
        //propagacionde excepciones
        try{
            int division = division2(8,0);
        System.out.println("Division = "+ division);
            
        }catch(ArithmeticException e){
            System.out.println("Excepction aritmetica");
            
        }
        
    }
    /**
     * 
     * @param a
     * @param b
     * @return
     * @throws ArithmeticException
     */
    public static int division(int a, int b)throws ArithmeticException{
        int c;
        /*try{
            c= a/b;
        }catch(ArithmeticException e){
            c=0;
        }*/
        c=a/b;
        return c;
         
    }
    /**
     * 
     * @param a
     * @param b
     * @return
     * @throws ArithmeticException
     */
    public static int division2(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }int c = a/b;
         
        return c;
    }
}