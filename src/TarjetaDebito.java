import java.util.Date;

public class TarjetaDebito extends Tarjeta{
    private double saldoDisponible;

    public TarjetaDebito(int numeros, int codigoDeSeguridad, Date fechaDeExpiracion, double saldoDisponible) {
        super(numeros, codigoDeSeguridad, fechaDeExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }
}
