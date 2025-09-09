import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static double fixTemp(String temp) {

        String[] tempSplit = temp.split(","); // Integer and decimal.
        double correctTemp ;
        correctTemp = Double.parseDouble(tempSplit[0] + "." + tempSplit[1]); // Create a new (correct) double from the split parts.

        return correctTemp;
    }

    public static void main(String[] args) {

        URL theURL;

        try {
            theURL = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        try {
            InputStream iStream = theURL.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(iStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String line;

            boolean header = true;
            double tempSum = 0;
            int collected = 0;

            while ((line = reader.readLine()) != null) {
                    if (header) { // This line has column names. We do not need them for this.
                        header = false;
                    } else {
                        String[] columns = line.split(";"); // Split the line into different columns.
                        String dateAndTime = columns[0]; // We want the first column that has timestamps.

                        String[] dateTimeSplit = dateAndTime.split(" "); // From the timestamps we want the date, so we can collect the temperatures from that day.
                        String date = dateTimeSplit[0]; // This is the date.

                        if (date.equals("01.01.2023")) {

                            String temp = columns[1]; // From the columns we also need the outside temperature, which is the second column.
                            double fixedTemp = fixTemp(temp); // Fix the temperature to a working double

                            // double fixedTemp = Double.parseDouble(temp.replace(",",".")); // Näinkin voi näköjään tehdä

                            // System.out.println("Date: " + dateTimeSplit[0] + ", Temperature: " + fixedTemp);
                            tempSum += fixedTemp;
                            collected++;
                        }
                    }
                }

            reader.close();
            System.out.printf("\nThe average temperature of January 1st of 2023 was %.1f°C", tempSum/collected);

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
