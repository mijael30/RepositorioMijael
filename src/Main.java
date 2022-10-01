import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese un número");
    int n=sc.nextInt();
    int x=1;
    for (int i=1; i<=n; i++) {
        x=x*i;
        System.out.println(x);
    }
        System.out.println("El factorial es:" +x);
    }

}