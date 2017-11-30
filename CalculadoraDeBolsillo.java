
package CalculadoraDeBolsillo;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Cardona
 */
public class CalculadoraDeBolsillo {

    
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int a,b,c ,suma;
        String salida;
        calcu cal=new calcu();
        do{
        num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        a=Integer.parseInt(JOptionPane.showInputDialog("ingrese 1.suma\n 2.resta \n 3.multiplicacion \n 4.division "));
        switch(a){
            case 1:JOptionPane.showMessageDialog(null,cal.suma(num1,num2)); break;
            case 2:JOptionPane.showMessageDialog(null,cal.resta(num1,num2)); break;
            case 3:JOptionPane.showMessageDialog(null,cal.multiplicacion(num1,num2)); break;
            case 4:JOptionPane.showMessageDialog(null,cal.division(num1,num2)); break;
           
                
                
            default:JOptionPane.showMessageDialog(null,"ESA OPCION NO EXISTE");break;
        }
       salida=JOptionPane.showInputDialog("desea salir ingrese s") ;
    } while(salida.equals("n"));
                
        }
}
//System.out.println(cal.resta(num1,num2));
//        System.out.println(cal.multiplicacion(num1,num2));
//        System.out.println(cal.division(num1,num2));
CAMBIOWEIDIOWJ
