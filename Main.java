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

        String sim = "Количество символов в тексте: " + readText.length();
        String pr = "Количество символов в тексте без пробелов: " + readText.replaceAll(" ", "").length();
        String sl = "Количество слов в тексте: " + readText.split(" ").length;

        System.out.println(sim);
        System.out.println(pr);
        System.out.println(sl);

        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(sim);
        fileWriter.write("\n" + pr);
        fileWriter.write("\n" + sl);
        fileWriter.flush();
    }
}
