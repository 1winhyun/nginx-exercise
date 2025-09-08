package com.exercise.exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {
	@GetMapping("/exercise")
	public String exercise(){
		System.out.println("exercise controller");
		return "hello world 수정해봤어";
	}
}
