// Generated with g9.

package rentals;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="payment")
public class Payment implements Serializable {

    /** Primary key. */
    protected static final String PK = "paymentId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="payment_id", unique=true, nullable=false, precision=10)
    private int paymentId;
    @Column(nullable=false, precision=5, scale=2)
    private BigDecimal amount;
    @Column(name="payment_date", nullable=false)
    private Timestamp paymentDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="customer_id", nullable=false)
    private Customer customer;
    @ManyToOne(optional=false)
    @JoinColumn(name="rental_id", nullable=false)
    private Rental rental;
    @ManyToOne(optional=false)
    @JoinColumn(name="staff_id", nullable=false)
    private Staff staff;

    /** Default constructor. */
    public Payment() {
        super();
    }

    /**
     * Access method for paymentId.
     *
     * @return the current value of paymentId
     */
    public int getPaymentId() {
        return paymentId;
    }

    /**
     * Setter method for paymentId.
     *
     * @param aPaymentId the new value for paymentId
     */
    public void setPaymentId(int aPaymentId) {
        paymentId = aPaymentId;
    }

    /**
     * Access method for amount.
     *
     * @return the current value of amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Setter method for amount.
     *
     * @param aAmount the new value for amount
     */
    public void setAmount(BigDecimal aAmount) {
        amount = aAmount;
    }

    /**
     * Access method for paymentDate.
     *
     * @return the current value of paymentDate
     */
    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    /**
     * Setter method for paymentDate.
     *
     * @param aPaymentDate the new value for paymentDate
     */
    public void setPaymentDate(Timestamp aPaymentDate) {
        paymentDate = aPaymentDate;
    }

    /**
     * Access method for customer.
     *
     * @return the current value of customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter method for customer.
     *
     * @param aCustomer the new value for customer
     */
    public void setCustomer(Customer aCustomer) {
        customer = aCustomer;
    }

    /**
     * Access method for rental.
     *
     * @return the current value of rental
     */
    public Rental getRental() {
        return rental;
    }

    /**
     * Setter method for rental.
     *
     * @param aRental the new value for rental
     */
    public void setRental(Rental aRental) {
        rental = aRental;
    }

    /**
     * Access method for staff.
     *
     * @return the current value of staff
     */
    public Staff getStaff() {
        return staff;
    }

    /**
     * Setter method for staff.
     *
     * @param aStaff the new value for staff
     */
    public void setStaff(Staff aStaff) {
        staff = aStaff;
    }

    /**
     * Compares the key for this instance with another Payment.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Payment and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Payment)) {
            return false;
        }
        Payment that = (Payment) other;
        if (this.getPaymentId() != that.getPaymentId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Payment.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Payment)) return false;
        return this.equalKeys(other) && ((Payment)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getPaymentId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Payment |");
        sb.append(" paymentId=").append(getPaymentId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("paymentId", Integer.valueOf(getPaymentId()));
        return ret;
    }

}
