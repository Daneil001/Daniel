import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("ingrese el numero factorial");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine ();
        long numero1 = getfactorial(Integer.parseInt(entradaTeclado), 1);
        System.out.println(numero1);
    }

    private static long getfactorial(int numero, long resultado){
        if(numero > 0){
            resultado = numero*resultado;
            numero--;
            resultado = getfactorial(numero, resultado);
            return resultado;
        }else{
            return resultado;
        }
    }
}
