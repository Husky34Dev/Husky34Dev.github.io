package Modelo;

public class VagonPasajeros extends Vagon {
    private int numeroAsientos;

    public VagonPasajeros(int codigo, String marca, String modelo, int numeroAsientos) {
        super(codigo, marca, modelo);
        this.numeroAsientos = numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    @Override
    public String toString() {
        return "VagonPasajeros{" +
                "codigo=" + getCodigo() +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", numeroAsientos=" + numeroAsientos +
                '}';
    }
}
