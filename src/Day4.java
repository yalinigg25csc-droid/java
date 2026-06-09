public class Day4 {
    void main() {
        int[] [] marks = new int[3][3];
        int[] [] studentmarks = {
                {98, 99, 97},
                {89, 88, 87} ,
                {78, 79, 77} ,
            };
        for(int row =0; row <studentmarks.length; row++){
            for( int column = 0 ; column < studentmarks[row].length ; column++){
                System.out.print( studentmarks[row][column] +" ");
             }
        System.out.println(" ");
        }

    }
}
