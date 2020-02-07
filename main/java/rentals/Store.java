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
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity(name="store")
public class Store implements Serializable {

    /** Primary key. */
    protected static final String PK = "storeId";

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
    @Column(name="store_id", unique=true, nullable=false, precision=10)
    private int storeId;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @OneToOne(optional=false)
    @JoinColumn(name="staff_id", nullable=false)
    private Staff staff;

    /** Default constructor. */
    public Store() {
        super();
    }

    /**
     * Access method for storeId.
     *
     * @return the current value of storeId
     */
    public int getStoreId() {
        return storeId;
    }

    /**
     * Setter method for storeId.
     *
     * @param aStoreId the new value for storeId
     */
    public void setStoreId(int aStoreId) {
        storeId = aStoreId;
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
     * Compares the key for this instance with another Store.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Store and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Store)) {
            return false;
        }
        Store that = (Store) other;
        if (this.getStoreId() != that.getStoreId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Store.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Store)) return false;
        return this.equalKeys(other) && ((Store)other).equalKeys(this);
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
        i = getStoreId();
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
        StringBuffer sb = new StringBuffer("[Store |");
        sb.append(" storeId=").append(getStoreId());
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
        ret.put("storeId", Integer.valueOf(getStoreId()));
        return ret;
    }

}
