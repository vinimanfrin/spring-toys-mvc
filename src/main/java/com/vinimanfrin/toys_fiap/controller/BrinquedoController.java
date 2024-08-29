package com.vinimanfrin.toys_fiap.controller;

import com.vinimanfrin.toys_fiap.models.Brinquedo;
import com.vinimanfrin.toys_fiap.models.BrinquedoCreateDTO;
import com.vinimanfrin.toys_fiap.models.enums.ClassificacaoBrinquedo;
import com.vinimanfrin.toys_fiap.models.enums.TipoBrinquedo;
import com.vinimanfrin.toys_fiap.repositories.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository repository;

    @GetMapping("/create")
    public String exibeTemplateCreate(Model model){
        model.addAttribute("brinquedoCreateDto",new BrinquedoCreateDTO());
        model.addAttribute("tiposBrinquedos", TipoBrinquedo.values());
        model.addAttribute("tiposClassificacaoBrinquedo", ClassificacaoBrinquedo.values());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute BrinquedoCreateDTO brinquedoCreateDTO){
        repository.save(new Brinquedo(brinquedoCreateDTO));
        return "redirect:/brinquedos/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("brinquedos",repository.findAll());
        return "list";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        repository.deleteById(id);
        return "redirect:/brinquedos/list";
    }

    @GetMapping("/edit/{id}")
    public String exibeTemplateUpdate(@PathVariable Long id, Model model){
        Brinquedo brinquedo = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Brinquedo não encontrado!"));
        model.addAttribute("brinquedoCreateDto", new BrinquedoCreateDTO(brinquedo));
        model.addAttribute("tiposBrinquedos", TipoBrinquedo.values());
        model.addAttribute("tiposClassificacaoBrinquedo", ClassificacaoBrinquedo.values());
        return "create";
    }
}
