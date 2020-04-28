package co.gestionInventario.gestionInventario.fabrica;

import co.gestionInventario.gestionInventario.command.ProductoCommand;
import co.gestionInventario.gestionInventario.entity.ProductoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductoFabrica {


    public List<ProductoCommand> entityToCommand(List<ProductoEntity> listaProductoEntity) {
        List<ProductoCommand> listaProductoCommand=new ArrayList<>();
        listaProductoEntity.forEach(e -> listaProductoCommand.add(entityToCommand(e)));

        return listaProductoCommand;
    }

    public ProductoCommand entityToCommand(ProductoEntity productoEntity){
        ProductoCommand productoCommand= new ProductoCommand();
        productoCommand.setIdProducto(productoEntity.getIdProducto());
        productoCommand.setCantidad(productoEntity.getCantidad());
        productoCommand.setNombre(productoEntity.getNombre());
        productoCommand.setEstado(productoEntity.isEstado());
        return productoCommand;
    }
}
