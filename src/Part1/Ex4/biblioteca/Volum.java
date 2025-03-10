package Part1.Ex4.biblioteca;

import java.util.Objects;

public final class Volum extends Obra{
    private short nro;

    public Volum(String referencia, String titol, String autor, short nrePags, short nro) {
        super(referencia, titol, autor, nrePags);
        this.nro = nro;
    }

    public short getNro() {
        return nro;
    }

    public void setNro(short nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Volum{" +
                "referencia='" + referencia + '\'' +
                ", titol='" + titol + '\'' +
                ", autor='" + autor + '\'' +
                ", nrePags=" + nrePags +
                ", nro=" + nro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Volum volum = (Volum) o;
        return nro == volum.nro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nro);
    }
}
