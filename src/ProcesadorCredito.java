import java.util.Date;

public class ProcesadorCredito extends ProcesadorDePago{

    @Override
    public boolean autorizarPago(Tarjeta tarjeta, double pago, Date fechaExpiracion) {
        Date fechaActual = new Date();
        TarjetaCredito tarjetaCredito = (TarjetaCredito) tarjeta;
        return tarjetaCredito.getSaldoLimite() >= pago && fechaExpiracion.after(fechaActual);
    }

}
