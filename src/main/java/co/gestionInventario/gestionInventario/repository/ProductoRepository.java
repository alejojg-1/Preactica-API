package co.gestionInventario.gestionInventario.repository;

import co.gestionInventario.gestionInventario.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity,Integer> {
}
