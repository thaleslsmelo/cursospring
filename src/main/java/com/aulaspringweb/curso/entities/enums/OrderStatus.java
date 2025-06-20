package com.aulaspringweb.curso.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT("Aguardando"),
	PAID("Pago"),
	SHIPPED("Empacotado"),
	DELIVERED("Delivery"),
	CANCELED("Cancelado");
	
	private String code;
	
	private OrderStatus(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public static OrderStatus valeOf(String code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
			
		}
		throw new IllegalArgumentException("Satus Invalido");
	}


}
