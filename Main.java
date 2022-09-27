import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String path = in.nextLine();

        String str;
        String readText = "";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        if ((str = bufferedReader.readLine()) != null) {
            readText = readText + str;
        }

        String simvol = "Количество символов в тексте: " + readText.length();
        String space = "Количество символов в тексте без пробелов: " + readText.replaceAll(" ", "").length();
        String slova = "Количество слов в тексте: " + readText.split(" ").length;

        System.out.println(simvol);
        System.out.println(space);
        System.out.println(slova);

        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(simvol);
        fileWriter.write("\n" + space);
        fileWriter.write("\n" + slova);
        fileWriter.flush();
    }
}
