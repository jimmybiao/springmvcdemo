package mvc.pojo;

import java.io.Serializable;

public class Memo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8752832017820659524L;

	private Integer id;
	private String title;
	private Double amount;
	private String remark;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "Memo [id=" + id + ", title=" + title + ", amount=" + amount + ", remark=" + remark + "]";
	}
	
}
