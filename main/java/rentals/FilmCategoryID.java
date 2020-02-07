package rentals;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class FilmCategoryID implements Serializable {
	
	@NotNull
	private Integer filmID;
	@NotNull
	private Integer categoryID;

	public Integer getFilmID() {
		return filmID;
	}
	public void setFilmID(Integer filmID) {
		this.filmID = filmID;
	}
	public Integer getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}
	
	public FilmCategoryID(Integer filmID, Integer categoryID) {
		this.filmID = filmID;
		this.categoryID = categoryID;
	}

}
