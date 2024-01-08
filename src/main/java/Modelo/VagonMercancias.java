package Modelo;

public class VagonMercancias extends Vagon {
    private double capacidadCarga;
    private String tipoMercancia;

    public VagonMercancias(int codigo, String marca, String modelo, double capacidadCarga, String tipoMercancia) {
        super(codigo, marca, modelo);
        this.capacidadCarga = capacidadCarga;
        this.tipoMercancia = tipoMercancia;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public String toString() {
        return "VagonMercancias{" +
                "codigo=" + getCodigo() +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", capacidadCarga=" + capacidadCarga +
                ", tipoMercancia='" + tipoMercancia + '\'' +
                '}';
    }
}
