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

@Entity(name="language")
public class Language implements Serializable {

    /** Primary key. */
    protected static final String PK = "languageId";

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
    @Column(name="language_id", unique=true, nullable=false, precision=10)
    private int languageId;
    @Column(nullable=false, length=20)
    private String name;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy="language")
    private Set<Film> film;

    /** Default constructor. */
    public Language() {
        super();
    }

    /**
     * Access method for languageId.
     *
     * @return the current value of languageId
     */
    public int getLanguageId() {
        return languageId;
    }

    /**
     * Setter method for languageId.
     *
     * @param aLanguageId the new value for languageId
     */
    public void setLanguageId(int aLanguageId) {
        languageId = aLanguageId;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
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
    public Set<Film> getFilm() {
        return film;
    }

    /**
     * Setter method for film.
     *
     * @param aFilm the new value for film
     */
    public void setFilm(Set<Film> aFilm) {
        film = aFilm;
    }

    /**
     * Compares the key for this instance with another Language.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Language and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Language)) {
            return false;
        }
        Language that = (Language) other;
        if (this.getLanguageId() != that.getLanguageId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Language.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Language)) return false;
        return this.equalKeys(other) && ((Language)other).equalKeys(this);
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
        i = getLanguageId();
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
        StringBuffer sb = new StringBuffer("[Language |");
        sb.append(" languageId=").append(getLanguageId());
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
        ret.put("languageId", Integer.valueOf(getLanguageId()));
        return ret;
    }

}
