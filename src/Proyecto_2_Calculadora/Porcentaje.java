
package Proyecto_2_Calculadora;


public class Porcentaje {
  float valor1, valor2, total;

    public Porcentaje(float v1, float v2) {
        this.valor1 = v1;
        this.valor2 = v2;
    }
  
    public Porcentaje(){}
    
    public float porcentaje(){
        total = valor1 * (valor2 / 100); 
        return total;
    }  
}
