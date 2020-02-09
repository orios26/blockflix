// Generated with g9.

package rentals;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="film_category")
public class FilmCategory implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = -900074550598588982L;
	//    /** Primary key. */
//    protected static final String PK = "FilmCategoryFilmCategoryPkey";
//    
    @EmbeddedId
    private FilmCategoryID filmCategoryID;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @ManyToOne(optional=false)
    @JoinColumn(name="category_id", nullable=false)
    private Category category;
    @ManyToOne(optional=false)
    @JoinColumn(name="film_id", nullable=false)
    private Film film;

    /** Default constructor. */
    public FilmCategory() {
        super();
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
     * Access method for category.
     *
     * @return the current value of category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Setter method for category.
     *
     * @param aCategory the new value for category
     */
    public void setCategory(Category aCategory) {
        category = aCategory;
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

    /** Temporary value holder for group key fragment filmFilmId */
    private transient int tempFilmFilmId;

    /**
     * Gets the key fragment filmId for member film.
     * If this.film is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setFilmFilmId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Film
     */
    public int getFilmFilmId() {
        return (getFilm() == null ? tempFilmFilmId : getFilm().getFilmId());
    }

    /**
     * Sets the key fragment filmId from member film.
     * If this.film is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getFilmFilmId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aFilmId New value for the key fragment
     * @see Film
     */
    public void setFilmFilmId(int aFilmId) {
        if (getFilm() == null) {
            tempFilmFilmId = aFilmId;
        } else {
            getFilm().setFilmId(aFilmId);
        }
    }

    /** Temporary value holder for group key fragment categoryCategoryId */
    private transient int tempCategoryCategoryId;

    /**
     * Gets the key fragment categoryId for member category.
     * If this.category is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setCategoryCategoryId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Category
     */
    public int getCategoryCategoryId() {
        return (getCategory() == null ? tempCategoryCategoryId : getCategory().getCategoryId());
    }

    /**
     * Sets the key fragment categoryId from member category.
     * If this.category is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getCategoryCategoryId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCategoryId New value for the key fragment
     * @see Category
     */
    public void setCategoryCategoryId(int aCategoryId) {
        if (getCategory() == null) {
            tempCategoryCategoryId = aCategoryId;
        } else {
            getCategory().setCategoryId(aCategoryId);
        }
    }

    /**
     * Compares the key for this instance with another FilmCategory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FilmCategory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FilmCategory)) {
            return false;
        }
        FilmCategory that = (FilmCategory) other;
        if (this.getFilmFilmId() != that.getFilmFilmId()) {
            return false;
        }
        if (this.getCategoryCategoryId() != that.getCategoryCategoryId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FilmCategory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FilmCategory)) return false;
        return this.equalKeys(other) && ((FilmCategory)other).equalKeys(this);
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
        i = getFilmFilmId();
        result = 37*result + i;
        i = getCategoryCategoryId();
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
        StringBuffer sb = new StringBuffer("[FilmCategory |");
        sb.append(" filmFilmId=").append(getFilmFilmId());
        sb.append(" categoryCategoryId=").append(getCategoryCategoryId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
//    public Map<String, Object> getPrimaryKey() {
//        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
//        ret.put("filmFilmId", Integer.valueOf(getFilmFilmId()));
//        ret.put("categoryCategoryId", Integer.valueOf(getCategoryCategoryId()));
//        return ret;
//    }

}
