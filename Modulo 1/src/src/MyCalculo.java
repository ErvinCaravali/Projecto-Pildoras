


/**
 *
 * @author Ervin Caravali Ibarra :1925648 
 * Empleo de herencia,entre clase.Aplicacion que sirve para realizar smas ,restas y multilicaciones-
 * entre dos numeros.
 */



class Calculos {
   int product;
	
   public void addition(int numero1, int numero2) {
      product = numero1 + numero2;
      System.out.println("La suma  del los numeros es:"+product);
   }
	
   public void Subtraction(int numero1, int numero2) {
      product =  numero1 - numero2;
      System.out.println("La diferencia de los numeros  es:"+product);
   }
}

public class MyCalculo extends Calculos {
   public void multiplication(int numero1, int numero2) {
      product = numero1*numero2;
      System.out.println("El prodccto de los numeros:"+product);
   }
	
   public static void main(String args[]) {
      int number11 = 30, number22 = 20;
      MyCalculo demostracion = new MyCalculo();
      demostracion.addition(number11, number22);
      demostracion.Subtraction(number11, number22);
      demostracion.multiplication(number11, number22);
   }
}