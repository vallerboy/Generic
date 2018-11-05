package task1;

public class PreviewGenericMethod {
    public static void main(String[] args) {
        printAll("Siemka");
        printAll(6);
        printAll(6.0D);

        System.out.println(sumAll("asdasd", "asdasd"));
    }


    public static <T> void printAll(T someData){
        System.out.println(someData);
    }

    public static <T extends String> String sumAll(T ... data){
        String s = "";
        for (T datum : data) {
            s += datum;
        }
        return s;
    }
}
