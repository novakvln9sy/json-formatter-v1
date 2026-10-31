public final class App {
    private App() {
    }

    public static String slugify(String in) {
        if (in == null) {
            return "";
        }
        return in.trim().toLowerCase().replaceAll("[^a-z0-9]+", "-");
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("usage: app <value> [value...]");
            System.exit(2);
        }
        for (String a : args) {
            System.out.println(a + " -> " + slugify(a));
        }
    }
}
