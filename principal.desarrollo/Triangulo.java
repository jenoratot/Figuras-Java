
package principal.desarrollo;


public class Triangulo extends Calcular {
    public Triangulo() {
        this.mult = 1;
    }
        @Override 
      public String mostrarResultado(){ 
          return String.valueOf(super.getResultado()); 
      } 
       
      @Override 
      public String mostrarValor1() { 
      return String.valueOf(super.getValor()); 
      } 
  
 
      @Override 
      public String mostrarValor2() { 
          return String.valueOf(super.getValor2()); 
      } 
  
    
}
