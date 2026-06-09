public class array {
    void main() {
        int[] marks= { 87,32,44,89,23 };
        System.out.print("pass mark : ");
        for(int mark: marks){
            if(mark>=40){
                System.out.print(mark +" ");

            }

        }
        System.out.print( "\nfail marks : ");
        for(int mark: marks){
            if(mark<40){
                System.out.print(mark +" ");
            }
        }

    }
}
