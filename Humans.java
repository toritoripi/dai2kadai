public class Humans {

    //選手の名前
    private final String name;

    //選手の所属チーム
    private final String team;

    //コンストラクター
    public Humans(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getName(){
        return name;
    }

    public String getTeam(){
        return team;
    }

}