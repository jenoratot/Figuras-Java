
package principal.desarrollo;

public class Cuadrado extends Calcular {
    public Cuadrado() {
        this.mult = 1;
    }
       
     @Override 
      public String mostrarResultado(){ 
          return String.valueOf(super.getResultado()); 
      } 
       
      @Override 
      public String mostrarValor() { 
      return String.valueOf(super.getValor()); 
      } 
  
 
      @Override 
      public String mostrarValor2() { 
          return String.valueOf(super.getValor2()); 
      } 
  
    
}
