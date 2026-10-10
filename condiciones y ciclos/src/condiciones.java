import java.util.Scanner;

public class condiciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;


        System.out.println("Estudiante: Sheila Alesandra Gabriel Orozco");
        System.out.println("Carné: 9941-25-1795");
        System.out.println("Semana 3 — Condiciones y ciclos\n");

        do { System.out.println("========= DESAFÍOS LÓGICOS =========");
            System.out.println("1. Generar una secuencia");
            System.out.println("2. Realizar un conteo regresivo");
            System.out.println("3. Analizar números");
            System.out.println("4. Dibujar una pirámide");
            System.out.println("5. Validar palabra secreta");
            System.out.println("6. Salir");
            System.out.print("\nSeleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Número inicial: ");
                    int inicio = scanner.nextInt();
                    System.out.print("Número final: ");
                    int fin = scanner.nextInt();
                    System.out.print("Incremento: ");
                    int incremento = scanner.nextInt();


                    if (incremento > 0 && fin > inicio) {
                        System.out.print("Resultado:\n");
                        for (int i = inicio; i <= fin; i += incremento) {
                            System.out.print(i + " ");
                        }
                        System.out.println("\n");
                    } else {
                        System.out.println("Datos incorrectos. El incremento debe ser mayor a 0 y el número final mayor al inicial.\n");
                    }
                    break;

                case 2:
                    int numRegresivo = 0;

                    while (true) {
                        System.out.print("Ingrese el número inicial (entre 10 y 50): ");
                        numRegresivo = scanner.nextInt();
                        if (numRegresivo >= 10 && numRegresivo <= 50) {
                            break;
                        }
                        System.out.println("Número fuera de rango. Intente nuevamente.");
                    }

                    System.out.println("Resultado:");
                    int actual = numRegresivo;
                    while (actual >= 0) {
                        System.out.print(actual + " ");
                        actual--;
                    }
                    System.out.println("\n¡Despegue!\n");
                    break;

                case 3:
                    int positivos = 0;
                    int negativos = 0;
                    int sumaValida = 0;
                    int ignorados = 0;

                    System.out.println("Ingrese números enteros (ingrese 0 para finalizar):");
                    while (true) {
                        System.out.print("Ingrese un número: ");
                        int numero = scanner.nextInt();

                        if (numero == 0) {
                            break;
                        }


                        if (numero % 5 == 0) {
                            System.out.println("El número " + numero + " fue ignorado.");
                            ignorados++;
                            continue;
                        }

                        if (numero > 0) {
                            positivos++;
                        } else if (numero < 0) {
                            negativos++;
                        }

                        sumaValida += numero;
                    }

                    System.out.println("Resultado:");
                    System.out.println("Positivos: " + positivos);
                    System.out.println("Negativos: " + negativos);
                    System.out.println("Suma válida: " + sumaValida);
                    System.out.println("Números ignorados: " + ignorados + "\n");
                    break;



                case 4:
                    int altura = 0;
                    while (true) {
                        System.out.print("Ingrese la altura (entre 3 y 10): ");
                        altura = scanner.nextInt();
                        if (altura >= 3 && altura <= 10) {
                            break;
                        }
                        System.out.println("Altura inválida. Debe estar entre 3 y 10.");
                    }

                    System.out.println("Resultado:");


                    for (int i = 1; i <= altura; i++) {


                        for (int j = 0; j < altura - i; j++) {
                            System.out.print(" ");
                        }


                        for (int k = 0; k < (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;



                case 5:
                    scanner.nextLine();
                    String palabraSecreta;

                    do {
                        System.out.print("Ingrese la palabra secreta: ");
                        palabraSecreta = scanner.nextLine().trim();

                        if (!palabraSecreta.equalsIgnoreCase("Guatemala")) {
                            System.out.println("Palabra incorrecta. Intente nuevamente.\n");
                        }
                    } while (!palabraSecreta.equalsIgnoreCase("Guatemala"));

                    System.out.println("Palabra correcta.\n");
                    break;


                case 6:
                    System.out.println("Programa finalizado correctamente.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 6.\n");
                    break;
            }

        } while (opcion != 6);

        scanner.close();
    }
}