package model;

public class Producto {
    public static final String PRODUCTO_REQUERIDO="El nombre de producto es requerido";
    private int idProducto;
    private String nombre;
    private int cantidad;
    private boolean estado;

    private Producto() {
        super();
    }


    public static class productoBuilder{
        private int idProducto;
        private String nombre;
        private int cantidad;
        private boolean estado;

        public productoBuilder setIdProducto(int idProducto) {
            this.idProducto = idProducto;
            return this;
        }

        public productoBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public productoBuilder setCantidad(int cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public productoBuilder setEstado(boolean estado) {
            this.estado = estado;
            return this;
        }
        public Producto build(){
            Producto producto=new Producto();
            producto.idProducto =this.idProducto;
            producto.cantidad=this.cantidad;
            producto.nombre=this.nombre;
            producto.estado=this.estado;

            return producto;
        }
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean isEstado() {
        return estado;
    }
}
