package co.gestionInventario.gestionInventario.repository;

import co.gestionInventario.gestionInventario.entity.InventarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<InventarioEntity,Integer> {
}
