import java.util.Scanner;

public class PemilihanHari04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayName, dayType;
        int dayInt;

        // System.out.print("Input day name : ");
        // dayName = sc.nextLine();

        System.out.print("Input hari ke : ");
        dayInt = sc.nextInt();

        // switch (dayName.toLowerCase()) {
        //     case "monday":
        //     case "tuesday":
        //     case "wednesday":
        //     case "thursday":
        //     case "friday":
        //         dayType = "weekday";
        //         break;
        //     case "saturday":
        //     case "sunday":
        //         dayType = "weekend";
        //         break;
        //     default:
        //         dayType = "Invalid day name";
        //         break;
        // }

        switch (dayInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekday";
                break;
            case 6:
            case 7:
                dayType = "weekend";
                break;
            default:
                dayType = "Invalid number of day";
                break;
        }

        // System.out.println(dayName + " is a " + dayType);
        System.out.println(dayInt + " is a " + dayType);

    }
}
