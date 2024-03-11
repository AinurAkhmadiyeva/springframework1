package kz.bitlab.springframework.springframework1.controller;

import kz.bitlab.springframework.springframework1.db.DBManager;
import kz.bitlab.springframework.springframework1.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = "/home")
    public String indexPage(Model model) {
        ArrayList<Item> allItems = DBManager.getAllItems();
        model.addAttribute("allItemsAttribute", allItems);
        return "items";
    }
}
