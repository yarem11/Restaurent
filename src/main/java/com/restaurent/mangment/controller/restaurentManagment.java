package com.restaurent.mangment.controller;

import com.restaurent.mangment.MORE.BaseController;
import com.restaurent.mangment.model.restaurent;
import com.restaurent.mangment.service.restaurentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class restaurentManagment {
    private final restaurentService service;
    private final BaseController redirectAttributes;


    public restaurentManagment(restaurentService service, BaseController redirectAttributes) {
        this.service = service;
        this.redirectAttributes = redirectAttributes;
    }

    @GetMapping("/")
    public String homePage(){
        return "homePage";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/registaretionReservation")
    public String register(){
        return "Registaretion-Reservation";
    }

    @PostMapping("/save")
    public String saveReservation(@ModelAttribute restaurent res, RedirectAttributes redirectAttributes) {
        service.insertRestaurent(res);
        redirectAttributes.addFlashAttribute("message", "Reservation saved successfully!");
        return "redirect:/";
    }
}
