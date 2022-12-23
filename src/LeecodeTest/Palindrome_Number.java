package LeecodeTest;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Palindrome_Number {
    public static void main(String[] args) {
        Palindrome_Number p = new Palindrome_Number();
   //     System.out.println(p.isPalindrome(10101));
        int[][] n = new int[][]{{1,1,0,0,0,0},{1,1,1,1,0,0},{1,0,0,0,0,0},{1,1,0,0,0,0},{1,1,1,1,1,0}};
        int k = 3;
        int[] ints = p.kWeakestRows(n, k);
 //       Arrays.stream(ints).boxed().forEach(i->System.out.print(i));
        int[][] a = new int[][] {{1,2,3},{3,2,1}};
  //      System.out.println(p.maximumWealth(a));
        String[] s = new String[]{"--x","x++","x++"};
  //      System.out.println(p.finalValueAfterOperations(s));

        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too"};
  //      System.out.println(p.mostWordsFound(sentences));
   //     String str = "G()(al)";
   //     String ss = str.replaceAll("al", "O");
   //     System.out.println(ss);
   //     System.out.println(p.interpret(str));

        String s1 = "codeleet";
        int[] in = new int[]{4,5,6,7,0,2,1,3};
        System.out.println(p.restoreString(s1,in));


    }
    public boolean isPalindrome(int x) {

        if(x<0) return false;
        int temp = x;
        int reverse=0;

        while(temp>0) {
            reverse = reverse*10 + temp%10;
            System.out.println("reverse = " + reverse );
            temp = temp/10;
            System.out.println("temp = " + temp );
        }
        return (reverse==x);


    }

    public int[] kWeakestRows(int[][] max, int K) {
        int y = max.length, x = max[0].length, kix = 0;
        int[] vis = new int[y], ans = new int[K];
        for (int j = 0; j <= x; j++)
            for (int i = 0; i < y; i++) {
                if (vis[i] == 0 && (j == x || max[i][j] == 0)) {
                    ans[kix++] = i;
                    vis[i]++;
                }
                if (kix == K) return ans;
            }
        return ans;
    }


    public int maximumWealth(int[][] accounts) {

        int res = 0;
        for (int[] account : accounts) {
            int t = 0;
            for (int money : account) {
                System.out.println(t);
                t += money;
            }
            res = Math.max(res, t);
        }
        return res;
    }

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(String s: operations) {
            if(s.toLowerCase()=="x++" || s == "++x")
                result++;
            else result--;
        }
        return result;

    }


    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int s = 0; s< sentences.length; s ++) {
            int m = 0;
            String temp = sentences[s];
            for(int i=0; i< temp.length(); i++) {
                if( temp.charAt(i)  == ' ')
                    m++;
            }
            m++;
            System.out.println("m = "+ m);
            max = Math.max(max,m);
        }
        return max;

    }

    public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
        for(int i = 0; i< stones.length(); i++) {
            for(int j = 0; j< jewels.length(); j++) {
                if(stones.charAt(i) == jewels.charAt(j))
                    num++;
            }
        }
        return num;

    }

    public String interpret(String command) {
        StringBuilder temp = new StringBuilder();
        int i = 0;
        while(i < command.length()) {
            if(command.charAt(i) == 'G') {
                temp = temp.append("G");
                i++;
            }
            else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                temp = temp.append("o");
                i = i+2;
            }
            else {
                temp = temp.append("al");
                i = i+4;
            }
        }
        return temp.toString();


    }



        public int calculateTime(String keyboard, String word) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i< keyboard.length(); i++) {
                map.put(keyboard.charAt(i),i);
            }
            int sum = 0;
            int prev = 0;
            for(char c: word.toCharArray()) {
                if(prev != 1) {
                    sum += Math.abs(map.get(c)-prev);
                }
                prev = map.get(c);

            }
            return sum;
        }

        public String restoreString(String s, int[] indices) {
            StringBuilder str = new StringBuilder();
            Map<Integer,Character> map = new HashMap<>();
            for(int i: indices) {
                map.put(indices[i],s.charAt(i));
            }
            for(int i = 0; i<s.length(); i++)
                str.append(map.get(i));

        return str.toString();


    }
}



