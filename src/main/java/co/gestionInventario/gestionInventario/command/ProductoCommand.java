package co.gestionInventario.gestionInventario.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class ProductoCommand {
    private int idProducto;
    private String nombre;
    private int cantidad;
    private boolean estado;
}
