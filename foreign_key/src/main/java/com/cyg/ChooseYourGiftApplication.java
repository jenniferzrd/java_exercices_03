package com.cyg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import java.util.List;
import javax.transaction.Transactional;

import com.cyg.dao.ProjectRepo;
import com.cyg.dao.ProjectsIdeasRepo;
import com.cyg.dao.ProjectsUsersRepo;
import com.cyg.dao.RolesRepo;
import com.cyg.dao.UserRepo;
import com.cyg.models.Project;
import com.cyg.models.ProjectsIdeas;
import com.cyg.models.ProjectsUsers;
import com.cyg.models.Roles;
import com.cyg.models.User;

@SpringBootApplication
//public class ChooseYourGiftApplication implements CommandLineRunner {
public class ChooseYourGiftApplication {

	@Autowired
	UserRepo userRepository;
	
	@Autowired
	RolesRepo rolesRepository;
	
	@Autowired
	ProjectRepo projectRepository;
	
	@Autowired
	ProjectsUsersRepo projectsUsersRepository;
	
	@Autowired
	ProjectsIdeasRepo projectsIdeasRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ChooseYourGiftApplication.class, args);
	}
	
//	@Override
//    public void run(String... arg0) throws Exception {
//    	showData();
//    }
//
//    @Transactional
//    private void showData(){
//    	// get All data
//    	List<User> user = userRepository.findAll();
//        List<Roles> roles = rolesRepository.findAll();
//        List<Project> project = projectRepository.findAll();
//        List<ProjectsUsers> projectsUsers = projectsUsersRepository.findAll();
//        List<ProjectsIdeas> projectsIdeas = projectsIdeasRepository.findAll();
//         
//        System.out.println("===================User:==================");
//        user.forEach(System.out::println);
//         
//        System.out.println("===================Roles:==================");
//        roles.forEach(System.out::println);
//        
//        System.out.println("===================Project:==================");
//        project.forEach(System.out::println);
//        
//        System.out.println("===================ProjectsUsers:==================");
//        projectsUsers.forEach(System.out::println);
//        
//        System.out.println("===================ProjectsIdeas:==================");
//        projectsIdeas.forEach(System.out::println);
//    }
}
