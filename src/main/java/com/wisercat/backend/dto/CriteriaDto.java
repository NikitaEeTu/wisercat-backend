package com.wisercat.backend.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "criteria")
public class CriteriaDto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column
    private String name;

    @Column
    private String condition;

    @Column
    private String value;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="filterid", nullable=false)
    private FilterDto filterDto;

    public void setName(String name) {
        this.name = name;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setFilterDto(FilterDto filterDto) {
        this.filterDto = filterDto;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public String getValue() {
        return value;
    }

    public FilterDto getFilterDto() {
        return filterDto;
    }
}