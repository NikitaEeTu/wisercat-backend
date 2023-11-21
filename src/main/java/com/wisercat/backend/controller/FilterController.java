package com.wisercat.backend.controller;

import com.wisercat.backend.dto.FilterDto;
import com.wisercat.backend.service.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class FilterController {
    @Autowired
    private FilterService filterService;
    @GetMapping(value="/filters", produces = "application/json")
    public @ResponseBody List<FilterDto> getFilters() {
        return filterService.getAllFilters();
    }

    @PostMapping(value="/filters", produces = "application/json")
    public @ResponseBody FilterDto saveFilter(@RequestBody FilterDto filterDto){
        return filterService.saveFilters(filterDto);
    }
}