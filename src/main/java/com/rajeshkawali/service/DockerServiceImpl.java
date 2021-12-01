package com.rajeshkawali.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajeshkawali.dao.DockerDao;
import com.rajeshkawali.model.DockerModel;

@Service
public class DockerServiceImpl implements DockerService {

	@Autowired
	private DockerDao dockerDao;
	
	@Override
	public DockerModel getDetails() {
		System.out.println("DockerServiceImpl.getDetails()");
		return dockerDao.getDetails();
	}

}
