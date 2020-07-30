package com.amyliascarlet.demo.bingo.game;

import com.amyliascarlet.demo.bingo.model.Bingo;
import com.amyliascarlet.demo.bingo.service.BingoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Api {

    @Autowired
    private BingoService bingoService;

    @GetMapping("/Play")
    public Integer Play() {
        return bingoService.play();
    }

    @GetMapping("/Start")
    public Bingo Start() throws InterruptedException {
        return bingoService.Start();

    }

    @GetMapping("/Check/{num}")
    public List<Integer> Check(@PathVariable int num) {
        return bingoService.Check(num);

    }



}
