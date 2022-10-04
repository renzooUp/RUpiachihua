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
@Table(name = "categoria")
public class Categoria {

    @Id
    @Column(name = "cate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cateId;

    @Column(name = "cate_nombre")
    private String cateNombre;

    @Column(name = "cate_info")
    private String cateInfo;
}
