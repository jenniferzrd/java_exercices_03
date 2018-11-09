package com.aut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aut.model.Invites;
import com.aut.security.services.InvitesService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class InvitesController {

	@Autowired
	protected InvitesService invitesService;
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/getInvites", method = RequestMethod.GET)
	public List<Invites> getInvites() {
		return this.invitesService.findAll();
	}

}
