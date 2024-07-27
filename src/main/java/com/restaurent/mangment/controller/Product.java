package com.restaurent.mangment.controller;

import com.restaurent.mangment.model.product;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class Product {


    @GetMapping("/ProductPage")
    public String products(Model model) {
        List<product> products = Arrays.asList(
                new product("Baasto Saldaato", "/images/baasto.jpg"),
                new product("Chicken Burger", "/images/chicken_burger.jpg"),
                new product("Lemon Juice", "/images/lemon_juice.jpg"),
                new product("Bariis And Chicken", "/images/bariis_chicken.jpg"),
                new product("Fish", "/images/fish.jpg"),
                new product("Chips Massalla", "/images/chips_massalla.jpg"),
                new product("Shirbis", "/images/shirbis.jpg"),
                new product("Salmon Fish", "/images/salmon_fish.jpg"),
                new product("Mango Juice", "/images/millon_juice.jpg"),
                new product("Fish", "/images/fish.jpg"),
                new product("Chips Massalla", "/images/chips_massalla.jpg"),
                new product("Shirbis", "/images/shirbis.jpg"),
                new product("Salmon Fish", "/images/salmon_fish.jpg"),
                new product("Ice Coffee", "/images/ice-coffee.jpg"),
                new product("Pizza Italian", "/images/pizza-italy.jpg"),
                new product("Chips Massalla", "/images/chips-masalla1.jpg"),
                new product("Fish Burger", "/images/fish-burger.jpg"),
                new product("Ice Cream", "/images/ice-cream.jpg"),
                new product("Ice velariya", "/images/ice-velariya.jpg"),
                new product("strawberry Shake", "/images/strawberry-shake.jpg"),
                new product("Diet 1000", "/images/diet-1000.jpg"),
                new product("Diet 37900", "/images/diet-37900.jpg"),
                new product("Diet 002", "/images/diet-002.jpg"),
                new product("Diet 102", "/images/diet-102.jpg")

        );
        model.addAttribute("products", products);
        return "ProductPage";
    }
}
