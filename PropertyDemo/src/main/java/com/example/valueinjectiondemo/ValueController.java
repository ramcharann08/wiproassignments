package com.example.valueinjectiondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ValueController {

@Autowired
private ValueHolder valueHolder;

@GetMapping("/show-values")
public String showValues(Model model) {
    model.addAttribute("integerValue", valueHolder.getValueInteger());
    model.addAttribute("decimalValue", valueHolder.getValueDouble());
    model.addAttribute("booleanValue", valueHolder.getValueBoolean());
    return "show-values";
}
}