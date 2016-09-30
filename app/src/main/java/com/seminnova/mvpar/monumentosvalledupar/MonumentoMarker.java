package com.seminnova.mvpar.monumentosvalledupar;

public class MonumentoMarker {

    private String nombre;
    private double lat;
    private double lon;
    private String distanciakm;
    private String duracion;
    private String distanciamt;

    public  MonumentoMarker(){}

    public MonumentoMarker(String nombre, double lat, double lon, String distanciakm, String duracion, String distanciamt) {
        this.nombre = nombre;
        this.lat = lat;
        this.lon = lon;
        this.distanciakm = distanciakm;
        this.duracion = duracion;
        this.distanciamt = distanciamt;
    }

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

    public String getDistanciakm() {
        return distanciakm;
    }

    public void setDistanciakm(String distanciakm) {
        this.distanciakm = distanciakm;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDistanciamt() {
        return distanciamt;
    }

    public void setDistanciamt(String distanciamt) {
        this.distanciamt = distanciamt;
    }
}
