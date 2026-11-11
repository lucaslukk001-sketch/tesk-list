package teskList.domain.tesk.runner;
import java.util.Scanner;
public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Core core = new Core();


        core.gerenciar();

        core.searchTesk();

        core.print();
    }
}
