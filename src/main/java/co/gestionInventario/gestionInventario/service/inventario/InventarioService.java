package co.gestionInventario.gestionInventario.service.inventario;

import co.gestionInventario.gestionInventario.command.InventarioCommand;

import java.util.List;

public interface InventarioService {
    List<InventarioCommand> findAll();
}
