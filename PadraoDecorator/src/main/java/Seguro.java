public class Seguro extends MotoDecorator {

    public Seguro(Moto moto) {
        super(moto);
    }

    public float getSomaValorMoto() {
        return 1000.0f;
    }

    public String getNomeEstrutura() {
        return "Seguro";
    }
}
