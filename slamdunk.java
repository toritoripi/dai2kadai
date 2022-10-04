import java.util.ArrayList;

public class slamdunk {
    public static void main(String[] args) {

        ArrayList<humans> humanList = new ArrayList<humans>();

        humanList.add(new humans("桜木花道", "湘北高校"));
        humanList.add(new humans("赤木剛典", "湘北高校"));
        humanList.add(new humans("仙道彰", "陵南高校"));
        humanList.add(new humans("流川楓", "湘北高校"));
        humanList.add(new humans("宮城リョータ", "湘北高校"));
        humanList.add(new humans("三井寿", "湘北高校"));
        humanList.add(new humans("魚住純", "陵南高校"));
        humanList.add(new humans("神宗一郎", "海南高校"));
        humanList.add(new humans("牧紳一", "海南高校"));


        //選手一覧を表示する
        System.out.println("<選手一覧>");
        for (humans humans : humanList) {
            System.out.println(humans.getName());
            System.out.println("所属:" + humans.getTeam());
        }

        //湘北メンバーのみ表示する
        System.out.println("<湘北メンバー>");

        for (humans humans : humanList) {
            boolean b = ("湘北高校") == humans.getTeam();
            if (("湘北高校") == humans.getTeam()) {
                System.out.println(("選手名:" + humans.getName()));
            }


        }
    }
}

