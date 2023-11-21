package com.wisercat.backend.service;

import com.wisercat.backend.dto.FilterDto;

import java.util.List;

public interface FilterService {
    List<FilterDto> getAllFilters();
    FilterDto saveFilters(FilterDto filter);
}