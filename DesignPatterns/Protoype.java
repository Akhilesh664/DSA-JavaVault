package DesignPatterns;

public class Protoype {
    private String data;

    public Protoype(String data){
        this.data=data;
    }

    public void showData(){
        System.out.println(data);
    }

    public static void main(String[] args) {

        Protoype p1 = new Protoype("Akhilesh");
        Protoype p2 = new Protoype("Akhilesh");
        p1.showData();
        p2.showData();
        System.out.println(p1==p2);
    }
}
