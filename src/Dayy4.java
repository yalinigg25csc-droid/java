/*public class Dayy4 {
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
*/
public class Dayy4 {
    void main() {
       //declaring array
        int[] [] attendace = new int[3][5];
       //declaring array elements
        int[] [] studentattendance = {
                {0, 1, 0},
                {1, 0, 0} ,
                {1, 1, 1} ,
                {1, 0, 1} ,
                {0, 0, 0} ,
        };
       //for loop for iterating every student
        for(int row =0; row <studentattendance.length; row++){
            System.out.println("Student "+(1+row)+":");
              for( int column = 0 ; column < studentattendance[row].length ; column++){
                if (studentattendance[row][column]==1){
                    System.out.println("Class"+(1+column)+": Present" );
                }
                else {
                    System.out.println("Class"+(1+column)+": Absent");
                }
            }
            System.out.println(" ");
        }

    }
}
