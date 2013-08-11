package tachoknight.wantstobe.anearlyriser.model;

import java.util.Map;

public class LightsEntry {
	private String name;
	private State state;
	private String modelid;
	private Integer swversion;
	private String type;
	private Map<String, String> pointsymbol;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getModelid() {
		return modelid;
	}

	public void setModelid(String modelid) {
		this.modelid = modelid;
	}

	public Integer getSwversion() {
		return swversion;
	}

	public void setSwversion(Integer swversion) {
		this.swversion = swversion;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Map<String, String> getPointsymbol() {
		return pointsymbol;
	}

	public void setPointsymbol(Map<String, String> pointsymbol) {
		this.pointsymbol = pointsymbol;
	}

	@Override
	public String toString() {
		return "\nLightsEntry " + 
				"\n  name=" + name + 
				"\n  state=" + state + 
				"\n  modelid=" + modelid + 
				"\n  swversion=" + swversion + 
				"\n  type=" + type + 
				"\n  pointsymbol=" + pointsymbol + "";
	}

}
