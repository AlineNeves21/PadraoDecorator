public abstract class MotoDecorator implements Moto{

    private Moto moto;
    public String estrutura;

    public MotoDecorator(Moto moto) {
        this.moto = moto;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public abstract float getSomaValorMoto();

    public float getValorMoto() {
        return this.moto.getValorMoto() + this.getSomaValorMoto();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.moto.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
