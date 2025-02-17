import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        System.out.println("ingrese la dimension de la matriz objetual");
        int d = sc.nextInt();
        System.out.println("Elija una opcion:");
        opt = sc.nextInt();
        Metodos m = new Metodos();
        ObjAlmacen[][] M = new ObjAlmacen[d][d];
        M = m.LlenarMatrizObjetual(d);
        System.out.println();
        m.ImprimirMatrizObjetual(M);

        switch (opt) {
            case 1:
                m.BuscarNombre(M);
                break;

            case 2:
                
                break;
        
            default:
                break;
        }

    }
}