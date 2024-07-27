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
public class dashboard extends BaseController {
    private final restaurentService service;

    public dashboard(restaurentService service) {
        this.service = service;
    }

    @GetMapping("/dashboard")
    public String showPartReservation(Model model) {
        List<restaurent> reservation = service.getAllRestaurants();
        model.addAttribute("reservations", reservation);
        return "dashboard";
    }

    @GetMapping("/dashboard/reservation/{id}")
    public String getReservationById1(@PathVariable Long id, Model model) {
        restaurent reservation = service.FindtRestaurent(id);
        model.addAttribute("reservation", reservation);
        return "reservationDetails";
    }

    @GetMapping("/dashboard/{id}")
    public String searchReservations(@RequestParam("keyword") String keyword, Model model) {
        List<restaurent> reservations = service.getAllRestaurants();
        model.addAttribute("reservations", reservations);
        return "reservationDetails";
    }

    @GetMapping("/dashboard/reporting")
    public String reporting(Model model) {
        List<restaurent> reservation = service.getAllRestaurants();
        model.addAttribute("reservations", reservation);
        return "reporting";
    }

    @GetMapping("/dashboard/reservationManagment")
    public String managment(Model model, @ModelAttribute("message") String message) {
        List<restaurent> rest = service.getAllRestaurants();
        model.addAttribute("reservations", rest);
        addMessage(model, message);
        return "reservationManagment";
    }

    @GetMapping("/dashboard/reservationManagment/{id}/edit")
    public String getReservationById(@PathVariable Long id, Model model) {
        restaurent rest = service.FindtRestaurent(id);
        model.addAttribute("reservation", rest);
        return "editable";
    }

    @PostMapping("/dashboard/reservationManagment/{id}/edit")
    public String updateReservation(@ModelAttribute("reservation") restaurent reservation, RedirectAttributes redirectAttributes) {
        service.UpdateRestaurent(reservation);
        addFlashMessage(redirectAttributes, "Reservation update successfully!");
        return "redirect:/dashboard/reservationManagment";
    }

    @RequestMapping("/dashboard/reservationManagment/delete/{id}")
    public String deleteReservation(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        service.deleteRestaurent(id);
        addFlashMessage(redirectAttributes, "Reservation deleted successfully!");
        return "redirect:/dashboard/reservationManagment";
    }
}