package com.travel.VoyageGest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/voyage")
public class VoyageController {

    @Autowired
    private VoyageService service;


    @RequestMapping("")
    public String home(){

    return "homepage";
    }

    @RequestMapping("/view")
    public String viewHomePage(Model model) {
        List<Voyage> listVoyages = service.listAll();
        model.addAttribute("listVoyages", listVoyages);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewVoyagePage(Model model) {
        Voyage voyage = new Voyage();
        model.addAttribute("voyage", voyage);

        return "new_voyage";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveVoyage(@ModelAttribute("voyage") Voyage voyage) {
        service.save(voyage);

        return "redirect:/";
    }
    @RequestMapping("/edit/{idvoyage}")
    public ModelAndView showEditVoyagePage(@PathVariable(name = "idvoyage") int idvoyage) {
        ModelAndView mav = new ModelAndView("edit_voyage");
        Voyage voyage = service.get(idvoyage);
        mav.addObject("voyage", voyage);

        return mav;
    }

    @RequestMapping("/delete/{idvoyage}")
    public String deleteVoyage(@PathVariable(name = "idvoyage") int idvoyage) {
        service.delete(idvoyage);
        return "redirect:/";
    }
}
