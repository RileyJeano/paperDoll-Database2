package riley.patrick.paperDoll.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Face {

	@Id
	@GeneratedValue
	private Long faceId;
	private String faceStyle;

	@JsonIgnore
	@OneToOne
	private Base base;

	public Face() {

	}

	public Face(String face) {
		this.faceStyle = face;
	}

	public Base getBase() {
		return base;
	}

	public Long getHeadId() {
		return faceId;
	}

	public String getHead() {
		return faceStyle;
	}

}
