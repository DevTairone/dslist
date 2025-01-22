package com.devtairone.dslist.controllers;

import com.devtairone.dslist.DTO.GameDTO;
import com.devtairone.dslist.DTO.GameListDTO;
import com.devtairone.dslist.DTO.GameMinDTO;
import com.devtairone.dslist.services.GameListService;
import com.devtairone.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;



    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
