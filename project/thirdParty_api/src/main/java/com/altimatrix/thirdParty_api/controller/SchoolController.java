package com.altimatrix.thirdParty_api.controller;

import com.altimatrix.thirdParty_api.domain.Result;
import com.altimatrix.thirdParty_api.rest.SchoolAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/schoolinfo")
public class SchoolController {

    @Autowired
    private SchoolAPI SchoolAPI;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping({"/", ""})
    public Result generateSchool() {
        log.info("Fetching school info");
        return restTemplate.getForObject("https://api.data.gov/ed/collegescorecard/v1/schools.json?api_key=l2IrPIhoHm45zKDRVxhoeSbleLjEaNpspi23OOml&school.degrees_awarded.predominant=2,3&fields=id,school.name,2017.student.size&per_page=100&zip=90815&distance=10mi", Result.class);
    }
}
