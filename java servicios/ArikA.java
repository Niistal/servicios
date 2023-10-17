import java.util.Scanner;

public class ArikA {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write string");
        String line = sc.nextLine();
        String me = "this is the other string";
        System.out.println(line + " " + me);
        sc.close();
    }
}