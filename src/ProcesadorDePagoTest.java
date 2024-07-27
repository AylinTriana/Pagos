import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class ProcesadorDePagoTest {

        @Test
    public void comprobarPago(){

        Tarjeta tarjetaC1 = new TarjetaCredito(1597347852,435, new Date(124,9,26), 700, 500);
        Tarjeta tarjetaD1 = new TarjetaDebito(985647851, 333, new Date(124,8,25), 900);
        ProcesadorDebito debito = new ProcesadorDebito();
        ProcesadorCredito credito = new ProcesadorCredito();

        boolean pagoTc = credito.autorizarPago(tarjetaC1, 100, tarjetaC1.getFechaDeExpiracion());
        boolean pagoTd = debito.autorizarPago(tarjetaD1, 800, tarjetaD1.getFechaDeExpiracion());

            Assertions.assertTrue(pagoTc);
            Assertions.assertTrue(pagoTd);

    }
}


