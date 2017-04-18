package com.jessitron;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RandomittydoptionApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class SurveyOptionsWebIntegrationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    
    @Test
    public void surveyOptionsTest() {
        SurveyOptions result = restTemplate.getForObject("/surveyOptions?seed=33", SurveyOptions.class);
        assertEquals(33, result.getSeed());
    }
    
}
