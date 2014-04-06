package edu.isi.bmkeg.lapdf.xml.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="word")
public class LapdftextXMLWord extends LapdftextXMLRectangle implements Serializable {
	static final long serialVersionUID = 8047039304729208683L;

	private String t;

	private int fId;

	private int sId;

	private int order;

	@XmlAttribute	
	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	@XmlAttribute	
	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	@XmlAttribute	
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	@XmlAttribute	
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
}
