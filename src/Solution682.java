import java.util.ArrayList;

public class Solution682 {
    /**
     * 你现在是一场采用特殊赛制棒球比赛的记录员。这场比赛由若干回合组成，过去几回合的得分可能会影响以后几回合的得分。
     *
     * 比赛开始时，记录是空白的。你会得到一个记录操作的字符串列表 ops，其中 ops[i] 是你需要记录的第 i 项操作，ops 遵循下述规则：
     *
     * 整数 x - 表示本回合新获得分数 x
     * "+" - 表示本回合新获得的得分是前两次得分的总和。题目数据保证记录此操作时前面总是存在两个有效的分数。
     * "D" - 表示本回合新获得的得分是前一次得分的两倍。题目数据保证记录此操作时前面总是存在一个有效的分数。
     * "C" - 表示前一次得分无效，将其从记录中移除。题目数据保证记录此操作时前面总是存在一个有效的分数。
     * 请你返回记录中所有得分的总和。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/baseball-game
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int calPoints(String[] ops) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String str:ops){
            switch (str){
                case "+":
                    int b = list.get(list.size()-1);
                    int c = list.get(list.size()-2);
                    list.add(b+c);
                    break;
                case "C":
                    list.remove(list.size()-1);
                    break;
                case "D":
                    int a = list.get(list.size()-1);
                    list.add(a*2);
                    break;
                default:
                    list.add(Integer.parseInt(str));
            }
        }
        int sum = 0;
        for (Integer mark:list){
            sum+=mark;
        }
        return sum;
    }
}
