package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
	//Serializable para transformar a classe em stream de bytes assim poder
	//salvá-la como arquivo ou para trafegar em rede
	private static final long serialVersionUID = 1L;
	
	Integer id;
	String name;
	
	public Department() {
		
	}

	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//hashCode e equals para comparar objetos pelo conteúdo
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}	
	
}
