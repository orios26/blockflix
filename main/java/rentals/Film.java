// Generated with g9.

package rentals;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity(name="film")
public class Film implements Serializable {

    /** Primary key. */
    protected static final String PK = "filmId";

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
    @Column(name="film_id", unique=true, nullable=false, precision=10)
    private int filmId;
    @Column(nullable=false, length=255)
    private String title;
    private String description;
    @Column(name="release_year", length=10)
    private String releaseYear;
    @Column(name="rental_duration", nullable=false, precision=5)
    private short rentalDuration;
    @Column(name="rental_rate", nullable=false, precision=4, scale=2)
    private BigDecimal rentalRate;
    @Column(precision=5)
    private short length;
    @Column(name="replacement_cost", nullable=false, precision=5, scale=2)
    private BigDecimal replacementCost;
    private String rating;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @Column(name="special_features")
    private String[] specialFeatures;
    @Column(nullable=false)
    private String fulltext;
    @OneToMany(mappedBy="film")
    private Set<FilmActor> filmActor;
    @OneToMany(mappedBy="film")
    private Set<FilmCategory> filmCategory;
    @ManyToOne(optional=false)
    @JoinColumn(name="language_id", nullable=false)
    private Language language;
    @OneToMany(mappedBy="film")
    private Set<Inventory> inventory;

    /** Default constructor. */
    public Film() {
        super();
    }

    /**
     * Access method for filmId.
     *
     * @return the current value of filmId
     */
    public int getFilmId() {
        return filmId;
    }

    /**
     * Setter method for filmId.
     *
     * @param aFilmId the new value for filmId
     */
    public void setFilmId(int aFilmId) {
        filmId = aFilmId;
    }

    /**
     * Access method for title.
     *
     * @return the current value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for title.
     *
     * @param aTitle the new value for title
     */
    public void setTitle(String aTitle) {
        title = aTitle;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for releaseYear.
     *
     * @return the current value of releaseYear
     */
    public String getReleaseYear() {
        return releaseYear;
    }

    /**
     * Setter method for releaseYear.
     *
     * @param aReleaseYear the new value for releaseYear
     */
    public void setReleaseYear(String aReleaseYear) {
        releaseYear = aReleaseYear;
    }

    /**
     * Access method for rentalDuration.
     *
     * @return the current value of rentalDuration
     */
    public short getRentalDuration() {
        return rentalDuration;
    }

    /**
     * Setter method for rentalDuration.
     *
     * @param aRentalDuration the new value for rentalDuration
     */
    public void setRentalDuration(short aRentalDuration) {
        rentalDuration = aRentalDuration;
    }

    /**
     * Access method for rentalRate.
     *
     * @return the current value of rentalRate
     */
    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    /**
     * Setter method for rentalRate.
     *
     * @param aRentalRate the new value for rentalRate
     */
    public void setRentalRate(BigDecimal aRentalRate) {
        rentalRate = aRentalRate;
    }

    /**
     * Access method for length.
     *
     * @return the current value of length
     */
    public short getLength() {
        return length;
    }

    /**
     * Setter method for length.
     *
     * @param aLength the new value for length
     */
    public void setLength(short aLength) {
        length = aLength;
    }

    /**
     * Access method for replacementCost.
     *
     * @return the current value of replacementCost
     */
    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    /**
     * Setter method for replacementCost.
     *
     * @param aReplacementCost the new value for replacementCost
     */
    public void setReplacementCost(BigDecimal aReplacementCost) {
        replacementCost = aReplacementCost;
    }

    /**
     * Access method for rating.
     *
     * @return the current value of rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * Setter method for rating.
     *
     * @param aRating the new value for rating
     */
    public void setRating(String aRating) {
        rating = aRating;
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
     * Access method for specialFeatures.
     *
     * @return the current value of specialFeatures
     */
    public String[] getSpecialFeatures() {
        return specialFeatures;
    }

    /**
     * Setter method for specialFeatures.
     *
     * @param aSpecialFeatures the new value for specialFeatures
     */
    public void setSpecialFeatures(String[] aSpecialFeatures) {
        specialFeatures = aSpecialFeatures;
    }

    /**
     * Access method for fulltext.
     *
     * @return the current value of fulltext
     */
    public String getFulltext() {
        return fulltext;
    }

    /**
     * Setter method for fulltext.
     *
     * @param aFulltext the new value for fulltext
     */
    public void setFulltext(String aFulltext) {
        fulltext = aFulltext;
    }

    /**
     * Access method for filmActor.
     *
     * @return the current value of filmActor
     */
    public Set<FilmActor> getFilmActor() {
        return filmActor;
    }

    /**
     * Setter method for filmActor.
     *
     * @param aFilmActor the new value for filmActor
     */
    public void setFilmActor(Set<FilmActor> aFilmActor) {
        filmActor = aFilmActor;
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
     * Access method for language.
     *
     * @return the current value of language
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Setter method for language.
     *
     * @param aLanguage the new value for language
     */
    public void setLanguage(Language aLanguage) {
        language = aLanguage;
    }

    /**
     * Access method for inventory.
     *
     * @return the current value of inventory
     */
    public Set<Inventory> getInventory() {
        return inventory;
    }

    /**
     * Setter method for inventory.
     *
     * @param aInventory the new value for inventory
     */
    public void setInventory(Set<Inventory> aInventory) {
        inventory = aInventory;
    }

    /**
     * Compares the key for this instance with another Film.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Film and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Film)) {
            return false;
        }
        Film that = (Film) other;
        if (this.getFilmId() != that.getFilmId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Film.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Film)) return false;
        return this.equalKeys(other) && ((Film)other).equalKeys(this);
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
        i = getFilmId();
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
        StringBuffer sb = new StringBuffer("[Film |");
        sb.append(" filmId=").append(getFilmId());
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
        ret.put("filmId", Integer.valueOf(getFilmId()));
        return ret;
    }

}
