package com.ApiTeste.ApiTeste.model;

import java.util.List;

public class Testes {
	
	private List<Cliente> listCliente;
	private String data;
	
	public List<Cliente> getListCliente() {
		return listCliente;
	}
	public void setListCliente(List<Cliente> listCliente) {
		this.listCliente = listCliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((listCliente == null) ? 0 : listCliente.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Testes other = (Testes) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (listCliente == null) {
			if (other.listCliente != null)
				return false;
		} else if (!listCliente.equals(other.listCliente))
			return false;
		return true;
	}
	
	
}
