package leetCode;

public class LeetCode997 {
    public int findJudge(int N, int[][] trust) {
        int[] inDegree = new int[N + 1];    // 获得的票数
        int[] outDegree = new int[N + 1];   // 投出的票数
        for (int[] relation : trust) {
            inDegree[relation[1]]++;        // 获得了某人投票
            outDegree[relation[0]]++;       // 给某人投了一票
        }
        int judge = -1;
        for (int i = 1; i <= N; i++) {
            // 选出那个除了他自己没给自己投票，其他人都给他投了票的靓仔
            // 毕竟已经是靓仔了，就不要给自己投票了^_^
            if (inDegree[i] == N - 1 && outDegree[i] == 0) {
                judge = i;
                break;
            }
        }
        return judge;   // 极速出道
    }

    public static void main(String[] args) {
        int[][] trust = new int[][]{{1,2},{2,3}};
        System.out.println(new LeetCode997().findJudge(3,trust));
    }
}