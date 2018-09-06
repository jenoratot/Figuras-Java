
package principal.desarrollo;

public abstract class Calcular {
 

    protected int valor;
    protected int valor2;
    protected int resultado;
    protected int resultado2;
    protected int mult;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getValor2() { 
        return valor2; 
      } 
  
 
    public void setValor2(int valor2) { 
          this.valor2 = valor2; 
      } 


    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    

    public int getResultado2() {
        return resultado2;
    }

    public void setResultado2(int resultado2) {
        this.resultado2 = resultado2;
    }    
    public abstract String mostrarResultado();
    public abstract String mostrarResultado2();
    
    public void Perimetro(){
        this.resultado = (2*this.valor) + (2*this.valor2);
    }
    
    
    public void Area(){
        this.resultado2 = (this.valor * this.valor2)/mult;
    }
    
  

    
}





    

