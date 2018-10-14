package com.cyg.service;

import java.util.List;

import com.cyg.models.ProjectsIdeas;
import com.cyg.models.ProjectsIdeasId;
import com.cyg.models.Roles;

public interface ProjectsIdeasService {
	
	List<ProjectsIdeas> findAll();

	void deleteProjectsIdeas(ProjectsIdeasId projectsIdeasId);

	ProjectsIdeas save (ProjectsIdeas projectsIdeas);

}
