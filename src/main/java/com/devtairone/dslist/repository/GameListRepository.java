package com.devtairone.dslist.repository;

import com.devtairone.dslist.entities.Game;
import com.devtairone.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
