package com.jessitron;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class SurveyOptionsController {

    @CrossOrigin()
    @RequestMapping(path = "/surveyOptions")
    public SurveyOptions surveyOptions(@RequestParam(value = "seed") int seed)
    {
        return new SurveyOptions("Survey " + seed, seed, threeRandomOptions(seed));
    }


    private List<SurveyOption> threeRandomOptions(int seed) {
        List<SurveyOption> local = new ArrayList<>(allOptions);
        Collections.shuffle(local, new Random(seed)); // this actually modifies the list ugh
        List<SurveyOption> withIndices = IntStream.range(0, local.size())
                .mapToObj(i -> local.get(i).withPlace(i + 1))
                .limit(3)
                .collect(Collectors.toList());

        return withIndices;
    }


    private final List<SurveyOption> allOptions;

    { /* static initializer */
        allOptions = new LinkedList<>();
        allOptions.add(
                new SurveyOption(
                        "https://upload.wikimedia.org/wikipedia/commons/1/16/Kitty_meowing.jpg",
                        "kitty meowing"));
        allOptions.add(
                new SurveyOption(
                        "https://c1.staticflickr.com/4/3149/2988746750_4a3dfdee59.jpg",
                        "sink kitties"));
        allOptions.add(
                new SurveyOption(
                        "http://www.publicdomainpictures.net/pictures/60000/velka/green-eyed-kitty.jpg",
                        "green-eyed kitty"));
        allOptions.add(
                new SurveyOption(
                        "http://maxpixel.freegreatpicture.com/static/photo/1x/Sweet-Animals-Kitty-Cat-323262.jpg",
                        "kitty licking paw"));
        allOptions.add(
                new SurveyOption(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Computer-kitten.jpg/1024px-Computer-kitten.jpg",
                        "computer kitten"));
    }

}
    