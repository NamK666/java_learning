public class formatRe {
    public static void main(String[] args){
        String name1 = "Tim";
        int age1 = 30;
        String name2 = "Anna";
        int age2 = 40;

        String format1 = String.format("%s의 나이는 %s세 입니다.",name1, age1);
        String format2 = String.format("%s의 나이는 %s세 입니다.",name2, age2);

        System.out.println(format1);
    }
}
