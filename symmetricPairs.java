import java.util.*;

public class symmetricPairs {

    // Empty solution function — you’ll implement this
    static List<int[]> findSymmetricPairs(int[][] arr) {
        ArrayList<int[]> al=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int []a=arr[i];
            int one=a[0];
            int two=a[1];

            // System.out.println(one + " "+ two);
            // System.out.println("----");
            for(int j=i+1;j<arr.length;j++){
                int b[]=arr[j];
                System.out.println(b[0]+" "+b[1]);
                if(one==b[1] && two==b[0]) al.add(new int[]{one,two});
            }
            // System.out.println()
        }
        return al;
    }

    public static void main(String[] args) {
        // List of test cases
        List<int[][]> testCases = new ArrayList<>();

        // 1️⃣ Basic case with one symmetric pair
        testCases.add(new int[][]{{10, 20}, {30, 40}, {20, 10}, {50, 60}});

        // 2️⃣ Case with multiple symmetric pairs
        testCases.add(new int[][]{{5, 8}, {7, 9}, {8, 5}, {9, 7}, {6, 10}});

        // 3️⃣ No symmetric pairs
        testCases.add(new int[][]{{1, 2}, {3, 4}, {5, 6}});

        // 4️⃣ Same pair repeated multiple times
        testCases.add(new int[][]{{1, 2}, {2, 1}, {1, 2}, {2, 1}});

        // 5️⃣ Self-symmetric pairs (where x == y)
        testCases.add(new int[][]{{1, 1}, {2, 2}, {3, 3}});

        // 6️⃣ Empty input
        testCases.add(new int[][]{});

        // 7️⃣ Single pair only
        testCases.add(new int[][]{{4, 5}});

        // 8️⃣ Large numbers & negatives
        testCases.add(new int[][]{{-1, -2}, {-2, -1}, {1000000, 999999}, {999999, 1000000}});

        // Running each test case
        int caseNum = 1;
        for (int[][] testCase : testCases) {
            System.out.println("Test Case #" + caseNum++);
            List<int[]> result = findSymmetricPairs(testCase);

            if (result.isEmpty()) {
                System.out.println("No symmetric pairs found.");
            } else {
                for (int[] pair : result) {
                    System.out.println(Arrays.toString(pair));
                }
            }
            System.out.println("----------------------");
        }
    }
}
