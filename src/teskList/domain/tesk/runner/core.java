package teskList.domain.tesk.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class core {

    private Map<Integer, tesk> teskMap = new HashMap<>();
    private int ID = 1;
    private Scanner scanner = new Scanner(System.in);

    public void createTesk(String tile, String tesk, LocalDateTime date, priority priority) {
        if (tile == null || tesk == null) {
            System.out.println("titulo or tarefa invalid");
            return;
        }
        if (date == null) {
            System.out.println("data invalida");
            return;
        }
        if (priority == null) {
            System.out.println("prioridade invalida");
            return;
        }

        ID++;

        tesk terefa = new tesk(tile, priority, date, tesk, ID);
        teskMap.put(ID, terefa);


    }

    public static int lerInt(String entrada) {

        if (entrada.isBlank()) {
            System.out.println("Você não digitou nada. Tente novamente!");
        }

        try {
            return Integer.parseInt(entrada);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");
            return -1;
        }
    }

    public static LocalDateTime lerDataHora() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Cadastro de Data e Hora ---");

        int dia, mes, ano, hora, minuto;


        while (true) {
            System.out.println("Digite o dia(ex: 10):");
            dia = lerInt(scanner.nextLine());
            System.out.println("Digite o mes(ex: 12):");
            mes = lerInt(scanner.nextLine());
            System.out.println("Digite o ano(ex: 2026):");
            ano = lerInt(scanner.nextLine());

            try {

                LocalDate.of(ano, mes, dia);
                break;
            } catch (Exception e) {
                System.out.println("❌ Data inválida! Esse dia não existe neste mês/ano. Tente novamente.\n");
            }
        }


        while (true) {
            System.out.println("Digite o hora(0 a 23):");
            hora = lerInt(scanner.nextLine());
            if (hora >= 0 && hora <= 23) {
                break;
            }
            System.out.println("❌ Hora inválida! Digite um valor entre 0 e 23.");
        }


        while (true) {
            System.out.println("Digite o minuto(0 a 59):");
            minuto = lerInt(scanner.nextLine());
            if (minuto >= 0 && minuto <= 59) {
                break;
            }
            System.out.println("❌ Minuto inválido! Digite um valor entre 0 e 59.");
        }


        return LocalDateTime.of(ano, mes, dia, hora, minuto);
    }






}
