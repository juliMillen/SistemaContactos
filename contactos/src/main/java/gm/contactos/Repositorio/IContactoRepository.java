package gm.contactos.Repositorio;

import gm.contactos.Entidad.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactoRepository extends JpaRepository<Contacto,Integer> {
}
