import java.util.AbstractQueue;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public void main() {
    AbstractQueue<Integer> cola1= new ArrayBlockingQueue<>(10);
    cola1.add(1);
    cola1.add(15);
    cola1.add(30);
    System.out.println(cola1);
    System.out.println("Elimino Dato: " + cola1.remove());
    System.out.println("Recupero Dato: " + cola1.element());
    System.out.println(cola1);
    System.out.println(cola1.addAll(List.of(21,22,23,24,25,26)));
    System.out.println(cola1);
    cola1.clear();
    System.out.println("limpiar cola:"+cola1);
}