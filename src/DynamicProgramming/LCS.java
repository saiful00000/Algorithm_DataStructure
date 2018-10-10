package DynamicProgramming;
import java.util.HashMap;
import java.util.Map;

public class LCS {

    static int lengthOfLCS(String x, String y, int m, int n, Map<String, Integer> map) {

        String key = m +"|"+ n;

        if (m == 0 || n == 0)
            return 0;

        if (!map.containsKey(key)) {
            if (x.charAt(m - 1) == y.charAt(n - 1)) {
                map.put(key, lengthOfLCS(x, y, m - 1, n - 1, map) + 1);
            } else {
                map.put(key, Integer.max(lengthOfLCS(x,y,m,n-1,map),lengthOfLCS(x,y,m-1,n,map)));
            }
        }
        return map.get(key);
    }

    public static void main(String[] args) {
        String x = "saiful";
        String y = "saiful";
        Map <String, Integer> map = new HashMap<String, Integer>();

        int result = lengthOfLCS(x, y, x. length(), y.length(), map);
        System.out.println(result);
    }
}
