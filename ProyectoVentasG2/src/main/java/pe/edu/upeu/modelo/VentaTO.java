package pe.edu.upeu.modelo;

import lombok.Setter;


@Setter
public class VentaTO {
    public String idVenta, dniCliente, fechaVenta;
    public double netoTotal, igv, precioTotal;
}
