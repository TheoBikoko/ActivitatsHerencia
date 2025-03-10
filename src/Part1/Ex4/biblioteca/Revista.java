package Part1.Ex4.biblioteca;

import java.util.Objects;

public final class Revista extends Fitxa{
    private short any;
    private short nro;

    public Revista (String referencia, String titol, short any, short nro){
        super(referencia, titol);
        this.any = any;
        this.nro = nro;
    }

    public short getAny() {
        return any;
    }

    public void setAny(short any) {
        this.any = any;
    }

    public short getNro() {
        return nro;
    }

    public void setNro(short nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "referencia='" + referencia + '\'' +
                ", titol='" + titol + '\'' +
                ". any=" + any +
                ", nro=" + nro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Revista revista = (Revista) o;
        return any == revista.any && nro == revista.nro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), any, nro);
    }
}
