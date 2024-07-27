import java.util.Date;

public abstract class ProcesadorDePago {

    public abstract boolean autorizarPago(Tarjeta tarjeta, double pago, Date fechaExpiracion);

}
