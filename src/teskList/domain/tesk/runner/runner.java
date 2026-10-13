package teskList.domain.tesk.runner;


import java.util.Scanner;

import static teskList.domain.tesk.runner.core.lerInt;

public class runner {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CRIANDO TAREFA");
        System.out.println("_".repeat(20));

        System.out.println("digite um numero");
        int num =  lerInt(scanner.nextLine());

        System.out.println(num);
       core gerenciar = new core();

       core.gerenciar();




    }
}
