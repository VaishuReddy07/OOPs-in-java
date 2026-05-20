class ChaiShop{
    String branchName;
    int cupsSold;

    public void classFun(){
        System.out.println("class lopala fun");
    }

}

class Main {
    public static void fun() {
        System.out.println("I am in function");
    }

    public static void main(String[] args) {
       fun();

        ChaiShop branch1 = new ChaiShop();
        branch1.branchName = "Bahubali Adda";
        System.out.println(branch1.branchName);
        branch1.cupsSold = 5;
        System.out.println(branch1.cupsSold);

        ChaiShop branch2 = new ChaiShop();
        branch2.branchName = "jalsa Kottu";
        System.out.println(branch2.branchName);
        branch2.cupsSold =10;
        System.out.println(branch2.cupsSold);


    }
}