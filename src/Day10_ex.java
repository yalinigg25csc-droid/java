public class Day10_ex {
    static void main(){
        String name="dyro";
        try {
            System.out.println(name.charAt(2));
            System.out.println(4/0);

        }
        catch(NullPointerException e){
                System.out.println("there is an nullpointer exception");
        }
        catch (Exception e){
            System.out.println("there is an exception");
        }
        finally {
            System.out.println("remaining code will be executed");
        }

    }
}
