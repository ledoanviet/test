package entity.payment;

/**
 *  DIP: Thay thế Credit card bằng 1 lớp trừu tượng card để áp dụng một khi thay đổi loại card
 * vi phạm nguyên lý Open/Close
 * class chứa instance của CreditCard, trong tương lai nếu thay đổi loại thẻ thì sẽ phải thay đổi
 * gp: nên tạo 1 abstract class Card, CreditCard kế thừa từ Card
 */
public class PaymentTransaction {
	private String errorCode;
	private CreditCard card;
	private String transactionId;
	private String transactionContent;
	private int amount;
	private String createdAt;

	public PaymentTransaction(String errorCode, CreditCard card, String transactionId, String transactionContent,
                              int amount, String createdAt) {
		super();
		this.errorCode = errorCode;
		this.card = card;
		this.transactionId = transactionId;
		this.transactionContent = transactionContent;
		this.amount = amount;
		this.createdAt = createdAt;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
