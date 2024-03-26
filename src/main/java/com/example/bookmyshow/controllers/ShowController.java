package com.example.bookmyshow.controllers;

import com.example.bookmyshow.DTOs.CreateShowDTO;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.services.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/show")
public class ShowController {
    ShowService showService;

    @GetMapping("/{id}")
    public Show getShow(@PathVariable Long id){
        return showService.getShow(id);
    }

    @PostMapping("/create")
    public Show createShow(@RequestBody CreateShowDTO createShow){
        return showService.createShow(createShow);
    }
}
