package rentals;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class FilmActorID implements Serializable{

	@NotNull
	private Integer filmID;

	@NotNull
	private Integer actorID;
	
	public Integer getFilmID() {
		return filmID;
	}

	public void setFilmID(Integer filmID) {
		this.filmID = filmID;
	}

	public Integer getActorID() {
		return actorID;
	}

	public void setActorID(Integer actorID) {
		this.actorID = actorID;
	}
	
	public FilmActorID(Integer filmID, Integer actorID) {
		this.filmID = filmID;
		this.actorID = actorID;
	}
	

}
