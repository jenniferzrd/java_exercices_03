package com.cyg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyg.dao.RolesRepo;
import com.cyg.models.Roles;
import com.cyg.models.User;

@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesRepo rolesRepository;
	
	@Override
	public List<Roles> findAll() {
		return this.rolesRepository.findAll();
	}
	
	@Override
	public void deleteRole(String roles_rolecode) {
		this.rolesRepository.deleteById(roles_rolecode);
	}
	
	@Override
	public Roles save(Roles roles) {
	return this.rolesRepository.save(roles);
	}
	
}