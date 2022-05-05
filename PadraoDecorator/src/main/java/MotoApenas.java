public class MotoApenas implements Moto {

    public float valorMoto;

    public MotoApenas() {
    }

    public MotoApenas(float valorMoto) {
        this.valorMoto = valorMoto;
    }

    public float getValorMoto() {
        return valorMoto;
    }

    public String getEstrutura() {
        return "Moto";
    }

}
