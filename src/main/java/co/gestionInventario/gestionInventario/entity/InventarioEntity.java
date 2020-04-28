package co.gestionInventario.gestionInventario.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.Producto;

import javax.persistence.*;

@Data
@Entity
@Table( name = "inventario")
@NoArgsConstructor
public class InventarioEntity {

    @Id
    @Column(name = "idInventario")
    private int idInventario;
    @Column(name = "cantidadInventario")
    private int cantidadInventario;
    @ManyToOne
    @JoinColumn(name = "idProducto", unique = true)
    private ProductoEntity producto;
    @Column(name = "limiteInferiro")
    private int limiteInferio;
    @Column(name = "limiteSuperior")
    private int limiteSuperior;

}


