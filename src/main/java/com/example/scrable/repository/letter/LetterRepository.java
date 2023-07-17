package com.example.scrable.repository.letter;

import com.example.scrable.core.letter.domain.Letter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LetterRepository extends JpaRepository<Letter, String> {

    public List<Letter> findAllBy();
}
