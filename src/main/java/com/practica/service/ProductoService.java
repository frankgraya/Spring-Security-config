package com.practica.service;

import com.practica.model.Producto;
import com.practica.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductoService {

    public List<Producto> listarTodos();
    public void guardar(Producto cliente);
    public Producto buscarPorId(Long id);
    public void eliminar(Long id);

}
