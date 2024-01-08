package Modelo;

public class Locomotora  {
    private int codigo;
    private String marca;
    private String modelo;
    private char tipo; 
    private int potencia;

    public Locomotora(int codigo,String marca,String modelo,char tipo,int potencia){
        this.codigo=codigo;
        this.marca=marca;
        this.modelo=modelo;
        this.tipo=tipo;
        this.potencia=potencia;
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
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
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
    public int getPotencia() {
        return potencia;
    }
    public char getTipo() {
        return tipo;
    }
     public String toString() {
        return "Locomotora{" +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo=" + tipo +
                ", potencia=" + potencia +
                '}';
    }
}
