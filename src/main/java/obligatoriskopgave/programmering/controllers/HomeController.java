package obligatoriskopgave.programmering.controllers;

import obligatoriskopgave.programmering.models.Owner;
import obligatoriskopgave.programmering.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    OwnerRepository ownerRepository;

    @GetMapping("/")
    public String index(Model model)
    {
        List<Owner> owners = ownerRepository.findAll();

        model.addAttribute("owners", owners);
        return "index";
    }
}
