package gm.contactos.Controlador;

import gm.contactos.Entidad.Contacto;
import gm.contactos.Servicio.ContactoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ContactoControlador {

    private static final Logger logger= LoggerFactory.getLogger(ContactoControlador.class);

    @Autowired
    private ContactoService contactoService;

    @GetMapping("/")
    public String Iniciar(ModelMap model) {
        List<Contacto> listaContactos = contactoService.obtenerContactos();
        listaContactos.forEach((contacto) -> logger.info(contacto.toString()));
        model.put("listaContactos", listaContactos);
        return "index"; //index.html
    }

    @GetMapping("/agregar")
    public String mostrarAgregar() {
        return "agregar"; //agregar.html
    }

}
