package com.yunji.wedding.controller;


import com.yunji.wedding.dto.WeddingHall;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeddingHallController {


    @GetMapping("/wedding_hall")
    public List<WeddingHall> getWeddingHallList() {

        return null;
    }

}
