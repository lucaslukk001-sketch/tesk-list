package teskList.domain.tesk.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class core {

    private Map<Integer, tesk> iDteskMap = new HashMap<>();
    private int ID = 1;

    public void createTesk(String tile, String tesk, LocalDateTime date, int priority) {


    }

    public static int lerInt(String entrada) {

        if (entrada.isBlank()) {
            System.out.println("Você não digitou nada. Tente novamente!");
        }

        try {
            return Integer.parseInt(entrada);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite apenas números inteiros.");
            return 0;
        }
    }


}
