package Modelo;

public class Vagon {
    private int codigo;
    private String marca;
    private String modelo;

    public Vagon(int codigo,String marca,String modelo){
        this.codigo=codigo;
        this.marca=marca;
        this.modelo=modelo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
}
