package Builder9;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder commonRoleBuilder = new CommonRoleBuilder();

        director.construct(commonRoleBuilder);
        Role commonRole = commonRoleBuilder.getResult();
        System.out.println(commonRole);

    }
}
