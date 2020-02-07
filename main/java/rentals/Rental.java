// Generated with g9.

package rentals;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="rental", indexes={@Index(name="rentalIdxUnqRentalRentalDateInventoryIdCustomerId", columnList="rental_date,inventory_id,customer_id", unique=true)})
public class Rental implements Serializable {

    /** Primary key. */
    protected static final String PK = "rentalId";

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
    @Column(name="rental_id", unique=true, nullable=false, precision=10)
    private int rentalId;
    @Column(name="rental_date", nullable=false)
    private Timestamp rentalDate;
    @Column(name="return_date")
    private Timestamp returnDate;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy="rental")
    private Set<Payment> payment;
    @ManyToOne(optional=false)
    @JoinColumn(name="customer_id", nullable=false)
    private Customer customer;
    @ManyToOne(optional=false)
    @JoinColumn(name="inventory_id", nullable=false)
    private Inventory inventory;
    @ManyToOne(optional=false)
    @JoinColumn(name="staff_id", nullable=false)
    private Staff staff;

    /** Default constructor. */
    public Rental() {
        super();
    }

    /**
     * Access method for rentalId.
     *
     * @return the current value of rentalId
     */
    public int getRentalId() {
        return rentalId;
    }

    /**
     * Setter method for rentalId.
     *
     * @param aRentalId the new value for rentalId
     */
    public void setRentalId(int aRentalId) {
        rentalId = aRentalId;
    }

    /**
     * Access method for rentalDate.
     *
     * @return the current value of rentalDate
     */
    public Timestamp getRentalDate() {
        return rentalDate;
    }

    /**
     * Setter method for rentalDate.
     *
     * @param aRentalDate the new value for rentalDate
     */
    public void setRentalDate(Timestamp aRentalDate) {
        rentalDate = aRentalDate;
    }

    /**
     * Access method for returnDate.
     *
     * @return the current value of returnDate
     */
    public Timestamp getReturnDate() {
        return returnDate;
    }

    /**
     * Setter method for returnDate.
     *
     * @param aReturnDate the new value for returnDate
     */
    public void setReturnDate(Timestamp aReturnDate) {
        returnDate = aReturnDate;
    }

    /**
     * Access method for lastUpdate.
     *
     * @return the current value of lastUpdate
     */
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Setter method for lastUpdate.
     *
     * @param aLastUpdate the new value for lastUpdate
     */
    public void setLastUpdate(Timestamp aLastUpdate) {
        lastUpdate = aLastUpdate;
    }

    /**
     * Access method for payment.
     *
     * @return the current value of payment
     */
    public Set<Payment> getPayment() {
        return payment;
    }

    /**
     * Setter method for payment.
     *
     * @param aPayment the new value for payment
     */
    public void setPayment(Set<Payment> aPayment) {
        payment = aPayment;
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
     * Access method for inventory.
     *
     * @return the current value of inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Setter method for inventory.
     *
     * @param aInventory the new value for inventory
     */
    public void setInventory(Inventory aInventory) {
        inventory = aInventory;
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
     * Gets the group fragment inventoryId for member inventory.
     *
     * @return Current value of the group fragment
     * @see Inventory
     */
    public int getInventoryInventoryId() {
        return (getInventory() == null ? null : getInventory().getInventoryId());
    }

    /**
     * Sets the group fragment inventoryId from member inventory.
     *
     * @param aInventoryId New value for the group fragment
     * @see Inventory
     */
    public void setInventoryInventoryId(int aInventoryId) {
        if (getInventory() != null) {
            getInventory().setInventoryId(aInventoryId);
        }
    }

    /**
     * Gets the group fragment customerId for member customer.
     *
     * @return Current value of the group fragment
     * @see Customer
     */
    public int getCustomerCustomerId() {
        return (getCustomer() == null ? null : getCustomer().getCustomerId());
    }

    /**
     * Sets the group fragment customerId from member customer.
     *
     * @param aCustomerId New value for the group fragment
     * @see Customer
     */
    public void setCustomerCustomerId(int aCustomerId) {
        if (getCustomer() != null) {
            getCustomer().setCustomerId(aCustomerId);
        }
    }

    /**
     * Compares the key for this instance with another Rental.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Rental and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Rental)) {
            return false;
        }
        Rental that = (Rental) other;
        if (this.getRentalId() != that.getRentalId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Rental.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Rental)) return false;
        return this.equalKeys(other) && ((Rental)other).equalKeys(this);
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
        i = getRentalId();
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
        StringBuffer sb = new StringBuffer("[Rental |");
        sb.append(" rentalId=").append(getRentalId());
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
        ret.put("rentalId", Integer.valueOf(getRentalId()));
        return ret;
    }

}
