package com.sree.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.app.Dao.PgDao;
import com.sree.app.Dto.PgDto;

@Service
public class PgService {
	@Autowired
	private PgDao dao;
	public boolean registerUser(PgDto pgDto){
		return dao.saveUser(pgDto);
		
	}
	public boolean logInUser(PgDto Dto){
		return dao.authenicateuser(Dto);
	}

}
