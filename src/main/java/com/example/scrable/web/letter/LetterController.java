package com.example.scrable.web.letter;

import com.example.scrable.common.web.RootUrl;
import com.example.scrable.core.letter.domain.Letter;
import com.example.scrable.core.letter.service.LetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(RootUrl.URL + "/letter")
public class LetterController {

    @Autowired
    private LetterService letterService;

    @CrossOrigin
    @GetMapping("/findAll")
    public List<Letter> getAllLetters(){
        List<Letter> letters = letterService.getAllLetters();

        return letters;
    }
}
