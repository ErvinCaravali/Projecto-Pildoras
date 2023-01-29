
public class DeclaracionDeOperadores {

    public static void main(String args[]) {

        /*
         * @author Ervin Caravali Ibarra :1925648. 
         * Esta Aplicacion sirve para la combercion de pulgadas a centimetros .
         * y unasuma simple
         * @param args
         */


        final double pulgada = 2.9;
        double cms = 6;
        double conversionAcentimetros = pulgada * cms;
        double conversionPulgadas = cms / pulgada;
        System.out.println(conversionAcentimetros + " Centimetros");
        System.out.println(conversionPulgadas + " Pulgadas");

        int operadorr1, operadorr2, operadorr3, resultados;
        operadorr1 = 80;
        operadorr2 = 785;
        resultados = operadorr1 + operadorr2;
        System.out.println("la Suma es: "+resultados);

    }

}
