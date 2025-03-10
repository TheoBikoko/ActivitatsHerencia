package Part2.Ex3.classes;

public class Aula extends Espai{
    private int aforamentMaxim;
    private boolean teCadiresDePala;
    private int nombreOrdinadors;
    private boolean teConnectorsDeXarxa;

    public Aula(int id, double superficie, boolean teLlumNatural, double consumElectric, int aforamentMaxim, boolean teCadiresDePala, int nombreOrdinadors, boolean teConnectorsDeXarxa) {
        super(id, superficie, teLlumNatural, consumElectric);
        this.aforamentMaxim = aforamentMaxim;
        this.teCadiresDePala = teCadiresDePala;
        this.nombreOrdinadors = nombreOrdinadors;
        this.teConnectorsDeXarxa = teConnectorsDeXarxa;
    }



    public int getAforamentMaxim() {
        return aforamentMaxim;
    }

    public void setAforamentMaxim(int aforamentMaxim) {
        this.aforamentMaxim = aforamentMaxim;
    }

    public boolean isTeCadiresDePala() {
        return teCadiresDePala;
    }

    public void setTeCadiresDePala(boolean teCadiresDePala) {
        this.teCadiresDePala = teCadiresDePala;
    }

    public int getNombreOrdinadors() {
        return nombreOrdinadors;
    }

    public void setNombreOrdinadors(int nombreOrdinadors) {
        this.nombreOrdinadors = nombreOrdinadors;
    }

    public boolean isTeConnectorsDeXarxa() {
        return teConnectorsDeXarxa;
    }

    public void setTeConnectorsDeXarxa(boolean teConnectorsDeXarxa) {
        this.teConnectorsDeXarxa = teConnectorsDeXarxa;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "aforamentMaxim=" + aforamentMaxim +
                ", teCadiresDePala=" + teCadiresDePala +
                ", nombreOrdinadors=" + nombreOrdinadors +
                ", teConnectorsDeXarxa=" + teConnectorsDeXarxa +
                ", id=" + id +
                ", superficie=" + superficie +
                ", teLlumNatural=" + teLlumNatural +
                ", consumElectric=" + consumElectric +
                '}';
    }
}
