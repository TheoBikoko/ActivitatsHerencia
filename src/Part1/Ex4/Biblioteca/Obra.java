package Part1.Ex4.Biblioteca;

import java.util.Objects;

public sealed class Obra extends Fitxa permits Volum{
    protected String autor;
    protected short nrePags;

    public Obra(String referencia, String titol, String autor, short nrePags) {
        super(referencia, titol);
        this.autor = autor;
        this.nrePags = nrePags;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getNrePags() {
        return nrePags;
    }

    public void setNrePags(short nrePags) {
        this.nrePags = nrePags;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "referencia='" + referencia + '\'' +
                ", titol='" + titol + '\'' +
                ", autor='" + autor + '\'' +
                ", nrePags=" + nrePags +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Obra obra = (Obra) o;
        return nrePags == obra.nrePags && Objects.equals(autor, obra.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), autor, nrePags);
    }
}
