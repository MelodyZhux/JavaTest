import java.util.Formatter;
    public class FormatterSample {
        public static void main(String[] args) {
            Formatter data = new Formatter();
            data.format("course %s", "java ");
            System.out.println(data);
            data.format("tutorial %s", "Merit campus");
            System.out.println(data);
        }
    }
