public class Main {
    public static void main(String[] args) {

        System.out.println(FacebookLikeSystem.whoLikesIt("Peter"));
        System.out.println(FacebookLikeSystem.whoLikesIt("Jacob", "Alex" ));
        System.out.println(FacebookLikeSystem.whoLikesIt("Max", "John", "Mark"));
        System.out.println(FacebookLikeSystem.whoLikesIt("Alex", "Jacob", "Mark", "Max", "Elie"));
    }
}
