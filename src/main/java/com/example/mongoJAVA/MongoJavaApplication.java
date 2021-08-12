package com.example.mongoJAVA;
//2
import com.example.mongoJAVA.calculator.entity.Item;
import com.example.mongoJAVA.calculator.entity.User;
import com.example.mongoJAVA.calculator.repository.ItemRepository;
import com.example.mongoJAVA.calculator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MongoJavaApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("#######Application Beginning########");
		userRepository.deleteAll(); 		//id usern name email pw regD
		userRepository.save(new User(1,"aaa","Annie","aaa@","a",new Date()));
		userRepository.save(new User(2,"bbb","Betty","bbb@","b",new Date()));
		userRepository.save(new User(3,"ccc","Cindy","ccc@","c",new Date()));

		List<User>users=userRepository.findAll();
		System.out.println("print all");
		for(User u:users){
			System.out.println(u.toString());
		}
		System.out.println("print {name} only");
		for(User u:userRepository.findAllByName("Betty")){
			System.out.println(u.toString());
		}

		System.out.println("~~~~~Item List~~~~~");
		itemRepository.deleteAll(); 		//id name pr des regD
		itemRepository.save(new Item(1,"apple",1,"granny apple",new Date()));
		itemRepository.save(new Item(2,"banana",2,"philipines",new Date()));
		itemRepository.save(new Item(3,"cherry",5,"daegu",new Date()));
		itemRepository.save(new Item(4,"durian",11,"malaysia",new Date()));
		List<Item>items=itemRepository.findAll();
		System.out.println("All items in stock");
		for(Item u:items){
			System.out.println(u.toString());
		}


	}
}
