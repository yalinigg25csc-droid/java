public class Enum {
    enum LANGUAGE{
        EN("English"),
     GR("German"),
     JP("Japanese"),
     TA("Tamil");
String description ;
LANGUAGE (String description){
    this.description = description;
}
    }


    static void main() {
        System.out.println(LANGUAGE.TA.description);
        System.out.println(LANGUAGE.GR.description);
        System.out.println(LANGUAGE.EN.description);
        System.out.println(LANGUAGE.JP.description);
    }
}
