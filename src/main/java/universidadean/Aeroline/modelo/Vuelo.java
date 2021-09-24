package universidadean.Aeroline.modelo;

import javax.persistence.*;

@Entity
@Table(name = "vuelos")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numero;
    private String hora;
    private String fecha;
    private String piloto;
    private Long numPuerta;
    private String origen;
    private String destino;
    private boolean estado;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) { this.fecha = fecha; }

    public boolean isEstado() { return estado; }

    public void setEstado(boolean estado) { this.estado = estado; }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public Long getNumPuerta() {
        return numPuerta;
    }

    public void setNumPuerta(Long numPuerta) {
        this.numPuerta = numPuerta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
