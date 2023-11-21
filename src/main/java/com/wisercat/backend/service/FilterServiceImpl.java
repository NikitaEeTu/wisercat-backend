package com.wisercat.backend.service;

import com.wisercat.backend.dto.FilterDto;
import com.wisercat.backend.repository.FilterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FilterServiceImpl implements FilterService {

    @Autowired
    private FilterRepository filterRepository;


    public List<FilterDto> getAllFilters() {
        return filterRepository.findAll();
    }


    @Override
    public FilterDto saveFilters(FilterDto filter) {
        return filterRepository.save(filter);
    }
}