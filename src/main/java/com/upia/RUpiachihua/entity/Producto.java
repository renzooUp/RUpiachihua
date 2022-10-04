package com.upia.RUpiachihua.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto {
// 6
    @Id
    @Column(name = "prod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodId;

    @Column(name = "prod_nombre")
    private String prodNombre;

    @Column(name = "prod_descripcion")
    private String prodDescripcion;

    @Column(name = "prod_fecha_vencimiento")
    private String prodFechaVencimiento;

    @Column(name = "prod_precio")
    private String prodPrecio;

    @Column(name = "prod_cantidad")
    private String prodCantidad;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "cate_id")
    private Categoria categoria;
}
