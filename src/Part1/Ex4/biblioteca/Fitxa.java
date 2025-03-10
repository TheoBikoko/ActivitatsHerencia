package Part1.Ex4.biblioteca;

import java.util.Objects;

public sealed class Fitxa permits Obra, Revista {
    protected String referencia;
    protected String titol;

    public Fitxa(String referencia, String titol) {
        this.referencia = referencia;
        this.titol = titol;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    @Override
    public String toString() {
        return "Fitxa{" +
                "referencia='" + referencia + '\'' +
                ", titol='" + titol + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fitxa fitxa = (Fitxa) o;
        return Objects.equals(referencia, fitxa.referencia);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(referencia);
    }
}


