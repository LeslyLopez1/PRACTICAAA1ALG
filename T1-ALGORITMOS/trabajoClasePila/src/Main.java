import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Pila<Character> pila = new Pila<>();
        pila.push('a');
        pila.push('b');
        pila.push('c');
        System.out.println(pila.pop()+" ");
        System.out.println(pila.pop()+" ");
        System.out.println(pila.pop()+" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        String texto = scanner.nextLine();

        Pila<Character> obj = new Pila<>();
        String resultado = obj.invierteCadena(texto);

        System.out.println("Invertida: " + resultado);


        ////////////////
        //part 4

        Scanner scannersito = new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        String cadenita = scannersito.nextLine();

        boolean res = revisarSintaxis(cadenita);

        if(res){
            System.out.println("todo bien");
        }else System.out.println("tienes algo mal por ahi");



        //////////////
        //part 5
        int[] numeros = {8, 3, 12, 1, 6, 4};

        Pila<Integer> pilaOrdenada = ordenarNumeros(numeros);

        System.out.println("Pila ordenada de menor a mayor:");
        System.out.println(pilaOrdenada);

    }

    public static boolean revisarSintaxis(String cadena){
        Pila<Character> pila = new Pila<>(cadena.length());

        for(Character c: cadena.toCharArray()) {
            //{ [ ( ] } ] ----Error
            if (c.equals('{') || c.equals('[') || c.equals('(')){
                pila.push(c);
            } else if (c.equals(')') || c.equals(']') || c.equals('}')){

                if (pila.pilaVacia()) {
                    System.out.println("Cierre sin apertura: " + c);
                    return false;
                }

                Character tope = pila.pop();

                if ((tope == '{' && c != '}') ||
                        (tope == '[' && c != ']') ||
                        (tope == '(' && c != ')')) {
                    System.out.println("Par incorrecto: " + tope + " con " + c);
                    return false;
                }
            }
        }
        return pila.pilaVacia();
    }

    public static Pila<Integer> ordenarNumeros(int[] vector){
        Arrays.sort(vector);
        Pila<Integer> pila = new Pila<>();

        for (int num : vector){
            pila.push(num);
        }
        return pila;
    }

}

