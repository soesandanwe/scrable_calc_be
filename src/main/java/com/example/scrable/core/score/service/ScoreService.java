package com.example.scrable.core.score.service;


import com.example.scrable.core.score.domain.Score;
import com.example.scrable.repository.score.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public Score saveScore(Score score) {
        return scoreRepository.saveAndFlush(score);
    }

    public Page<Score> getTopScore(Pageable pageable) {
        return scoreRepository.findAllBy(pageable);
    }
}
