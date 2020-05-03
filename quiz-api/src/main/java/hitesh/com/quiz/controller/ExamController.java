package hitesh.com.quiz.controller;

import hitesh.com.quiz.domain.QuizResponse;
import hitesh.com.quiz.services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ExamController.EXAM_API_URL)
public class ExamController {

    public static final String EXAM_API_URL="exam/api/";

    @Autowired
    ExamService examService;

    @GetMapping
     public String index()
     {
         return  "congratulations...! you exam service api successfully started";
     }

     @GetMapping("quizQuestion")
     public List<QuizResponse> getData() {
        return examService.getQuizData();
    }
}
