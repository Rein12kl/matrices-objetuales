import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public ObjAlmacen[][] LlenarMatrizObjetual(int d){
        ObjAlmacen[][] matriz = new ObjAlmacen[d][d];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                ObjAlmacen obj = new ObjAlmacen();
                System.out.println("ingrese el nombre");
                obj.setNombre(sc.next());
                
                System.out.println("ingrese el precio");
                obj.setPrecio(sc.nextInt());

                System.out.println("ingrese la cantidad");
                obj.setCantidad(sc.nextInt());
                
                matriz[i][j] = obj;
            }
        }
        return matriz;
    }

    public void ImprimirMatrizObjetual(ObjAlmacen[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("NOMBRE: " + m[i][j].getNombre());
                System.out.println("PRECIO: " + m[i][j].getPrecio());
                System.out.println("CANTIDAD: " + m[i][j].getCantidad());
                System.out.println();
            }
        }
    }

    public void BuscarNombre(ObjAlmacen[][] obj) {
        String nb;
        String nombre;
        System.out.println("Ingrese el nombre del producto a buscar:");
        nb = sc.next();

        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj.length; j++) {
                nombre = obj[i][j].getNombre();
                if(nb.equals(nombre)){
                    System.out.println("El producto existe en la fila " + i+1 + " Columna " + j+1);
                }
            }
        }
    }
}
