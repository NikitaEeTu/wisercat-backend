package com.wisercat.backend.repository;

import com.wisercat.backend.dto.FilterDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilterRepository extends JpaRepository<FilterDto, Integer> {
}