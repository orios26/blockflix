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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="address")
public class Address implements Serializable {

    /** Primary key. */
    protected static final String PK = "addressId";

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
    @Column(name="address_id", unique=true, nullable=false, precision=10)
    private int addressId;
    @Column(nullable=false, length=50)
    private String address;
    @Column(length=50)
    private String address2;
    @Column(nullable=false, length=20)
    private String district;
    @Column(name="postal_code", length=10)
    private String postalCode;
    @Column(nullable=false, length=20)
    private String phone;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy="address")
    private Set<Staff> staff;
    @ManyToOne
    @JoinColumn(name="city_id", nullable=false)
    private City city;

    /** Default constructor. */
    public Address() {
        super();
    }

    /**
     * Access method for addressId.
     *
     * @return the current value of addressId
     */
    public int getAddressId() {
        return addressId;
    }

    /**
     * Setter method for addressId.
     *
     * @param aAddressId the new value for addressId
     */
    public void setAddressId(int aAddressId) {
        addressId = aAddressId;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(String aAddress) {
        address = aAddress;
    }

    /**
     * Access method for address2.
     *
     * @return the current value of address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Setter method for address2.
     *
     * @param aAddress2 the new value for address2
     */
    public void setAddress2(String aAddress2) {
        address2 = aAddress2;
    }

    /**
     * Access method for district.
     *
     * @return the current value of district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Setter method for district.
     *
     * @param aDistrict the new value for district
     */
    public void setDistrict(String aDistrict) {
        district = aDistrict;
    }

    /**
     * Access method for postalCode.
     *
     * @return the current value of postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter method for postalCode.
     *
     * @param aPostalCode the new value for postalCode
     */
    public void setPostalCode(String aPostalCode) {
        postalCode = aPostalCode;
    }

    /**
     * Access method for phone.
     *
     * @return the current value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter method for phone.
     *
     * @param aPhone the new value for phone
     */
    public void setPhone(String aPhone) {
        phone = aPhone;
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
     * Compares the key for this instance with another Address.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Address and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address that = (Address) other;
        if (this.getAddressId() != that.getAddressId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Address.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Address)) return false;
        return this.equalKeys(other) && ((Address)other).equalKeys(this);
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
        i = getAddressId();
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
        StringBuffer sb = new StringBuffer("[Address |");
        sb.append(" addressId=").append(getAddressId());
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
        ret.put("addressId", Integer.valueOf(getAddressId()));
        return ret;
    }

}
