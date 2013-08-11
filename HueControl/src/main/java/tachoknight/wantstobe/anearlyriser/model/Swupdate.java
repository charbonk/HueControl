package tachoknight.wantstobe.anearlyriser.model;

public class Swupdate {
	private String text;
	private Boolean notify;
	private Integer updatestate;
	private String url;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getNotify() {
		return notify;
	}

	public void setNotify(Boolean notify) {
		this.notify = notify;
	}

	public Integer getUpdatestate() {
		return updatestate;
	}

	public void setUpdatestate(Integer updatestate) {
		this.updatestate = updatestate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "\n    Swupdate" + 
				"\n      text=" + text + 
				"\n      notify=" + notify + 
				"\n      updatestate=" + updatestate + 
				"\n      url=" + url + "]";
	}
	


}
