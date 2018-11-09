package com.aut.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aut.model.Invites;
import com.aut.repository.InvitesRepository;

@Service
public class InvitesServiceImpl implements InvitesService {

	
	@Autowired
	private InvitesRepository invitesRepository;
	
	@Override
	public List<Invites> findAll() {
		return this.invitesRepository.findAll();
	}
	
}
