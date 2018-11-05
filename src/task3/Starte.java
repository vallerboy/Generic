package task3;

public class Starte {
    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2 , 7, -3};
        String[] strings = {"asdasd", "asd"};

        GenericArray<String> genericArray = new GenericArray<>(strings);
        //genericArray.setArray(strings);

        MinMax<String> minMax = genericArray.getMinMax();
        System.out.println(minMax.getLast());
    }
}
