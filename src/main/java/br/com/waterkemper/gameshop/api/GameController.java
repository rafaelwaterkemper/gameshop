package br.com.waterkemper.gameshop.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameController {

    @GetMapping
    public String getGame(){
        return "God of War 4";
    }
}
