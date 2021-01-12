import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private Pattern pattern;
    private Matcher matcher;
    private static final String ACCOUNT_REGEX = "^[CAP]\\d{4}[G-M]$";

    public ClassExample(){
      pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
