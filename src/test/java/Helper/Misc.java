package Helper;

public class Misc {

        /*
         * either by object or className, we want user to use it by className, so put static
         * */
        public static void sleep(int seconds) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /*
            remove degreeSign and fetch tempValue as int
         */
        public static int removeDegreeAndGetTempAsInt(String tempText) {
            tempText = tempText.split("˚")[0];
            // tempText = tempText.substring(0, tempText.length()-1);
            return Integer.valueOf(tempText);
        }

        /*
            convert fTemp into cTemp
         */
        public static int convertFTempIntoCTemp(int fTemp) {
            /**
             * Convert deg-Fahrenheit into Deg-Celsius (F -> C)
             */
            double cTempUsingFTemp = (fTemp - 32.0) * 5/9;
            return (int) Math.round(cTempUsingFTemp);
        }
    }
