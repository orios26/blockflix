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

@Entity
public class Category implements Serializable {

    /** Primary key. */
    protected static final String PK = "categoryId";

//    /**
//     * The optimistic lock. Available via standard bean get/set operations.
//     */
//    @Version
//    @Column(name="LOCK_FLAG")
//    private Integer lockFlag;
//
//    /**
//     * Access method for the lockFlag property.
//     *
//     * @return the current value of the lockFlag property
//     */
//    public Integer getLockFlag() {
//        return lockFlag;
//    }
//
//    /**
//     * Sets the value of the lockFlag property.
//     *
//     * @param aLockFlag the new value of the lockFlag property
//     */
//    public void setLockFlag(Integer aLockFlag) {
//        lockFlag = aLockFlag;
//    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="category_id", unique=true, nullable=false, precision=10)
    private int categoryId;
    @Column(nullable=false, length=25)
    private String name;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy="category")
    private Set<FilmCategory> filmCategory;

    /** Default constructor. */
    public Category() {
        super();
    }

    /**
     * Access method for categoryId.
     *
     * @return the current value of categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Setter method for categoryId.
     *
     * @param aCategoryId the new value for categoryId
     */
    public void setCategoryId(int aCategoryId) {
        categoryId = aCategoryId;
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
     * Access method for filmCategory.
     *
     * @return the current value of filmCategory
     */
    public Set<FilmCategory> getFilmCategory() {
        return filmCategory;
    }

    /**
     * Setter method for filmCategory.
     *
     * @param aFilmCategory the new value for filmCategory
     */
    public void setFilmCategory(Set<FilmCategory> aFilmCategory) {
        filmCategory = aFilmCategory;
    }

    /**
     * Compares the key for this instance with another Category.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Category and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Category)) {
            return false;
        }
        Category that = (Category) other;
        if (this.getCategoryId() != that.getCategoryId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Category.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Category)) return false;
        return this.equalKeys(other) && ((Category)other).equalKeys(this);
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
        i = getCategoryId();
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
        StringBuffer sb = new StringBuffer("[Category |");
        sb.append(" categoryId=").append(getCategoryId());
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
        ret.put("categoryId", Integer.valueOf(getCategoryId()));
        return ret;
    }

}
