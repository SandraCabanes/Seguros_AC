/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sandra
 */
public class AsistenciaMedica {
    private int idAsistenciaMedica;
    private int idSeguro;
    private String breveDescripcion;
    private String lugar;
    private String explicacion;
    private String tipoAsistencia;
    private Date fecha;
    private Date hora;
    private BigDecimal importe;

    public AsistenciaMedica() {
    }

    public AsistenciaMedica(int idSeguro, String lugar, String explicacion, String tipoAsistencia) {
        this.idSeguro = idSeguro;
        this.lugar = lugar;
        this.explicacion = explicacion;
        this.tipoAsistencia = tipoAsistencia;
    }

    public int getIdAsistenciaMedica() {
        return idAsistenciaMedica;
    }

    public void setIdAsistenciaMedica(int idAsistenciaMedica) {
        this.idAsistenciaMedica = idAsistenciaMedica;
    }

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String getBreveDescripcion() {
        return breveDescripcion;
    }

    public void setBreveDescripcion(String breveDescripcion) {
        this.breveDescripcion = breveDescripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    public String getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(String tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "AsistenciaMedica{" + "idAsistenciaMedica=" + idAsistenciaMedica + ", idSeguro=" + idSeguro + ", breveDescripcion=" + breveDescripcion + ", lugar=" + lugar + ", explicacion=" + explicacion + ", tipoAsistencia=" + tipoAsistencia + ", fecha=" + fecha + ", hora=" + hora + ", importe=" + importe + '}';
    }
    
    
    
}
