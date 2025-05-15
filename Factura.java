package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Factura {
    private String id;
    private double total;
    LinkedList<DetalleFactura>detalleFacturas;


    public Factura(String id) {
        this.id = id;
        detalleFacturas=new LinkedList<>();
        this.total = calcularTotal();     
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }


    public LinkedList<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }


    public void setDetalleFacturas(LinkedList<DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }




    public void agregarDetalleFactura(DetalleFactura detalleFactura) {
        detalleFacturas.add(detalleFactura);
    }


    @Override
    public String toString() {
        return "\n\n\n-----------------Factura---------------\nId: " + id + "\nTotal: " + total + "\n\n--------------Detalle Factura------------\n" + detalleFacturas + "\n";
    }

    public double calcularTotal(){
        total=0;
        for (DetalleFactura detalleFactura : detalleFacturas) {
            total += detalleFactura.getSubtotal();
        }
        return total;

    }




    
    
}
