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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="country")
public class Country implements Serializable {

    /** Primary key. */
    protected static final String PK = "countryId";

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
    @Column(name="country_id", unique=true, nullable=false, precision=10)
    private int countryId;
    @Column(nullable=false, length=50)
    private String country;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy="country")
    private Set<City> city;

    /** Default constructor. */
    public Country() {
        super();
    }

    /**
     * Access method for countryId.
     *
     * @return the current value of countryId
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Setter method for countryId.
     *
     * @param aCountryId the new value for countryId
     */
    public void setCountryId(int aCountryId) {
        countryId = aCountryId;
    }

    /**
     * Access method for country.
     *
     * @return the current value of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(String aCountry) {
        country = aCountry;
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
     * Access method for city.
     *
     * @return the current value of city
     */
    public Set<City> getCity() {
        return city;
    }

    /**
     * Setter method for city.
     *
     * @param aCity the new value for city
     */
    public void setCity(Set<City> aCity) {
        city = aCity;
    }

    /**
     * Compares the key for this instance with another Country.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Country and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country that = (Country) other;
        if (this.getCountryId() != that.getCountryId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Country.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Country)) return false;
        return this.equalKeys(other) && ((Country)other).equalKeys(this);
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
        i = getCountryId();
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
        StringBuffer sb = new StringBuffer("[Country |");
        sb.append(" countryId=").append(getCountryId());
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
        ret.put("countryId", Integer.valueOf(getCountryId()));
        return ret;
    }

}
