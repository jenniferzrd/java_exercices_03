package exercice.elections;

import java.util.ArrayList;

public class ListeElectorale {

	private int id;
	private String name;
	private int vote;
	private int seat = 0;
	private boolean ko = false;
	
	private static int currentIdIndex = 0;
	
	public ListeElectorale() {
		
		setId(currentIdIndex);
		currentIdIndex ++;
		
	}

	public ListeElectorale(int id, String name, int vote, int seat, boolean ko) {
		super();
		this.id = id;
		currentIdIndex = id;
		this.name = name;
		this.vote = vote;
		this.seat = seat;
		this.ko = ko;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			throw new ElectionsException("L'id doit être > 0");
		} else {
			this.id = id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == "") {
			throw new ElectionsException("");
		} else {
			this.name = name;
		}
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		if (vote < 0) {
			throw new ElectionsException("Le nombre de votes doit être > 0");
		} else {
			this.vote = vote;
		}
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		if (seat < 0) {
			throw new ElectionsException("Le nombre de sièges doit être > 0");
		} else {
			this.seat = seat;
		}
	}

	public boolean isKo() {
		return ko;
	}

	public void setKo(boolean ko) {
		this.ko = ko;
	}

	@Override
	public String toString() {
		return "ListeElectorale [id=" + id + ", name=" + name + ", vote=" + vote + ", seat=" + seat + ", ko=" + ko
				+ "]";
	}

}
