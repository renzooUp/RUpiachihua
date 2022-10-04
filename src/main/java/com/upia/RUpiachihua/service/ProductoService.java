/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.upia.RUpiachihua.service;

import com.upia.RUpiachihua.entity.Producto;
import java.util.List;

public interface ProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);

    public Producto save(Producto producto);

    public void delete(Producto producto);

    public void deleteById(Long id);
}
