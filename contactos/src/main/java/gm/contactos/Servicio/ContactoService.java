package gm.contactos.Servicio;

import gm.contactos.Entidad.Contacto;
import gm.contactos.Repositorio.IContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactoService {

    @Autowired
    private IContactoRepository contactoRepository;


    public List<Contacto> obtenerContactos() {
        return contactoRepository.findAll();
    }

    public Contacto obtenerContactoPorId(Integer id) {

        Contacto buscado = contactoRepository.findById(id).orElse(null);
        return buscado;

    }

    public void guardarContacto(Contacto contacto) {
        if(contacto != null) {
            contactoRepository.save(contacto);
        }else{
            System.out.println("No se puede agregar la contacto");
        }
    }

    public void eliminarContacto(Contacto contacto) {
        if(contacto != null) {
            contactoRepository.delete(contacto);
        }else{
            System.out.println("No se puede eliminar la contacto");
        }
    }
}
