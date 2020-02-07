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
@Table(name="inventory", indexes={@Index(name="inventoryIdxStoreIdFilmId", columnList="store_id,film_id")})
public class Inventory implements Serializable {

    /** Primary key. */
    protected static final String PK = "inventoryId";

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
    @Column(name="inventory_id", unique=true, nullable=false, precision=10)
    private int inventoryId;
    @Column(name="store_id", nullable=false, precision=5)
    private short storeId;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @ManyToOne(optional=false)
    @JoinColumn(name="film_id", nullable=false)
    private Film film;
    @OneToMany(mappedBy="inventory")
    private Set<Rental> rental;

    /** Default constructor. */
    public Inventory() {
        super();
    }

    /**
     * Access method for inventoryId.
     *
     * @return the current value of inventoryId
     */
    public int getInventoryId() {
        return inventoryId;
    }

    /**
     * Setter method for inventoryId.
     *
     * @param aInventoryId the new value for inventoryId
     */
    public void setInventoryId(int aInventoryId) {
        inventoryId = aInventoryId;
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
     * Access method for film.
     *
     * @return the current value of film
     */
    public Film getFilm() {
        return film;
    }

    /**
     * Setter method for film.
     *
     * @param aFilm the new value for film
     */
    public void setFilm(Film aFilm) {
        film = aFilm;
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
     * Gets the group fragment filmId for member film.
     *
     * @return Current value of the group fragment
     * @see Film
     */
    public int getFilmFilmId() {
        return (getFilm() == null ? null : getFilm().getFilmId());
    }

    /**
     * Sets the group fragment filmId from member film.
     *
     * @param aFilmId New value for the group fragment
     * @see Film
     */
    public void setFilmFilmId(int aFilmId) {
        if (getFilm() != null) {
            getFilm().setFilmId(aFilmId);
        }
    }

    /**
     * Compares the key for this instance with another Inventory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Inventory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Inventory)) {
            return false;
        }
        Inventory that = (Inventory) other;
        if (this.getInventoryId() != that.getInventoryId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Inventory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Inventory)) return false;
        return this.equalKeys(other) && ((Inventory)other).equalKeys(this);
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
        i = getInventoryId();
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
        StringBuffer sb = new StringBuffer("[Inventory |");
        sb.append(" inventoryId=").append(getInventoryId());
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
        ret.put("inventoryId", Integer.valueOf(getInventoryId()));
        return ret;
    }

}
