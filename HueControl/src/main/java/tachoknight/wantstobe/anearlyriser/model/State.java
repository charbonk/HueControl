package tachoknight.wantstobe.anearlyriser.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonFilter;

@JsonFilter("stateFilter")
public class State {
	private Integer bri;
	private String effect;
	private Integer sat;
	private Boolean reachable;
	private String alert;
	private Integer hue;
	private String colormode;
	private Boolean on;
	private Integer ct;
	private List<Double> xy;

	public Integer getBri() {
		return bri;
	}

	public void setBri(Integer bri) {
		this.bri = bri;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public Integer getSat() {
		return sat;
	}

	public void setSat(Integer sat) {
		this.sat = sat;
	}

	@JsonIgnore
	public Boolean getReachable() {
		return reachable;
	}

	public void setReachable(Boolean reachable) {
		this.reachable = reachable;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public Integer getHue() {
		return hue;
	}

	public void setHue(Integer hue) {
		this.hue = hue;
	}

	public String getColormode() {
		return colormode;
	}

	public void setColormode(String colormode) {
		this.colormode = colormode;
	}

	public Boolean getOn() {
		return on;
	}

	public void setOn(Boolean on) {
		this.on = on;
	}

	public Integer getCt() {
		return ct;
	}

	public void setCt(Integer ct) {
		this.ct = ct;
	}

	public List<Double> getXy() {
		return xy;
	}

	public void setXy(List<Double> xy) {
		this.xy = xy;
	}

	@Override
	public String toString() {
		return "State " + 
				"\n      bri=" + bri + 
				"\n      effect=" + effect + 
				"\n      sat=" + sat + 
				"\n      reachable=" + reachable + 
				"\n      alert=" + alert + 
				"\n      hue=" + hue + 
				"\n      colormode=" + colormode + 
				"\n      on=" + on + 
				"\n      ct=" + ct + 
				"\n      xy=" + xy + "]";
	}

}
