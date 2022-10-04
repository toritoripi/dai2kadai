public class humans {

    //選手の名前
    private String name;

    //選手の所属チーム
    private String team;

    //コンストラクター
    public humans(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getName(){
        return name;
    }

    public String getTeam(){
        return team;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTeam(String team){
        this.team = team;
    }
}