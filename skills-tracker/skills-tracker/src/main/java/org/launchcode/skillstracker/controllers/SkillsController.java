package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("form")
    @ResponseBody
    public String helloForm(){
        String html =
                "<html>" +
                "<body>" +
                 "<form method = 'get' action = '/skills'>" +
                "<input type = 'text' name = 'name' />" +
                "<label for=favoriteLanguage>Choose Your Favorite Language:</label>" +
                "<select name = 'favoriteLanguage'>"+
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'c++'>C++</option>" +
                "</select>" +
                        "<label for=secondLanguage>Choose Your Second Favorite Language:</label>" +
                        "<select name = 'secondLanguage'>"+
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'c++'>C++</option>" +
                        "</select>" +
                        "<label for=thirdLanguage>Choose Your Third Favorite Language:</label>" +
                        "<select name = 'thirdLanguage'>"+
                        "<option value = 'java'>Java</option>" +
                        "<option value = 'javascript'>JavaScript</option>" +
                        "<option value = 'c++'>C++</option>" +
                        "</select>" +
                "<input type = 'submit' value = 'Submit!' />" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("skills")
    @ResponseBody
    public String hello(@RequestParam String name,
                        @RequestParam String favoriteLanguage,
                        @RequestParam String secondLanguage,
                        @RequestParam String thirdLanguage) {
        return "Hello, " + name +
                "<li>" + favoriteLanguage +  "</li>" +
                "<li>" + secondLanguage +  "</li>" +
                "<li>" + thirdLanguage + "</li>" ;
    }


}
