package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@Controller
public class SpaDayController {

    @GetMapping
    public String customerForm (Model model) {
        return "serviceSelection";
    }

    @PostMapping
    //public String spaMenu(@RequestParam String skintype, @RequestParam String manipedi, Model model) {
    public String spaMenu(@RequestParam String skinType, @RequestParam String maniPedi, Model model) {
        Client newClient = new Client(skinType, maniPedi);
        newClient.setAppropriateFacials(skinType);
        model.addAttribute("client",newClient);
        return "menu";
    }
}
