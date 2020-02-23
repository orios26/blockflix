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

@Entity(name="actor")
public class Actor implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7800256088055293027L;

	/** Primary key. */
    protected static final String PK = "actorId";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="actor_id", unique=true, nullable=false, precision=10)
    private int actorId;
    @Column(name="first_name", nullable=false, length=45)
    private String firstName;
    @Column(name="last_name", nullable=false, length=45)
    private String lastName;
    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;
    @OneToMany(mappedBy="actor")
    private Set<FilmActor> filmActor;

    /** Default constructor. */
    public Actor() {
        super();
    }

    /**
     * Access method for actorId.
     *
     * @return the current value of actorId
     */
    public int getActorId() {
        return actorId;
    }

    /**
     * Setter method for actorId.
     *
     * @param aActorId the new value for actorId
     */
    public void setActorId(int aActorId) {
        actorId = aActorId;
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
     * Compares the key for this instance with another Actor.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Actor and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Actor)) {
            return false;
        }
        Actor that = (Actor) other;
        if (this.getActorId() != that.getActorId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Actor.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Actor)) return false;
        return this.equalKeys(other) && ((Actor)other).equalKeys(this);
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
        i = getActorId();
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
        StringBuffer sb = new StringBuffer("[Actor |");
        sb.append(" actorId=").append(getActorId());
        sb.append("]");
        return sb.toString();
    }

//    /**
//     * Return all elements of the primary key.
//     *
//     * @return Map of key names to values
//     */
//    public Map<String, Object> getPrimaryKey() {
//        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
//        ret.put("actorId", Integer.valueOf(getActorId()));
//        return ret;
//    }

}
