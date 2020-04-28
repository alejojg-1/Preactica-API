package co.gestionInventario.gestionInventario.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.Producto;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class InventarioCommand {
    private int idInventario;
    private int cantidadInventario;
    private Producto producto;
    private int limiteInferio;
    private int limiteSuperior;

}
