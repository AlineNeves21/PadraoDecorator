public class Bau extends MotoDecorator {

    public Bau(Moto moto) {
        super(moto);
    }

    public float getSomaValorMoto() {
        return 350.0f;
    }

    public String getNomeEstrutura() {
        return "Baú";
    }
}
