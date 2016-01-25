/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcentagem;

/**
 *
 * @author debora
 */
public class Porcentagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double var = Double.parseDouble(args[0]);
           double max = Double.parseDouble(args[1]);
           
           double res = var*100/max;
           double por = 100-res;
           System.out.println("var: " + res+ " porc: " + por);
    }
    
}
