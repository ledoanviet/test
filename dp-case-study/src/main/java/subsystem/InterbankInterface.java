package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;

/**
 * The {@code InterbankInterface} class is used to communicate with the
 * {@link InterbankSubsystem InterbankSubsystem} to make transaction
 *
 * @author hieud
 * SOLID: vi phạm nguyên tắc DIP: phương thức payOrder có param CreditCard không phải 1 lớp trừu tượng, khi ta thay đổi loại card thì phải sửa trong code
 * ISP: 2 phương thức pay và refund không phải lúc nào cũng dùng cả 2, nên tách ra
 */
public interface InterbankInterface {

	/**
	 * Pay order, and then return the payment transaction
	 *
	 * @param card     - the credit card used for payment
	 * @param amount   - the amount to pay
	 * @param contents - the transaction contents
	 * @return {@link PaymentTransaction PaymentTransaction} - if the
	 *         payment is successful
	 * @throws PaymentException      if responded with a pre-defined error code
	 * @throws UnrecognizedException if responded with an unknown error code or
	 *                               something goes wrong
	 */
	public abstract PaymentTransaction payOrder(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizedException;

	/**
	 * Refund, and then return the payment transaction
	 *
	 * @param card     - the credit card which would be refunded to
	 * @param amount   - the amount to refund
	 * @param contents - the transaction contents
	 * @return {@link PaymentTransaction PaymentTransaction} - if the
	 *         payment is successful
	 * @throws PaymentException      if responded with a pre-defined error code
	 * @throws UnrecognizedException if responded with an unknown error code or
	 *                               something goes wrong
	 */
	public abstract PaymentTransaction refund(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizedException;

}
