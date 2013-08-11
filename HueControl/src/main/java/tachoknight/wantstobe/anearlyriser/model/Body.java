package tachoknight.wantstobe.anearlyriser.model;

import java.util.List;

public class Body {
	private Integer bri;
	private Integer transitiontime;
	private Boolean on;
	private List<Double> xy;

	public Integer getBri() {
		return bri;
	}

	public void setBri(Integer bri) {
		this.bri = bri;
	}

	public Integer getTransitiontime() {
		return transitiontime;
	}

	public void setTransitiontime(Integer transitiontime) {
		this.transitiontime = transitiontime;
	}

	public Boolean getOn() {
		return on;
	}

	public void setOn(Boolean on) {
		this.on = on;
	}

	public List<Double> getXy() {
		return xy;
	}

	public void setXy(List<Double> xy) {
		this.xy = xy;
	}

}
