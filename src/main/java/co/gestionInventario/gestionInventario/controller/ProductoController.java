package co.gestionInventario.gestionInventario.controller;

import co.gestionInventario.gestionInventario.command.ProductoCommand;
import co.gestionInventario.gestionInventario.service.procucto.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo-producto")
public class ProductoController {


    @Autowired
    private ProductoService productoService;


    @GetMapping("/v1/listado-tarifas")
    public List<ProductoCommand> findAll() {
        return productoService.findAll();
    }

}



