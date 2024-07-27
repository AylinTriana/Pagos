import java.util.Date;

public class TarjetaCredito  extends Tarjeta {
    private double saldoLimite;
    private double saldoUtilizado;

    public TarjetaCredito(int numeros, int codigoDeSeguridad, Date fechaDeExpiracion, double saldoLimite, double saldoUtilizado) {
        super(numeros, codigoDeSeguridad, fechaDeExpiracion);
        this.saldoLimite = saldoLimite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public double getSaldoLimite() {
        return saldoLimite;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }
}
