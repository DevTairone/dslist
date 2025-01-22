package com.devtairone.dslist.services;

import com.devtairone.dslist.DTO.GameDTO;
import com.devtairone.dslist.DTO.GameListDTO;
import com.devtairone.dslist.DTO.GameMinDTO;
import com.devtairone.dslist.entities.Game;
import com.devtairone.dslist.entities.GameList;
import com.devtairone.dslist.repository.GameListRepository;
import com.devtairone.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

}
