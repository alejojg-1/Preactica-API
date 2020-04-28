package co.gestionInventario.gestionInventario.controller;


import co.gestionInventario.gestionInventario.command.InventarioCommand;
import co.gestionInventario.gestionInventario.service.inventario.InventarioService;
import co.gestionInventario.gestionInventario.service.procucto.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo-inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;


    @GetMapping("/v1/listado-inventario")
    public List<InventarioCommand> findAll() {
        return inventarioService.findAll();
    }

}
