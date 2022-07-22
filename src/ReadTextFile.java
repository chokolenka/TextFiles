import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "src/com/company/data/data";
        StringBuilder sb = new StringBuilder(); // используется для чтения
        try (FileReader fr = new FileReader(fileName)) {
            //выводим кодировку
            System.out.println(fr.getEncoding());
            int i;
            while ((i=fr.read())!=-1)
                sb.append((char)i);
            // прочитали текст
            System.out.println(sb);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}