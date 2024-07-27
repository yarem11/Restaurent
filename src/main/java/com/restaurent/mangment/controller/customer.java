package com.restaurent.mangment.controller;

import com.restaurent.mangment.model.restaurent;
import com.restaurent.mangment.service.restaurentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class customer {
    private final restaurentService service;

    public customer(restaurentService service) {
        this.service = service;
    }

    @GetMapping("/customer-dashboard")
    public String showCustomerReservation(Model model) {
        List<restaurent> reservation = service.getAllRestaurants();
        model.addAttribute("reservations", reservation);
        return "customerDashboard";
    }

    @GetMapping("/customer-dashboard/customerReporting")
    public String managment(Model model) {
        List<restaurent> reservation = service.getAllRestaurants();
        model.addAttribute("reservations", reservation);
        return "customerReporting";
    }

    @RequestMapping("/customer-dashboard/customerReporting/delete/{id}")
    public String deleteReservation(@PathVariable Long id) {
        service.deleteRestaurent(id);
        return "redirect:/customer-dashboard";
    }
}
