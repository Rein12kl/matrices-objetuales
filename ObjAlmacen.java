public class ObjAlmacen {
    private String nombre;
    private int Precio;
    private int Cantidad;
     //----------------------------------------------------------------
    public ObjAlmacen(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        Precio = precio;
        Cantidad = cantidad;
    }

    

    public ObjAlmacen() {

        
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return Precio;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    
}