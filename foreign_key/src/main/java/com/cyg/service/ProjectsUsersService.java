package com.cyg.service;

import java.util.List;

import com.cyg.models.ProjectsUsers;

public interface ProjectsUsersService {

	List<ProjectsUsers> findAll();
	ProjectsUsers save (ProjectsUsers projectsUsers);
	
}
