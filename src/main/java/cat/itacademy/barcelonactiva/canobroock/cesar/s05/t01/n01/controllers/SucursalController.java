package cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.controllers;

import cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.canobroock.cesar.s05.t01.n01.model.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listSucursales", sucursalService.getAllSucursales());
        return "index";
    }

    @GetMapping("/getAll")
    public String getAll(Model model) {
        // create model attribute to bind form data
        Sucursal sucursal = new Sucursal();
        model.addAttribute("sucursal", sucursal);
        return "new_sucursal";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("sucursal") Sucursal sucursal) {
        // save sucursal to database
        sucursalService.saveSucursal(sucursal);
        return "redirect:/";
    }

    @GetMapping("/getOne/{id}")
    public String getOne(@PathVariable(value = "id") long id, Model model) {

        // get sucursal from the service
        Sucursal sucursal = sucursalService.getSucursalById(id);

        // set sucursal as a model attribute to pre-populate the form
        model.addAttribute("sucursal", sucursal);
        return "update_sucursal";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") long id) {

        // llamamos al metodo eliminar
        this.sucursalService.deleteSucursalById(id);
        return "redirect:/";
    }
}
