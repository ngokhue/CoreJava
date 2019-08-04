package collection;

public class Player {
	private String playerName;
	private String birthday;
	private int shirtNumber;
	private Double salary;
	private String nationality;
	private FootballTeam footballTeam;
	private String teamName;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getShirtNumber() {
		return shirtNumber;
	}
	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	

	public Player(String playerName, String birthday, int shirtNumber, Double salary, String nationality,
			FootballTeam footballTeam) {
		super();
		this.playerName = playerName;
		this.birthday = birthday;
		this.shirtNumber = shirtNumber;
		this.salary = salary;
		this.nationality = nationality;
		this.footballTeam = footballTeam;
	}
	
	public Player(String playerName2, String birthday2, int shirtNumber2, double salary2, String nationality2,
			String teamName) {
		this.playerName = playerName2;
		this.birthday = birthday2;
		this.shirtNumber = shirtNumber2;
		this.salary = salary2;
		this.nationality = nationality2;	
		this.teamName = teamName;
	}
	
	
	@Override
	public String toString() {
		return " " + playerName + " " + birthday + " " + shirtNumber + " "+ salary + " " + nationality + " "+ teamName;
	}
	
}
