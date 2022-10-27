package com.practica.service.Impl;


import com.practica.model.Producto;
import com.practica.repository.ProductoRepository;
import com.practica.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {


    @Autowired
    private ProductoRepository productoRepository;


    @Override
    public List<Producto> listarTodos() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public void guardar(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public Producto buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
            productoRepository.deleteById(id);
    }
}
