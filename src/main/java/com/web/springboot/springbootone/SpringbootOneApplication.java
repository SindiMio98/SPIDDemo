package com.web.springboot.springbootone;

import com.web.springboot.springbootone.Services.SpidService;
import com.web.springboot.springbootone.Services.UserService;
import com.web.springboot.springbootone.entities.Spid;
import com.web.springboot.springbootone.entities.Status;
import com.web.springboot.springbootone.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootOneApplication implements CommandLineRunner {

	@Autowired
	public UserService userService;

	@Autowired
	public SpidService spidService;

	public static void main(String[] args) {
		SpringbootOneApplication.run(SpringbootOneApplication.class, args);
	}

	private static void run(Class<SpringbootOneApplication> springbootOneApplicationClass, String[] args) {
	}

	@Override
	public void run(String... args) throws Exception {
		User createdUser1 = userService.createUser(new User(1,"Sindi","sindimio"));
		User createdUser2 = userService.createUser(new User(2, "Ana", "anasmith"));
		User createdUser3 = userService.createUser(new User(3, "Ben", "benlone"));

		userService.editUser(createdUser1, 1, "Sindi", "miosindi2123");
		userService.editUser(createdUser2, 2, "Ana", "smithana1233");
		userService.editUser(createdUser3, 3, "Ben", "benten1253");

		Spid createdSpid1 = spidService.createSpid(new Spid(1, createdUser1, Status.PENDING, "Sindi Mio's SPID"));
		Spid createdSpid2 = spidService.createSpid(new Spid(2, createdUser1, Status.PENDING, "Ana Smith's SPID"));
		Spid createdSpid3 = spidService.createSpid(new Spid(3, createdUser1, Status.PENDING, "Ben Lone's SPID"));

		spidService.editSpid(createdSpid1, 1, createdUser1, Status.APPROVED, "Sindi Mio's SPID");
		spidService.editSpid(createdSpid2, 2, createdUser2, Status.APPROVED, "Ana Smith's SPID");
		spidService.editSpid(createdSpid3, 3, createdUser3, Status.APPROVED, "Ben Lone's SPID");

		System.out.println("List of spids:\n");
		System.out.println("ID: " + createdSpid1.getId() + " Status: " + createdSpid1.getStatus() + " Description: " + createdSpid1.getDescription());
		System.out.println("ID: " + createdSpid2.getId() + " Status: " + createdSpid2.getStatus() + " Description: " + createdSpid2.getDescription());
		System.out.println("ID: " + createdSpid3.getId() + " Status: " + createdSpid3.getStatus() + " Description: " + createdSpid3.getDescription());

		System.out.println("\nList of spids connected to a user:\n");
		System.out.println("Username: " + createdUser1.getUsername() + " is connected to SPID: " + createdSpid1.getUser().getUsername().equals(createdUser1.getUsername()));
		System.out.println("Username: " + createdUser2.getUsername() + " is connected to SPID: " + createdSpid2.getUser().getUsername().equals(createdUser2.getUsername()));
		System.out.println("Username: " + createdUser3.getUsername() + " is connected to SPID: " + createdSpid3.getUser().getUsername().equals(createdUser3.getUsername()));
	}
}
