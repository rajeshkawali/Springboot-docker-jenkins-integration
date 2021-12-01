package com.rajeshkawali.dao;

import org.springframework.stereotype.Repository;

import com.rajeshkawali.model.DockerModel;

@Repository
public class DockerDaoImpl implements DockerDao {

	@Override
	public DockerModel getDetails() {
		System.out.println("DockerDaoImpl.getDetails()");
		DockerModel model = new DockerModel();
		model.setImageName("openjdk8");
		model.setVersion("1.0");
		model.setContainerId(7372213);
		model.setStatus("Active");
		return model;
	}

}
