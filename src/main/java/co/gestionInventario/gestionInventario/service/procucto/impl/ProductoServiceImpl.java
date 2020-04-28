package co.gestionInventario.gestionInventario.service.procucto.impl;

import co.gestionInventario.gestionInventario.command.ProductoCommand;
import co.gestionInventario.gestionInventario.fabrica.ProductoFabrica;
import co.gestionInventario.gestionInventario.repository.ProductoRepository;
import co.gestionInventario.gestionInventario.service.procucto.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ProductoFabrica productoFabrica;

    @Override
    public List<ProductoCommand> findAll() {

        return productoFabrica.entityToCommand(productoRepository.findAll());
    }
}
