import java.util.Scanner;
public class ConsultorInstrumento {

    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
            System.out.println("   SISTEMA DE SALUD MENTAL INTEGRAL");
            System.out.println("❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀❀");
            System.out.println("1. Registrar instrumento");
            System.out.println("2. Hacer consulta");
            System.out.println("3. Consulta por orden de clave");
            System.out.println("4. Consulta por orden de autor");
            System.out.println("5. Consulta de instrumento por condición y evaluación");
            System.out.println("6. Eliminar instrumento por clave");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                //Registrar instrumento
                case 1: {
                    System.out.print("Clave: ");
                    int clave = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Tipo (identificar o manejar): ");
                    String tipo = sc.nextLine();
                    System.out.print("Forma (test-escala-cuestionario): ");
                    String forma = sc.nextLine();
                    System.out.print("Condición (ansiedad-estres-ambos): ");
                    String condicion = sc.nextLine();
                    System.out.print("Indica si tiene validez (v(true) o f(false): ");
                    boolean validez = sc.nextBoolean();
                    System.out.print("Indica si tiene confiabilidad (v o f): ");
                    boolean confiabilidad = sc.nextBoolean();
                    System.out.print("Cita (dia,mes,año ejemplo>06022026): ");
                    int cita = sc.nextInt();

                    coleccion.agregarInstrumento(
                            new Instrumento(clave, nombre, validez, confiabilidad,
                                    autor, tipo, forma, cita, condicion)
                    );
                    System.out.println("Haz registrado correctamente el instrumento:)");
                }
                break;

                //submenu de consultas
                case 2:
                    int subOpcion;
                    do {
                        System.out.println("\n❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿");
                        System.out.println("        MENÚ DE CONSULTAS");
                        System.out.println("❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿");
                        System.out.println("1. Consulta por autor");
                        System.out.println("2. Consulta por tipo");
                        System.out.println("3. Consulta por forma del instrumento");
                        System.out.println("4. Consulta por condición");
                        System.out.println("5. Consulta por evaluación");
                        System.out.println("6. Regresar");
                        System.out.print("Seleccione una opción: ");
                        subOpcion = sc.nextInt();
                        sc.nextLine();

                        switch (subOpcion) {
                            case 1:
                                System.out.print("Autor: ");
                                String autor = sc.nextLine();
                                Coleccion.porAutor(coleccion, autor)
                                        .forEach(System.out::println);
                                break;

                            case 2:
                                System.out.print("Tipo: ");
                                String tipo = sc.nextLine();
                                Coleccion.porTipo(coleccion, tipo)
                                        .forEach(System.out::println);
                                break;

                            case 3:
                                System.out.print("Forma: ");
                                String forma = sc.nextLine();
                                Coleccion.porForma(coleccion, forma)
                                        .forEach(System.out::println);
                                break;

                            case 4:
                                System.out.print("Condición: ");
                                String condicion = sc.nextLine();
                                Coleccion.porCondicion(coleccion, condicion)
                                        .forEach(System.out::println);
                                break;

                            case 5:
                                Coleccion.evaluados(coleccion)
                                        .forEach(System.out::println);
                                break;

                            case 6:
                                System.out.println("adiosito estas siendo redirigido al menu principal:)");
                                break;

                            default:
                                System.out.println("Opción inválida");

                        }
                    }while (subOpcion != 6) ;
                    break;

                case 3: //orden clave
                    Coleccion.ordenarPorClave(coleccion)
                                    .forEach(System.out::println);
                    break;
                case  4: //orden autor
                    Coleccion.ordenarPorAutor(coleccion)
                            .forEach(System.out::println);
                    break;
                case 5: //condicion y evaluacion
                    System.out.print("Condición: ");
                    String condicion = sc.nextLine();
                    Coleccion.condicionYEvaluados(coleccion, condicion)
                            .forEach(System.out::println);
                    break;

                case 6: //eliminar instrumento
                    System.out.print("Clave a eliminar: ");
                    int clave = sc.nextInt();
                    coleccion.eliminarPorClave(clave);
                    System.out.println("✔ Instrumento eliminado");
                    break;

                case 7: System.out.println("adiositoo!");
                    break;

                default: System.out.println("Opción inválida");
            }
        }while (opcion != 7);
    }
}
