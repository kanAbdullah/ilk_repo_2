public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       Issue problema = new Issue(12,12);
        problema.print_the_issue();

        JumpStreet sokak = new JumpStreet(45,90);
        
    }
}
class Issue {
    int issue_height;
    int issue_width;

    Issue (int a,int b){
        this.issue_height = a;
        this.issue_width = b;
    }
    Issue(){}

    public void print_the_issue(){
        for(int i = 0; i<20 ;i++){
            for(int j = 0; j<20 ;j++){
                if(j == issue_width || i == issue_height)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            }
            System.out.println();
    }
}

class JumpStreet {
    int homeNumber;
    int resiliantNumber;

    JumpStreet(){}
    JumpStreet(int a,int b){
        this.homeNumber = a;
        this.resiliantNumber = b;
    }

    void explodeSmall(){
        homeNumber = homeNumber - 3;
        resiliantNumber = resiliantNumber -15;
    }
    void explodeMedium(){
        homeNumber = homeNumber - 6;
        resiliantNumber = resiliantNumber -30;
    }
    void explodeBig(){
        homeNumber = homeNumber - 9;
        resiliantNumber = resiliantNumber -45;
    }
    void littleBoy(){
        homeNumber = 0;
        resiliantNumber = 0;
    }
}