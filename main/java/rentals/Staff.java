// Generated with g9.

package rentals;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity(name="staff")
public class Staff implements Serializable {

    /** Primary key. */
    protected static final String PK = "staffId";

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
    @Column(name="staff_id", unique=true, nullable=false, precision=10)
    private int staffId;
    @Column(name="first_name", nullable=false, length=45)
    private String firstName;
    @Column(name="last_name", nullable=false, length=45)
    private String lastName;
    @Column(length=50)
    private String email;
    @Column(name="store_id", nullable=false, precision=5)
    private short storeId;
    @Column(nullable=false, length=1)
    private boolean active;
    @Column(nullable=false, length=16)
    private String username;
    @Column(length=40)
    private String password;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    private byte[] picture;
    @OneToOne(mappedBy="staff")
    private Store store;
    @ManyToOne
    @JoinColumn(name="address_id", nullable=false)
    private Address address;

    /** Default constructor. */
    public Staff() {
        super();
    }

    /**
     * Access method for staffId.
     *
     * @return the current value of staffId
     */
    public int getStaffId() {
        return staffId;
    }

    /**
     * Setter method for staffId.
     *
     * @param aStaffId the new value for staffId
     */
    public void setStaffId(int aStaffId) {
        staffId = aStaffId;
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
     * Access method for active.
     *
     * @return true if and only if active is currently true
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Setter method for active.
     *
     * @param aActive the new value for active
     */
    public void setActive(boolean aActive) {
        active = aActive;
    }

    /**
     * Access method for username.
     *
     * @return the current value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for username.
     *
     * @param aUsername the new value for username
     */
    public void setUsername(String aUsername) {
        username = aUsername;
    }

    /**
     * Access method for password.
     *
     * @return the current value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password.
     *
     * @param aPassword the new value for password
     */
    public void setPassword(String aPassword) {
        password = aPassword;
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
     * Access method for picture.
     *
     * @return the current value of picture
     */
    public byte[] getPicture() {
        return picture;
    }

    /**
     * Setter method for picture.
     *
     * @param aPicture the new value for picture
     */
    public void setPicture(byte[] aPicture) {
        picture = aPicture;
    }

    /**
     * Access method for store.
     *
     * @return the current value of store
     */
    public Store getStore() {
        return store;
    }

    /**
     * Setter method for store.
     *
     * @param aStore the new value for store
     */
    public void setStore(Store aStore) {
        store = aStore;
    }

    /**
     * Compares the key for this instance with another Staff.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Staff and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Staff)) {
            return false;
        }
        Staff that = (Staff) other;
        if (this.getStaffId() != that.getStaffId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Staff.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Staff)) return false;
        return this.equalKeys(other) && ((Staff)other).equalKeys(this);
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
        i = getStaffId();
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
        StringBuffer sb = new StringBuffer("[Staff |");
        sb.append(" staffId=").append(getStaffId());
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
        ret.put("staffId", Integer.valueOf(getStaffId()));
        return ret;
    }

}
