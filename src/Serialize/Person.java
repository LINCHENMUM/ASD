package Serialize;

import java.io.Serializable;

public class Person implements Serializable {
private static final long serialVersionUID = 612279945459689055L;
private String name;
private String address;
public String getName(){
	return this.name;
}
public void setName(String name){
	this.name=name;
}
public String getAddress(){
	return this.address;
}
public void setAddress(String addr){
	this.address=addr;
}
}
