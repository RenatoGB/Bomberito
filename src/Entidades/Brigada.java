
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Melina
 */
public class Brigada {
     private int idBrigada;
    private String nombreBrigada;
    private String especialidad;
    private boolean libre;
    private int nroCuartel;

    public Brigada() {
    }

    public Brigada(int idBrigada, String nombreBrigada, String especialidad, boolean libre, int nroCuartel) {
        this.idBrigada = idBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nroCuartel = nroCuartel;
    }

    public Brigada(String nombreBrigada, String especialidad, boolean libre, int nroCuartel) {
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nroCuartel = nroCuartel;
    }

    public int getIdBrigada() {
        return idBrigada;
    }
    public void setIdBrigada(int idBrigada) {
        this.idBrigada = idBrigada;
    }
    public String getNombreBrigada() {
        return nombreBrigada;
    }
    public void setNombreBrigada(String nombreBrigada) {
        this.nombreBrigada = nombreBrigada;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public boolean isLibre() {
        return libre;
    }
    public void setLibre(boolean libre) {
        this.libre = libre;
    }
    public int getNroCuartel() {
        return nroCuartel;
    }
    public void setNroCuartel(int nroCuartel) {
        this.nroCuartel = nroCuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "idBrigada=" + idBrigada + ", nombreBrigada=" + nombreBrigada + ", especialidad=" + especialidad + ", libre=" + libre + ", nroCuartel=" + nroCuartel + '}';
    }

}