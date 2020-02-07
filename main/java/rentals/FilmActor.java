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

@Entity(name="film_actor")
public class FilmActor implements Serializable {

    /** Primary key. */
    protected static final String PK = "FilmActorFilmActorPkey";

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

    @EmbeddedId
    private FilmActorID filmActorId;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @ManyToOne(optional=false)
    @JoinColumn(name="actor_id", nullable=false)
    private Actor actor;
    @ManyToOne(optional=false)
    @JoinColumn(name="film_id", nullable=false)
    private Film film;

    /** Default constructor. */
    public FilmActor() {
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
     * Access method for actor.
     *
     * @return the current value of actor
     */
    public Actor getActor() {
        return actor;
    }

    /**
     * Setter method for actor.
     *
     * @param aActor the new value for actor
     */
    public void setActor(Actor aActor) {
        actor = aActor;
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

    /** Temporary value holder for group key fragment actorActorId */
    private transient int tempActorActorId;

    /**
     * Gets the key fragment actorId for member actor.
     * If this.actor is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setActorActorId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Actor
     */
    public int getActorActorId() {
        return (getActor() == null ? tempActorActorId : getActor().getActorId());
    }

    /**
     * Sets the key fragment actorId from member actor.
     * If this.actor is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getActorActorId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aActorId New value for the key fragment
     * @see Actor
     */
    public void setActorActorId(int aActorId) {
        if (getActor() == null) {
            tempActorActorId = aActorId;
        } else {
            getActor().setActorId(aActorId);
        }
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

    /**
     * Compares the key for this instance with another FilmActor.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FilmActor and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FilmActor)) {
            return false;
        }
        FilmActor that = (FilmActor) other;
        if (this.getActorActorId() != that.getActorActorId()) {
            return false;
        }
        if (this.getFilmFilmId() != that.getFilmFilmId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FilmActor.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FilmActor)) return false;
        return this.equalKeys(other) && ((FilmActor)other).equalKeys(this);
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
        i = getActorActorId();
        result = 37*result + i;
        i = getFilmFilmId();
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
        StringBuffer sb = new StringBuffer("[FilmActor |");
        sb.append(" actorActorId=").append(getActorActorId());
        sb.append(" filmFilmId=").append(getFilmFilmId());
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
        ret.put("actorActorId", Integer.valueOf(getActorActorId()));
        ret.put("filmFilmId", Integer.valueOf(getFilmFilmId()));
        return ret;
    }

}
