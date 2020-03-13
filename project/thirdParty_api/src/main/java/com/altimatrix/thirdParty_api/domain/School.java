package com.altimatrix.thirdParty_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class School {

    @JsonProperty("id")
    private int id;

    @JsonProperty("school.name")
    private String name;

    @JsonProperty("2017.student.size")
    private int size;
}
