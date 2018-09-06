
package principal;
import principal.desarrollo.Calcular;
import principal.desarrollo.Circulo;
import principal.desarrollo.Cuadrado;
import principal.desarrollo.Triangulo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    Calcular c;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese:");
        System.out.println("1.Circulo");
        System.out.println("2.Cuadrado");
        System.out.println("3.Triangulo");
        System.out.println("4.Rectangulo");
        
                
        
        int num = sc.nextInt();
        switch(num){
            case 1:
                c= new Circulo();
                System.out.println("Ingrese Radio");
                c.setValor(sc.nextInt());
             
              break;
            case 2:
                c = new Cuadrado();
                System.out.println("Ingrese lado");
                c.setValor(sc.nextInt());
                break;
            case 3:
                c = new Triangulo();
                System.out.println("Ingrese base");
                c.setValor2(sc.nextInt());
                System.out.println("Ingrese altura");
                c.setValor2(sc.nextInt());                
                break;
            case 4:
                c = new Rectangulo();
                System.out.println("Ingrese base");
                c.setValor(sc.nextInt());
                System.out.println("Ingrese altura");
                c.setValor2(sc.nextInt());
                break;
      
                
                
                
    }
        System.out.println("Area = "+ c.mostrarResultado2());
        System.out.println("Perimetro = "+ c.mostrarResultado());
       
    }
}
        



