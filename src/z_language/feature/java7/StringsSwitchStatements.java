package z_language.feature.java7;

/**
 * Created by cristiano on 06/05/17.
 *
 * The switch statement compares the String object in its expression
 * with the expressions associated with each case label as if it were using the
 * String.equals method.
 *
 */
public class StringsSwitchStatements {

    public static void main(String[] args) {

        StringsSwitchStatements s = new StringsSwitchStatements();

        System.out.println("StringsSwitchStatements.main " + s.getTypeOfDay("Friday"));

    }

    public String getTypeOfDay(String dayOfWeekArg) {
        String typeOfDay;
        switch (dayOfWeekArg) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
        }
        return typeOfDay;
    }

}
