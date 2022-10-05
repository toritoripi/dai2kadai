import java.util.ArrayList;

public class Slamdunk {
    public static void main(String[] args) {

        ArrayList<Humans> humanList = new ArrayList<>();

        humanList.add(new Humans("桜木花道", "湘北高校"));
        humanList.add(new Humans("赤木剛典", "湘北高校"));
        humanList.add(new Humans("仙道彰", "陵南高校"));
        humanList.add(new Humans("流川楓", "湘北高校"));
        humanList.add(new Humans("宮城リョータ", "湘北高校"));
        humanList.add(new Humans("三井寿", "湘北高校"));
        humanList.add(new Humans("魚住純", "陵南高校"));
        humanList.add(new Humans("神宗一郎", "海南高校"));
        humanList.add(new Humans("牧紳一", "海南高校"));


        //選手一覧を表示する
        System.out.println("<選手一覧>");
        for (Humans humans : humanList) {
            System.out.println(humans.getName());
            System.out.println("所属:" + humans.getTeam());
        }

        //湘北メンバーのみ表示する
        System.out.println("<湘北メンバー>");

        for (Humans humans : humanList) {
            if ("湘北高校".equals(humans.getTeam())) {
                System.out.println(("選手名:" + humans.getName()));
            }
        }
    }
}
