
package Proyecto_2_Calculadora;
public class Raizcuadrada {
     float valor1, total;

    public Raizcuadrada(float v1) {
        this.valor1 = v1;
       
    }
  
    public Raizcuadrada(){}
    
    public  float Raiz(){
        total = (float) Math.sqrt(valor1); 
        return total;
    }
}
