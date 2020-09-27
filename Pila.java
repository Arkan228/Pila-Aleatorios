package pila;

import java.util.Scanner;

public class Pila {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tope = 0, op = 0;
        System.out.println("\nEsta pila trabaja con letras...");
        char pila[] = new char[26];
        do {
            System.out.println("\nIngrese una opcion...\n");
            System.out.println("1.- Ingresar dato...\n");
            System.out.println("2.- Mostrar pila...\n");
            System.out.println("3.- Llenar pila alfabeticamente...\n");
            System.out.println("4.- Llenar pila aleatoriamente...\n");
            System.out.println("5.- Borrar ultimo dato...\n");
            System.out.println("6.- Ordenar pila alfabeticamente...\n");
            System.out.println("7.- Salir...\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    if (tope == 26) {
                        System.out.println("\nLa pila esta llena...\n");
                    } else {
                        System.out.println("\nIngrese la letra en MAYUSCULA...\n");
                        pila[tope] = sc.next().charAt(0);
                        tope++;
                    }
                    break;
                case 2:
                    if (tope == 0) {
                        System.out.println("\nLa pila esta vacia...\n");
                    } else {
                        System.out.println("\n---Mostrando pila---\n");
                        for (int x = tope - 1; x >= 0; x--) {
                            System.out.print(" " + pila[x]);
                        }
                        System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                    }
                    break;
                case 3:
                    if (tope == 26) {
                        System.out.println("\nLa pila esta llena\n");
                    } else {
                        int x = 65;
                        for (; tope < 26; tope++) {
                            pila[tope] = (char) x;
                            x++;
                        }

                        System.out.println("\nPila llena automaticamente...\n");
                    }
                    break;
                case 4:
                    if (tope == 26) {
                        System.out.println("\nLa pila esta llena\n");
                    } else {
                        for (; tope < 26; tope++) {
                            pila[tope] = (char) Math.floor((Math.random() * (90 - 65 + 1)) + 65);
                        }
                        System.out.println("\nPila llena automaticamente...\n");
                    }
                    break;
                case 5:
                    if (tope == 0) {
                        System.out.println("\nNo hay elementos para borrar...\n");
                    } else {
                        tope--;
                        System.out.println("\nElemento eliminado...\n");
                    }
                    break;
                case 6:
                    char aux;
                    for (int c1 = 0; c1 < tope; c1++) {
                        for (int c2 = 0; c2 < tope - 1; c2++) {
                            if (pila[c2] < pila[c2 + 1]) {
                                aux = pila[c2];
                                pila[c2] = pila[c2 + 1];
                                pila[c2 + 1] = aux;
                            }
                        }
                    }
                    System.out.println("\nPila ordenada...\n");
                    break;

            }
        } while (op != 7);

    }
}
