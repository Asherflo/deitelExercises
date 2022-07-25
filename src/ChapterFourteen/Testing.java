package ChapterFourteen;

public class Testing {
    public static void main(String[] args) {
        String color = "blue";
        color ="green";
        System.out.println(color);


        char[ ] charArray = {'b','i','r','t','h',' ','d','a','y'};
        String s = new String("Hello");
        String s1 = new String();
        String s2 = s;
        String s3 = new String(charArray);
        String s4 = new String(charArray,6,3);
        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n",s1,s2,s3,s4);

    }
}
