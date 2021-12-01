package com.rajeshkawali.model;

public class DockerModel {

	private String imageName;
	private String status;
	private Integer containerId;
	private String version;

	public DockerModel() {

	}

	public DockerModel(String imageName, String status, Integer containerId, String version) {
		super();
		this.imageName = imageName;
		this.status = status;
		this.containerId = containerId;
		this.version = version;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getContainerId() {
		return containerId;
	}

	public void setContainerId(Integer containerId) {
		this.containerId = containerId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
