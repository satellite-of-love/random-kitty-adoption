package com.jessitron;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyOptionsController {

    @CrossOrigin()
    @RequestMapping(path = "/surveyOptions")
    public SurveyOptions surveyOptions(@RequestParam(value = "seed") int seed) {
        return new SurveyOptions(seed);
    }

}
    