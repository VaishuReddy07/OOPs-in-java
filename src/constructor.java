class Constructor {
    String branchName;
    int cupsSold;
    int pricePerCup;

    public Constructor(String bn, int cs, int ppc){
        branchName =bn;
        cupsSold = cs;
        pricePerCup = ppc;
    }

    public void classFun(){
        System.out.println("class lopala");

    }
    public static void main(String[] args) {

        Constructor c1 = new Constructor("Vaishnavi", 10 , 50);

        System.out.println(c1.branchName);
        System.out.println(c1.cupsSold);
        System.out.println(c1.pricePerCup);

        c1.classFun();
    }
}
