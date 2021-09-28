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
        String myListHtml =
                "<html>" +
                "<body >" +
                "<form method = 'get' action = '/skills' autocomplete='off'>" +
                "<h1 style='font-size:500%;'>Skills Tracker</h1>" +
                "<p style='font-size:200%;'>We have a few skills we would like to learn.Here is the list!</p>" +
                "<ol style='font-size:150%;'>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                "</ol>"+
                "<label>Your Name </label>" +
                "<input type = 'text' name = 'name' />" +
                "<ol>" +
                    "<li>" +
                        "<label for=favoriteLanguage>Choose Your Favorite Language: </label>" +
                        "<select name = 'favoriteLanguage'>"+
                            "<option >Java</option>" +
                            "<option >JavaScript</option>" +
                            "<option >Python</option>" +
                         "</select>" +
                "</li>" +
                "<li>" +
                        "<label for=secondLanguage>Choose Your Second Favorite Language: </label>" +
                    "<select name = 'secondLanguage'>"+
                        "<option >Java</option>" +
                        "<option >JavaScript</option>" +
                        "<option >Python</option>" +
                    "</select>" +
                "</li>" +
                "<li>" +
                        "<label for=thirdLanguage>Choose Your Third Favorite Language: </label>" +
                    "<select name = 'thirdLanguage'>"+
                        "<option >Java</option>" +
                        "<option >JavaScript</option>" +
                        "<option >Python</option>" +
                    "</select>" +
                "</li>" +
                "<input type = 'submit' value = 'Submit!' />" +
                "</form>" +
                "</body>" +
                "</html>";
        return myListHtml;
    }

    @GetMapping("skills")
    @ResponseBody
    public String hello(@RequestParam String name,
                        @RequestParam String favoriteLanguage,
                        @RequestParam String secondLanguage,
                        @RequestParam String thirdLanguage) {
        return "<body>" +
                "<div>" +
                "<h1 style='font-size:500%;'>" + name + "</h1>" +
                "</div>" +
                "<ol style='font-size:200%;'>" +
                "<li>" + favoriteLanguage +  "</li>" +
                "<li>" + secondLanguage +  "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</ol>" +
                "<body>";
    }


}
