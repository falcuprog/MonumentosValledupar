package com.seminnova.mvpar.monumentosvalledupar;

public class MonumentoMarker {

    private String nombre;
    private double lat;
    private double lon;
    private String distancia;
    private String duracion;

    public MonumentoMarker(String nombre, double lat, double lon, String distancia, String duracion) {
        this.nombre = nombre;
        this.lat = lat;
        this.lon = lon;
        this.distancia = distancia;
        this.duracion = duracion;
    }

    public  MonumentoMarker(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

}
