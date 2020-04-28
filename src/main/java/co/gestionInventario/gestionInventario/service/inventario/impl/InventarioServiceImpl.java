package co.gestionInventario.gestionInventario.service.inventario.impl;

import co.gestionInventario.gestionInventario.command.InventarioCommand;
import co.gestionInventario.gestionInventario.fabrica.InventarioFabrica;
import co.gestionInventario.gestionInventario.repository.InventarioRepository;
import co.gestionInventario.gestionInventario.repository.ProductoRepository;
import co.gestionInventario.gestionInventario.service.inventario.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioServiceImpl implements InventarioService {

    @Autowired
    private InventarioRepository invetarioRepository;

    @Autowired
    private InventarioFabrica inventarioFabrica;

    @Override
    public List<InventarioCommand> findAll() {

        return inventarioFabrica.entityToCommand(invetarioRepository.findAll());
    }
}
