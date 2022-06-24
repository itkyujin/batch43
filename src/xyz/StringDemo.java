package xyz;

public class StringDemo {
    public static void main(String[] args) {

/*
        String s = "kyujin";
        s= s.concat(" kim");
        System.out.println(s);
*/

        StringBuilder sb = new StringBuilder();
        sb.append("kyujin");
        sb.append(" kim");
        System.out.println(sb);

        System.out.println(Utility.XYZ);


    }
}
