import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;



public class App {
    public static void main(String[] args) {
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "hello.hbs");
        }, new HandlebarsTemplateEngine());
//                "<!DOCTYPE html>" +
//                        "<html>" +
//                        "<head>" +
//                        "<title>Hello Friend!</title>" +
//                        "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
//                        "</head>" +
//                        "<body>" +
//                        "<h1>Hello From Afar</h1>" +
//                        "<p>Dear Friend,</p>" +
//                        "<p>How are you? I hope that you are having a nice weekend. I'm vacationing in the Iceland while I learn programming! </p>" +
//                        "<p>Friend, you would not believe how cold it is here. I should have gone to Hawaii instead.</p>" +
//                        "<p>But I like programming a lot, so I've got that going for me. </p>" +
//                        "<p>Looking forward to seeing you soon. I'll bring you back a souvenir. </p>" +
//                        "<p>Cheers,</p>" +
//                        "<p>Travel Enthusiast Jane</p>" +
//                        "<p><a href='/favorite_photos' >P.S. Check out my favorite travel photos here.</a></p>" +
//                        "</body>" +
//                        "</html>"

        get("/favorite_photos", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "favorite_photos.hbs");
        }, new HandlebarsTemplateEngine());
//                "<!DOCTYPE html>" +
//                        "<html>" +
//                        "<head>" +
//                        "<title>Hello Friend!</title>" +
//                        "<link rel='stylesheet'  href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
//                        "</head>" +
//                        "<body>" +
//                        "<h1>Favorite Traveling Photos</h1>" +
//                        "<ul>" +
//                        "<li><img src='/images/cage.jpeg' alt='cage.'/></li>" +
//                        "<li><img src='/images/snowy.jpeg' alt='snowy.'/></li>" +
//                        "</ul>" +
//                        "</body>" +
//                        "</html>"

    }
}