public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.formDate.day = 13;
        post.formDate.month = 06;
        post.formDate.year = 1999;

        System.out.println(post.name);
    }
}




