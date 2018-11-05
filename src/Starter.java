public class Starter {
    public static void main(String[] args) {
        UniqueData<String, Integer> uniqueData =
                new UniqueData<>("HEJKA");

        System.out.println(uniqueData.getData());
    }
}
