package practica;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Map;


/**
 * Main controler
 *
 * @author Lara Camila Sánchez Correa
 * @author Iván Conde Carretero
 *
 */

@Controller
public class MainControler implements WebMvcConfigurer  {


    @RequestMapping("/login")
    public String inicio(Map<String, Object> model) {
        return "login";
    }
   @RequestMapping( "/")
    public String inicio1(Map<String, Object> model) { return "login";
    }

    @RequestMapping("/menuE")
    public String menuU(Map<String, Object> model) {
        return "menuEmpleado";
    }

    @RequestMapping("/menuC")
    public String menuC(Map<String, Object> model) { return "menuCompany";
    }

    @RequestMapping("/menuA")
    public String menuA(Map<String, Object> model) { return "menuCRM";
    }

    @RequestMapping("/menuI")
    public String menuI(Map<String, Object> model) { return "menuInvitado";
    }



}


