package com.project.DojoOverflow.services;

import com.project.DojoOverflow.models.Answer;
import com.project.DojoOverflow.repositories.AnswerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    private AnswerRepository answerRepo;

    public AnswerService(AnswerRepository answerRepo) {
        this.answerRepo = answerRepo;
    }

    public List<Answer> allAnswer() {
        return answerRepo.findAll();
    }

    public void createAnswer(Answer answer) {
        answerRepo.save(answer);
    }
}