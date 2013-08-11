package tachoknight.wantstobe.anearlyriser.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Config {
	private Boolean portalservices;
	private String gateway;
	private String mac;
	private Integer swversion;
	private Boolean linkbutton;
	private String ipaddress;
	private Integer proxyport;
	private Swupdate swupdate;
	private String netmask;
	private String name;
	private Boolean dhcp;
	@JsonProperty("UTC")
	private String UTC;
	private String proxyaddress;
	private Whitelist whitelist;

	public Boolean getPortalservices() {
		return portalservices;
	}

	public void setPortalservices(Boolean portalservices) {
		this.portalservices = portalservices;
	}

	public String getGateway() {
		return gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Integer getSwversion() {
		return swversion;
	}

	public void setSwversion(Integer swversion) {
		this.swversion = swversion;
	}

	public Boolean getLinkbutton() {
		return linkbutton;
	}

	public void setLinkbutton(Boolean linkbutton) {
		this.linkbutton = linkbutton;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public Integer getProxyport() {
		return proxyport;
	}

	public void setProxyport(Integer proxyport) {
		this.proxyport = proxyport;
	}

	public Swupdate getSwupdate() {
		return swupdate;
	}

	public void setSwupdate(Swupdate swupdate) {
		this.swupdate = swupdate;
	}

	public String getNetmask() {
		return netmask;
	}

	public void setNetmask(String netmask) {
		this.netmask = netmask;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getDhcp() {
		return dhcp;
	}

	public void setDhcp(Boolean dhcp) {
		this.dhcp = dhcp;
	}

	public String getUTC() {
		return UTC;
	}

	public void setUTC(String uTC) {
		UTC = uTC;
	}

	public String getProxyaddress() {
		return proxyaddress;
	}

	public void setProxyaddress(String proxyaddress) {
		this.proxyaddress = proxyaddress;
	}

	public Whitelist getWhitelist() {
		return whitelist;
	}

	public void setWhitelist(Whitelist whitelist) {
		this.whitelist = whitelist;
	}

	@Override
	public String toString() {
		return "\nConfig" + 
				"\n   portalservices=" + portalservices + 
				"\n   gateway=" + gateway + 
				"\n   mac=" + mac + 
				"\n   swversion=" + swversion + 
				"\n   linkbutton=" + linkbutton + 
				"\n   ipaddress=" + ipaddress + 
				"\n   proxyport=" + proxyport + 
				"\n   swupdate=" + swupdate + 
				"\n   netmask=" + netmask + 
				"\n   name=" + name + 
				"\n   dhcp=" + dhcp + 
				"\n   UTC=" + UTC + 
				"\n   proxyaddress=" + proxyaddress + 
				"\n   whitelist=" + whitelist + "]";
	}
}
