import java.util.Scanner;

public class Main {

    private void sayHello(){
        System.out.println("Hello!");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a quantidade em estoque");
        int estoque = scanner.nextInt();

        int pacoteCompraLoja = 5;
        int pacoteVendaLoja = 2;


        while(estoque != 0){
            if(estoque > 0) {
                System.out.println("Continuo vendendo... | excesso = "  + estoque);
                estoque -= pacoteVendaLoja;
            } else {
                System.out.println("Continuo comprando... | para repor = "  + Math.abs(estoque));
                estoque += pacoteCompraLoja;
            }
        }

    }
}

