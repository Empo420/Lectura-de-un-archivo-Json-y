package mundo;

public class Heroes {

	private String superhero;
	private String publisher;
	private String alter_ego;
	private String first_appearance;
	private String characters;

	public Heroes(String superhero, String publisher, String alter_ego, String first_appearance, String characters) {
		this.superhero = superhero;
		this.publisher = publisher;
		this.alter_ego = alter_ego;
		this.first_appearance = first_appearance;
		this.characters = characters;
	}

	public String getSuperhero() {
		return superhero;
	}

	public void setSuperhero(String superhero) {
		this.superhero = superhero;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAlter_ego() {
		return alter_ego;
	}

	public void setAlter_ego(String alter_ego) {
		this.alter_ego = alter_ego;
	}

	public String getFirst_appearance() {
		return first_appearance;
	}

	public void setFirst_appearance(String first_appearance) {
		this.first_appearance = first_appearance;
	}

	public String getCharacters() {
		return characters;
	}

	public void setCharacters(String characters) {
		this.characters = characters;
	}

	@Override
	public String toString() {
		return "Heroes [superhero=" + superhero + ", publisher=" + publisher + ", alter_ego=" + alter_ego
				+ ", first_appearance=" + first_appearance + ", characters=" + characters + "]";
	}

}
