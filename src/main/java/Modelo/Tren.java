package Modelo;
import Modelo.Locomotora;
import java.time.LocalTime;
import java.util.Arrays;


public class Tren {
    Locomotora locomotora;
    Vagon vagones[];
    private String destino;
    private LocalTime horaLlegada;
    private LocalTime horaSalida;
    private int numeroVia;

    public Tren(Locomotora locomotora, Vagon vagon[], String destino, LocalTime horaLlegada, LocalTime horaSalida,
            int numeroVia) {
        this.locomotora = locomotora;
        this.vagones = vagon;
        this.destino = destino;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.numeroVia = numeroVia;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public String toString() {
        String descripcion;
        descripcion = "locomotora: \n "
                + "Codigo: " + this.locomotora.getCodigo()
                + "\n Marca: " + this.locomotora.getMarca()
                + "\n Modelo: " + this.locomotora.getModelo()
                + "\n Tipo: " + this.locomotora.getTipo()
                + "\n Potencia: " + this.locomotora.getPotencia() + "CV"
                + "\n Hora de Salida: " + this.horaSalida
                + "\n Hora de llegada: " + this.horaLlegada
                + "\n Vía: " + this.numeroVia
                + "\n Vagones: \n";

        // Iterar a través de los vagones
        for (Vagon vagon : this.vagones) {
            if (vagon instanceof VagonPasajeros) {
                // Si es un VagonPasajeros
                descripcion += "  - Codigo: " + vagon.getCodigo()
                        + "\n    Marca: " + vagon.getMarca()
                        + "\n    Modelo: " + vagon.getModelo()
                        + "\n    Numero de Asientos: " + ((VagonPasajeros) vagon).getNumeroAsientos()
                        + "\n";
            } else if (vagon instanceof VagonMercancias) {
                // Si es un VagonMercancias
                descripcion += "  - Codigo: " + vagon.getCodigo()
                        + "\n    Marca: " + vagon.getMarca()
                        + "\n    Modelo: " + vagon.getModelo()
                        + "\n    Capacidad de Carga: " + ((VagonMercancias) vagon).getCapacidadCarga() + " toneladas"
                        + "\n";
            }
        }

        return descripcion;
    }

    public String getDestino() {
        return destino;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public int getNumeroVia() {
        return numeroVia;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public void setNumeroVia(int numeroVia) {
        this.numeroVia = numeroVia;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }
     public static void main(String[] args) {
        Locomotora cabeza=new Locomotora(1, "renfe", "ave", 'E', 150);
        VagonMercancias merc1=new VagonMercancias(2, "renfe", "MEDIO", 9000,"Automoviles");
        VagonPasajeros pas1=new VagonPasajeros(3, "renfe", null, 50);
        VagonPasajeros pas2=new VagonPasajeros(4, "renfe", null, 50);
        VagonPasajeros pas3=new VagonPasajeros(5, "renfe", null, 50);
        Vagon cola[]={merc1,pas1,pas2,pas3};
        Tren trenecito=new Tren(cabeza, cola,"Madrid",LocalTime.of(8,30),LocalTime.of(6,0),5);
        System.out.println(trenecito.toString());

    }

}

