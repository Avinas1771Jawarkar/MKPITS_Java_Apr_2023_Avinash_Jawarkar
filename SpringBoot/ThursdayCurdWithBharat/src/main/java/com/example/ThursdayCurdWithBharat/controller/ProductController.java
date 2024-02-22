package com.example.ThursdayCurdWithBharat.controller;

import com.example.ThursdayCurdWithBharat.model.CartFormData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @GetMapping("/cart")
    public String showCartForm(Model model) {
        model.addAttribute("cartFormData", new CartFormData());
        return "cart";
    }

    @PostMapping("/processCart")
    public String processCart(@ModelAttribute("cartFormData") CartFormData formData, Model model) {
        // Process the form data (e.g., save to database)
        // ...

        // Add processed data to the model if needed
        model.addAttribute("processedData", formData);

        // Redirect to the buy page
        return "buypage";
    }
}
