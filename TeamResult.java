//rodi0231_sisc7379_arho2993

public class TeamResult {

    private TeamMedals teamMedals;
    private String team;

    public TeamResult(TeamMedals teamMedals, String team) {
        this.teamMedals = teamMedals;
        this.team = team;
    }
    public TeamMedals getTeamMedals(){
        return teamMedals;
    }

    public String getTeam(){
        return team;
    }
}