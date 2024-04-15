/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Pablo
 */
public class Producto implements Comparable<Producto>{
    private int codigo;
    private String descripcion;
    private Double precio;
    private int stock;
    private Rubro rubro;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, Double precio, int stock, Rubro rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto p) {
        if (p.codigo==codigo) {
            return 0;
        }else if(p.codigo<codigo){
            return 1;
        }else{
            return -1;
        }
    }
    
    
}
