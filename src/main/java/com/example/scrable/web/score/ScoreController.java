package com.example.scrable.web.score;

import com.example.scrable.common.web.RootUrl;
import com.example.scrable.core.score.domain.Score;
import com.example.scrable.core.score.domain.ScoreDTO;
import com.example.scrable.core.score.service.ScoreService;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(RootUrl.URL + "/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;
    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity saveScore(@NonNull @RequestBody ScoreDTO scoreDTO) {
        String word = "";
        int point = 0;
        if(scoreDTO != null) {
            word = scoreDTO.getLetter1() + scoreDTO.getLetter2() + scoreDTO.getLetter3() + scoreDTO.getLetter4() +
                    scoreDTO.getLetter5() + scoreDTO.getLetter6() + scoreDTO.getLetter7() + scoreDTO.getLetter8() +
                    scoreDTO.getLetter9() + scoreDTO.getLetter10();
            point = scoreDTO.getScore();

            Score score = new Score();
            score.setWord(word);
            score.setPoint(point);
            score.setCreated_date(new Date());

            this.scoreService.saveScore(score);
        }
        return ResponseEntity.ok().build();
    }

    @CrossOrigin
    @GetMapping("/viewTopScore")
    public Page<Score> getTopScore(){
        Sort.Order orders = new Sort.Order(Sort.Direction.DESC, "point");
        PageRequest  pageRequest =  PageRequest.of(0, 10, Sort.by(orders));
        Page<Score> scoreList= this.scoreService.getTopScore(pageRequest);
        return scoreList;
    }
}
