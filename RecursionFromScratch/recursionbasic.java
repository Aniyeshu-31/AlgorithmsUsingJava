package RecursionFromScratch;

public class recursionbasic {
    static void print(){
        System.out.println(1);
        print();
    }
    public static void main(String[] args) {
        print();
    }
}
