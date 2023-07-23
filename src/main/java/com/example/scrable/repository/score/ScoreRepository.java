package com.example.scrable.repository.score;

import com.example.scrable.core.score.domain.Score;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ScoreRepository  extends JpaRepository<Score, Integer> {

     public Page<Score> findAllBy(Pageable pageable);

}
