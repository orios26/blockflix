// Generated with g9.

package rentals;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="customer")
public class Customer implements Serializable {

    /** Primary key. */
    protected static final String PK = "customerId";

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
    @Column(name="customer_id", unique=true, nullable=false, precision=10)
    private int customerId;
    @Column(name="store_id", nullable=false, precision=5)
    private short storeId;
    @Column(name="first_name", nullable=false, length=45)
    private String firstName;
    @Column(name="last_name", nullable=false, length=45)
    private String lastName;
    @Column(length=50)
    private String email;
    @Column(nullable=false, length=1)
    private boolean activebool;
    @Column(name="create_date", nullable=false)
    private Date createDate;
    @Column(name="last_update")
    private Timestamp lastUpdate;
    @Column(precision=10)
    private int active;
    @ManyToOne(optional=false)
    @JoinColumn(name="address_id", nullable=false)
    private Address address;
    @OneToMany(mappedBy="customer")
    private Set<Payment> payment;
    @OneToMany(mappedBy="customer")
    private Set<Rental> rental;

    /** Default constructor. */
    public Customer() {
        super();
    }

    /**
     * Access method for customerId.
     *
     * @return the current value of customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Setter method for customerId.
     *
     * @param aCustomerId the new value for customerId
     */
    public void setCustomerId(int aCustomerId) {
        customerId = aCustomerId;
    }

    /**
     * Access method for storeId.
     *
     * @return the current value of storeId
     */
    public short getStoreId() {
        return storeId;
    }

    /**
     * Setter method for storeId.
     *
     * @param aStoreId the new value for storeId
     */
    public void setStoreId(short aStoreId) {
        storeId = aStoreId;
    }

    /**
     * Access method for firstName.
     *
     * @return the current value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter method for firstName.
     *
     * @param aFirstName the new value for firstName
     */
    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    /**
     * Access method for lastName.
     *
     * @return the current value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method for lastName.
     *
     * @param aLastName the new value for lastName
     */
    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for activebool.
     *
     * @return true if and only if activebool is currently true
     */
    public boolean isActivebool() {
        return activebool;
    }

    /**
     * Setter method for activebool.
     *
     * @param aActivebool the new value for activebool
     */
    public void setActivebool(boolean aActivebool) {
        activebool = aActivebool;
    }

    /**
     * Access method for createDate.
     *
     * @return the current value of createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Setter method for createDate.
     *
     * @param aCreateDate the new value for createDate
     */
    public void setCreateDate(Date aCreateDate) {
        createDate = aCreateDate;
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
     * Access method for active.
     *
     * @return the current value of active
     */
    public int getActive() {
        return active;
    }

    /**
     * Setter method for active.
     *
     * @param aActive the new value for active
     */
    public void setActive(int aActive) {
        active = aActive;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(Address aAddress) {
        address = aAddress;
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
     * Access method for rental.
     *
     * @return the current value of rental
     */
    public Set<Rental> getRental() {
        return rental;
    }

    /**
     * Setter method for rental.
     *
     * @param aRental the new value for rental
     */
    public void setRental(Set<Rental> aRental) {
        rental = aRental;
    }

    /**
     * Compares the key for this instance with another Customer.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Customer and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer that = (Customer) other;
        if (this.getCustomerId() != that.getCustomerId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Customer.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Customer)) return false;
        return this.equalKeys(other) && ((Customer)other).equalKeys(this);
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
        i = getCustomerId();
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
        StringBuffer sb = new StringBuffer("[Customer |");
        sb.append(" customerId=").append(getCustomerId());
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
        ret.put("customerId", Integer.valueOf(getCustomerId()));
        return ret;
    }

}
