import java.util.Date;

public class ProcesadorDebito extends ProcesadorDePago{

    @Override
    public boolean autorizarPago(Tarjeta tarjeta, double pago, Date fechaExpiracion) {
        Date fechaActual = new Date();
        TarjetaDebito tarjetaDebito = (TarjetaDebito) tarjeta;
         return tarjetaDebito.getSaldoDisponible() >= pago && fechaExpiracion.after(fechaActual);
    }

}
