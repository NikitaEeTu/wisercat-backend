package com.wisercat.backend.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "filter")
public class FilterDto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column
    private String name;

    @Column
    private String selection;

    @JsonManagedReference
    @OneToMany(mappedBy="filterDto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CriteriaDto> criteriaList;

    public void setName(String name) {
        this.name = name;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public void setCriteriaList(List<CriteriaDto> criteriaDtoSet) {
        this.criteriaList = criteriaDtoSet;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSelection() {
        return selection;
    }

    public List<CriteriaDto> getCriteriaList() {
        return criteriaList;
    }
}