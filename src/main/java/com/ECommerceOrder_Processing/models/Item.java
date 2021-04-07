package com.ECommerceOrder_Processing.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.Nullable;

@Entity
@Table(name="order_line")
public class Item {
	@Id
	@SequenceGenerator(name = "item_sequence", sequenceName = "item_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_sequence")
	private long item_id;

	private String item_name;
	private int item_quantity;
	private long item_price;
	private double order_tax;
	private double order_total;

	public Item(String item_name, int item_quantity, long item_price, double order_tax, double order_total) {
		this.item_name = item_name;
		this.item_quantity = item_quantity;
		this.item_price = item_price;
		this.order_tax = order_tax;
		this.order_total = order_total;
	}

	public Item() {
	}

	public long getItem_id() {
		return item_id;
	}

	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getItem_quantity() {
		return item_quantity;
	}

	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}

	public long getItem_price() {
		return item_price;
	}

	public void setItem_price(long item_price) {
		this.item_price = item_price;
	}

	public double getOrder_tax() {
		return order_tax;
	}

	public void setOrder_tax(double order_tax) {
		this.order_tax = order_tax;
	}

	public double getOrder_total() {
		return order_total;
	}

	public void setOrder_total(double order_total) {
		this.order_total = order_total;
	}

	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_quantity=" + item_quantity
				+ ", item_price=" + item_price + "]";
	}
}
