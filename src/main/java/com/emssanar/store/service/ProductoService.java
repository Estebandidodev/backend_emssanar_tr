package com.emssanar.store.service;

import com.emssanar.store.model.Producto;
import com.emssanar.store.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private IProductoRepository iProductoReposotory;

    @Autowired
    public ProductoService(IProductoRepository ipr){
        this.iProductoReposotory = ipr;
    }

    public Producto obtenerProductoPorId(Long id) {
        return iProductoReposotory.findById(id).orElse(null);
    }

    public List<Producto> obtenerTodosLosProductos() {
        return iProductoReposotory.findAll();
    }

    public Producto actualizarProducto(Producto producto) {
        return iProductoReposotory.save(producto);
    }

    public void eliminarProducto(Long id) {
        iProductoReposotory.deleteById(id);
    }

    public Producto crearProducto(Producto producto) {
        return iProductoReposotory.save(producto);
    }
}
