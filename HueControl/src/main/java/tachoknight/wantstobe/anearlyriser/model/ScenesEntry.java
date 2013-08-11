package tachoknight.wantstobe.anearlyriser.model;

import java.util.List;

public class ScenesEntry {
	private String name;
	private List<Integer> lights;
	private boolean active;

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getLights() {
		return lights;
	}

	public void setLights(List<Integer> lights) {
		this.lights = lights;
	}
}
