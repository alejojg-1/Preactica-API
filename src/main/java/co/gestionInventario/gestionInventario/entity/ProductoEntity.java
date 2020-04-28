package co.gestionInventario.gestionInventario.entity;



import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "producto")
@NoArgsConstructor
public class ProductoEntity {

    @Id
    @Column(name="idProducto")
    private int idProducto;
    @Column(name="nombre")
    private String nombre;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="estado")
    private boolean estado;


}
