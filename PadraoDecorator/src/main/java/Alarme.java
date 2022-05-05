public class Alarme extends MotoDecorator {

    public Alarme(Moto moto) {
            super(moto);
        }

        public float getSomaValorMoto() {
            return 200.0f;
        }

        public String getNomeEstrutura() {
            return "Alarme";
        }
}
