package co.gestionInventario.gestionInventario.service.procucto;

import co.gestionInventario.gestionInventario.command.ProductoCommand;

import java.util.List;

public interface ProductoService {

    List<ProductoCommand> findAll();
}
