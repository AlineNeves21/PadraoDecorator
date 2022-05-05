import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotoTest {
    @Test
    void deveRetornarValorMotoApenas() {
        Moto moto = new MotoApenas(1000.0f);

        assertEquals(1000.0f, moto.getValorMoto());
    }

    @Test
    void deveRetornarValorMotoComBau() {
        Moto moto = new Bau(new MotoApenas(1000.0f));

        assertEquals(1350.0f, moto.getValorMoto());
    }

    @Test
    void deveRetornarValorMotoComSeguro() {
        Moto moto = new Seguro(new MotoApenas(1000.0f));

        assertEquals(2000.0f, moto.getValorMoto());
    }

    @Test
    void deveRetornarValorMotoComAlarme() {
        Moto moto = new Alarme(new MotoApenas(1000.0f));

        assertEquals(1200.0f, moto.getValorMoto());
    }

    @Test
    void deveRetornarValorMotoComSeguroMaisAlarme() {
        Moto moto = new Seguro(new Alarme(new MotoApenas(1000.0f)));

        assertEquals(2200.0f, moto.getValorMoto());
    }

    @Test
    void deveRetornarValorMotoComAlarmeMaisBau() {
        Moto moto = new Bau(new Alarme(new MotoApenas(1000.0f)));

        assertEquals(1550.0f, moto.getValorMoto());
    }

    @Test
    void deveRetornarValorMotoComBauMaisSeguro() {
        Moto moto = new Bau(new Seguro(new MotoApenas(1000.0f)));

        assertEquals(2350.0f, moto.getValorMoto());
    }

    @Test

    void deveRetornarValorMotoComSeguroMaisAlarmeMaisBau() {
        Moto moto = new Alarme(new Bau(new Seguro(new MotoApenas(1000.0f))));

        assertEquals(2550.0f, moto.getValorMoto());
    }

    @Test
    void deveRetornarEstruturaMoto() {
        Moto moto = new MotoApenas();

        assertEquals("Moto", moto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaMotoComSeguro() {
        Moto moto = new Seguro(new MotoApenas());

        assertEquals("Moto/Seguro", moto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaMotoComAlarme() {
        Moto moto = new Alarme(new MotoApenas());

        assertEquals("Moto/Alarme", moto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaMotoComBau() {
        Moto moto = new Bau(new MotoApenas());

        assertEquals("Moto/Baú", moto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaMotoComBauMaisAlarme() {
        Moto moto = new Alarme(new Bau (new MotoApenas()));

        assertEquals("Moto/Baú/Alarme", moto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaMotoComSeguroMaisBau() {
        Moto moto = new Bau(new Seguro (new MotoApenas()));

        assertEquals("Moto/Seguro/Baú", moto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaMotoComSeguroMaisAlarme() {
        Moto moto = new Alarme(new Seguro (new MotoApenas()));

        assertEquals("Moto/Seguro/Alarme", moto.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaMotoComSeguroMaisAlarmeMaisBau() {
        Moto moto = new Bau(new Alarme(new Seguro (new MotoApenas())));

        assertEquals("Moto/Seguro/Alarme/Baú", moto.getEstrutura());
    }



}
