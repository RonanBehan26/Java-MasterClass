public class Main { //should be SpeedConverter, this is just a practice class

    //Speed Converter Challenge

    toMilesPerHour(32.5);

        public static void toMilesPerHour(double kiloMetersPerHour){

            if(kiloMetersPerHour < 0){
                return - 1;
            }else {
               Ans = Math.round(kiloMetersPerHour * 0.621371);
               System.out.println(Ans);
               return Ans;
            }
    }
}
