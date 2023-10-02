///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Entidades;
//
//import java.time.LocalDate;
//
///**
// *
// * @author Melina
// */
//public class Bombero {
//private int idBombero;
//    private int dni;
//    private String apellido;
//    private String nombre;
//    private LocalDate fechaNacimiento;
//    private String grupoSanguineo;
//    private String celular;
//    private int codBrigada;
//
//    public Bombero() {
//    }
//    public Bombero(int idBombero, int dni, String apellido, String nombre, LocalDate fechaNacimiento, String grupoSanguineo, String celular, int codBrigada) {
//        this.idBombero = idBombero;
//        this.dni = dni;
//        this.apellido = apellido;
//        this.nombre = nombre;
//        this.fechaNacimiento = fechaNacimiento;
//        this.grupoSanguineo = grupoSanguineo;
//        this.celular = celular;
//        this.codBrigada = codBrigada;
//    }
//    public Bombero(int dni, String apellido, String nombre, LocalDate fechaNacimiento, String grupoSanguineo, String celular, int codBrigada) {
//        this.dni = dni;
//        this.apellido = apellido;
//        this.nombre = nombre;
//        this.fechaNacimiento = fechaNacimiento;
//        this.grupoSanguineo = grupoSanguineo;
//        this.celular = celular;
//        this.codBrigada = codBrigada;
//    }
//
//    public int getIdBombero() {
//        return idBombero;
//    }
//    public void setIdBombero(int idBombero) {
//        this.idBombero = idBombero;
//    }
//    public int getDni() {
//        return dni;
//    }
//    public void setDni(int dni) {
//        this.dni = dni;
//    }
//    public String getApellido() {
//        return apellido;
//    }
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//    public String getNombre() {
//        return nombre;
//    }
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//    public LocalDate getFechaNacimiento() {
//        return fechaNacimiento;
//    }
//    public void setFechaNac(LocalDate fechaNacimiento) {
//        this.fechaNacimiento = fechaNacimiento;
//    }
//    public String getGrupoSang() {
//        return grupoSanguineo;
//    }
//    public void setGrupoSanguineo(String grupoSanguineo) {
//        this.grupoSanguineo = grupoSanguineo;
//    }
//    public String getCelular() {
//        return celular;
//    }
//    public void setCelular(String celular) {
//        this.celular = celular;
//    }
//    public int getCodBrigada() {
//        return codBrigada;
//    }
//    public void setCodBrigada(int codBrigada) {
//        this.codBrigada = codBrigada;
//    }   
//
//    @Override
//    public String toString() {
//        return "Bombero{" + "idBombero=" + idBombero + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", grupoSanguineo=" + grupoSanguineo + ", celular=" + celular + ", codBrigada=" + codBrigada + '}';
//    }
//    
//
//    
//    
//}