import java.util.Date;

public class Tarjeta {
    private int numeros;
    private int codigoDeSeguridad;
    private Date fechaDeExpiracion;

    public Tarjeta(int numeros, int codigoDeSeguridad, Date fechaDeExpiracion) {
        this.numeros = numeros;
        this.codigoDeSeguridad = codigoDeSeguridad;
        this.fechaDeExpiracion = fechaDeExpiracion;
    }

    public int getNumeros() {
        return numeros;
    }

    public int getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }

    public Date getFechaDeExpiracion() {
        return fechaDeExpiracion;
    }
}
