package hitesh.com.quiz.services;


import hitesh.com.quiz.domain.QuizResponse;
import hitesh.com.quiz.entity.Options;
import hitesh.com.quiz.entity.Questions;
import hitesh.com.quiz.repository.OptionsRepository;
import hitesh.com.quiz.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Service
public class ExamService {
	@Autowired
	OptionsRepository optionRepo;

	@Autowired
	QuestionsRepository questionRepo;

	public List<QuizResponse> getQuizData() {
		List<Questions> listOfQuestions = questionRepo.findAll();
		Map<Integer, String> mapOfQuestions = listOfQuestions.stream()
				.collect(Collectors.toMap(Questions::getId, Questions::getQuestion));

		Map<Integer, Options> mapOfOptions = optionRepo.findAll().stream()
				.collect(Collectors.toMap(Options::getqId, obj -> obj));

		List<Integer> listOfDoneQuestions = new ArrayList<>();
		List<QuizResponse> listOfResponse = new ArrayList<>();
		int questionCnt = 1;
		while (!mapOfQuestions.isEmpty()) {
			int randomQuestionNumber = 1 + ThreadLocalRandom.current().nextInt(listOfQuestions.size());

			if (!listOfDoneQuestions.contains(randomQuestionNumber)) {
				listOfDoneQuestions.add(randomQuestionNumber);
				Options options = mapOfOptions.get(randomQuestionNumber);
				String question = questionCnt++ + " : " + mapOfQuestions.get(randomQuestionNumber);

				List<String> listOfOptions = new ArrayList<>(Arrays.asList(options.getOption1(), options.getOption2(),
						options.getOption3(), options.getOption4()));

				Iterator<String> iterator2 = listOfOptions.iterator();
				int optionCnt = 1;
				StringBuilder optionsOfQuestion = new StringBuilder();
				while (iterator2.hasNext()) {
					Integer option = ThreadLocalRandom.current().nextInt(listOfOptions.size());
					optionsOfQuestion.append("(" + optionCnt++ + ") " + listOfOptions.get(option) + " ");
					listOfOptions.remove(listOfOptions.get(option));
				}

				mapOfQuestions.remove(randomQuestionNumber);
				listOfResponse.add(new QuizResponse(question, optionsOfQuestion.toString()));
			}
		}

		return listOfResponse;
	}

}
