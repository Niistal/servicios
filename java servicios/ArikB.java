import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ArikB {
    public static void main(String[] args) throws IOException {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("java", "ArikA");
            Process process = processBuilder.start();
            Writer writer =  new  BufferedWriter (
                new OutputStreamWriter(process.getOutputStream()));
            BufferedReader bfreader = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("enter string: \n");
            String input = bfreader.readLine();
            writer.write(input);
            writer.flush();
            writer.close();
            InputStream inputStream = process.getInputStream(); // Read and print the output of program A
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
