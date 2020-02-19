public class Yandex5 {
    public  static int books(int limit,int stock,int day) {
        int need = 1;
        int max_days = 0;
        while(limit>0){

            if ((day >= 1)&(day<=5)) stock = stock + limit;

            if (stock>=need){
                max_days += 1;
            }
            else {
                return max_days;
            }
            stock -= need;
            need++;
            day++;
            if (day==8) day=1;
        }

        return 0;
    }

}
