package com.restaurent.mangment.MORE;

import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public abstract class BaseController {

    protected void addFlashMessage(RedirectAttributes redirectAttributes, String message) {
        redirectAttributes.addFlashAttribute("message", message);
    }

    protected void addMessage(Model model, String message) {
        model.addAttribute("message", message);
    }
}
