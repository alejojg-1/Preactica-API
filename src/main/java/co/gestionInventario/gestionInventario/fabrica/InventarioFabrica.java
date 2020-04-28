package co.gestionInventario.gestionInventario.fabrica;

import co.gestionInventario.gestionInventario.command.InventarioCommand;
import co.gestionInventario.gestionInventario.entity.InventarioEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InventarioFabrica {

    public List<InventarioCommand> entityToCommand(List<InventarioEntity> listaProductoEntity) {
        List<InventarioCommand> listaInventarioCommand=new ArrayList<>();
        listaProductoEntity.forEach(e -> listaInventarioCommand.add(entityToCommand(e)));

        return listaInventarioCommand;
    }

    public InventarioCommand entityToCommand(InventarioEntity inventarioEntity){
        InventarioCommand inventarioCommand= new InventarioCommand();
        inventarioCommand.setIdInventario(inventarioEntity.getIdInventario());
        inventarioCommand.setCantidadInventario(inventarioEntity.getCantidadInventario());
        inventarioCommand.setLimiteInferio(inventarioEntity.getLimiteInferio());
        inventarioCommand.setLimiteSuperior(inventarioEntity.getLimiteSuperior());
        return inventarioCommand;
    }
}
