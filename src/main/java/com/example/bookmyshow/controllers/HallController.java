package com.example.bookmyshow.controllers;

import com.example.bookmyshow.DTOs.CreateHallDTO;
import com.example.bookmyshow.models.Hall;
import com.example.bookmyshow.services.HallService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/hall")
public class HallController {
    HallService hallService;

    @GetMapping("/{id}")
    public Hall getHall(@PathVariable Long id){
        return hallService.getHall(id);
    }

    @PostMapping("/create")
    public Hall createHall(@RequestBody CreateHallDTO createHallDTO){
        return hallService.createHall(createHallDTO);
    }
}
