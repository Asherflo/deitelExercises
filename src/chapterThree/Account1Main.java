package chapterThree;

public class Account1Main {
    public static void main(String[] args) {
        Account1 flo = new Account1("ertyyy", "567678");
        System.out.println(flo.getAccountName());

        flo.setAccountName("yemisi");
        System.out.println(flo.getAccountName());

        System.out.println(flo.getBalance()
        );
    }

}
