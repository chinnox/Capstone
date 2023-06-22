package com.capstone3.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CapstoneApplication {

	public static void main(String[] args) {

		SpringApplication.run(CapstoneApplication.class, args);

		}
//		@Bean
//		CommandLineRunner runner (AppUserRepository repository){
//			return args -> {
//				AppUser user = new AppUser(
//						"chinnox19",
//						"1234",
//						"Earl Zamora",
//						"chinnoxlez19@gmail.com",
//						"Panacan, DC",
//						123456787,
//						USER,
//						false,
//						true
//				);
//
//				repository.insert(user);
//			};
//
//		}
}
