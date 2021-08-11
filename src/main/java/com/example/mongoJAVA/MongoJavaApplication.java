package com.example.mongoJAVA;
//2
import com.example.mongoJAVA.calculator.entity.User;
import com.example.mongoJAVA.calculator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MongoJavaApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.save(new User("aaa","Annie","aaa@","a"));
		userRepository.save(new User("bbb","Betty","bbb@","b"));
		userRepository.save(new User("ccc","Cindy","ccc@","c"));
		userRepository.save(new User("ddd","Danni","ddd@","d"));
		userRepository.save(new User("eee","Ellie","eee@","e"));
		List<User>users=userRepository.findAll();
		System.out.println("print all");
		for(User u:users){
			System.out.println(u.toString());
		}
		System.out.println("print {name} only");
		for(User u:userRepository.findAllByName("")){
			System.out.println(u.toString());
		}
	}
}
