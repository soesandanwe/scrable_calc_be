package com.example.scrable.core.letter.service;

import com.example.scrable.core.letter.domain.Letter;
import com.example.scrable.repository.letter.LetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LetterService {

    @Autowired
    private LetterRepository letterRepository;

    public List<Letter> getAllLetters() {
        return letterRepository.findAllBy();
    }
}
