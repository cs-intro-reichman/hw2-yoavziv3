public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        String [] newTime = time.split(":");
        int hours = Integer.parseInt(newTime[0]);    
        int mins = Integer.parseInt(newTime[1]);
        int extraTime = Integer.parseInt(args[1]);
        int totalHours = 0;
        String newMin="";
        String newHour="";

        totalHours = extraTime / 60;
        extraTime = extraTime - (totalHours * 60);

        hours = hours + totalHours;
        mins = mins + extraTime;

      if(mins > 59)
        {
            hours++;
            mins = mins - 60;
        }
        
        while(hours >= 24)
        {
            hours = hours -24;
        }
        

        if(hours < 10 && mins < 10)
        {
            newMin="0"+Integer.toString(mins);
            newHour="0"+Integer.toString(hours);
            System.out.println(newHour + ":" + newMin);
        }
        if(hours > 9 && mins < 10)
        {
            newMin="0"+Integer.toString(mins);
            System.out.println(hours + ":" + newMin);
        }
        if(hours < 10 && mins > 9)
        {
            newHour="0"+Integer.toString(hours);
            System.out.println(newHour + ":" + mins);
        }
        if(hours > 9 && mins > 9)
        {
            newMin="0"+Integer.toString(mins);
            newHour="0"+Integer.toString(hours);
            System.out.println(hours + ":" + mins);
        }
    }
}
