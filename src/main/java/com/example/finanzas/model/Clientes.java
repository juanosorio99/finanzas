package com.example.finanzas.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCliente;
    String  tipoIdentificacion;
    String  numeroIdentificacion;
    String  nombres;
    String  apellido;
    String  correoElectronico;
    Date    fechaNacimiento;
    Date    fechaCreacion;
    Date    fechaModificacion;

    public String getNombres() {
        return nombres;
    }

 /*
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdProducto() {

        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }*/
}

