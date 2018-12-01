package com.mysite.springboottest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Translation {
	@Id
  private String key;
  private String enDesc;
  private String frDesc;
  
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Translation other = (Translation) obj;
	if (key == null) {
		if (other.key != null)
			return false;
	} else if (!key.equals(other.key))
		return false;
	return true;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((key == null) ? 0 : key.hashCode());
	return result;
}
public Translation(String key, String enDesc, String frDesc) {
	this.key = key;
	this.enDesc = enDesc;
	this.frDesc = frDesc;
}
public Translation() {
}

}
