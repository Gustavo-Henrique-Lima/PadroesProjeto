package adpater;

public class PpayImpl implements PPay{

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cvvNo;
	private Double totalAmount;
	
	
	public PpayImpl(String custCardNo, String cardOwnerName, String cardExpMonthDate, Integer cvvNo,
			Double totalAmount) {
		this.custCardNo = custCardNo;
		this.cardOwnerName = cardOwnerName;
		this.cardExpMonthDate = cardExpMonthDate;
		this.cvvNo = cvvNo;
		this.totalAmount = totalAmount;
	}
	
	@Override
	public String getCustCardNo() {
		return  custCardNo;
	}
	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}
	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}
	@Override
	public Integer getCVVNo() {
		return cvvNo;
	}
	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}
	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo=custCardNo;
	}
	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName=cardOwnerName;
	}
	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate=cardExpMonthDate;
	}
	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cvvNo=cVVNo;
	}
	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount=totalAmount;
	}
}