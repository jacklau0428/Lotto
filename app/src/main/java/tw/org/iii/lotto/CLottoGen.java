package tw.org.iii.lotto;


import java.util.Arrays;


public class CLottoGen {



    public String[] GetLottos(int gameNum){

        String[] strLottos = new String[10];
        int intCount=0;
        while(intCount<10){
            String str = "";
            switch (gameNum){

                case 539:
                str = Get539();
                break;

                case 496:
                str = Get496();
                break;

                case 638:
                str = Get638();
                break;
            }

            if(IsLottoNotSelected(str,strLottos)){
                strLottos[intCount]=str;
                intCount++;
            }
        }
        return strLottos;
    }

    private boolean IsLottoNotSelected(String str, String[] strLottos) {
        for(String s:strLottos){
            if(str.equals(s))
                return false;
        }
        return true;
    }


    public String Get496(){

        int[] tmpRndNum = new int[7];
        int[] lotteryNum = new int[6];


        for (int i = 0; i < 7; i++)
        {
            int j = 0;
            int tempNum = 0;

            tempNum = (int)(Math.random() * 49.0D) + 1;
            while (j < i) {
                if (tmpRndNum[j] == tempNum)
                {
                    tempNum = (int)(Math.random() * 49.0D) + 1;
                    j = 0;
                }
                else
                {
                    j++;
                }
            }
            tmpRndNum[i] = tempNum;
        }

        for (int k = 0; k < 6; k++) {

            lotteryNum[k] = tmpRndNum[k];

        }

        Arrays.sort(lotteryNum);

        String numStr = "";

        for (int i =0;i < 6;i++)
        {
            numStr += String.valueOf(lotteryNum[i]) + " ";
        }

        return numStr;
    }

    public String Get539() {

        int[] tmpRndNum = new int[6];
        int[] lotteryNum = new int[5];


        for (int i = 0; i < 6; i++)
        {
            int j = 0;
            int tempNum = 0;

            tempNum = (int)(Math.random() * 39.0D) + 1;
            while (j < i) {
                if (tmpRndNum[j] == tempNum)
                {
                    tempNum = (int)(Math.random() * 39.0D) + 1;
                    j = 0;
                }
                else
                {
                    j++;
                }
            }
            tmpRndNum[i] = tempNum;
        }

        for (int k = 0; k < 5; k++) {

            lotteryNum[k] = tmpRndNum[k];

        }

        Arrays.sort(lotteryNum);

        String numStr = "";

        for (int i =0;i < 5;i++)
        {
            numStr += String.valueOf(lotteryNum[i]) + " ";
        }

        return numStr;
    }

    public String Get638() {

        int[] tmpRndNum = new int[7];
        int[] lotteryNum = new int[6];


        for (int i = 0; i < 6; i++)
        {
            int j = 0;
            int tempNum = 0;

            tempNum = (int)(Math.random() * 38.0D) + 1;
            while (j < i) {
                if (tmpRndNum[j] == tempNum)
                {
                    tempNum = (int)(Math.random() * 38.0D) + 1;
                    j = 0;
                }
                else
                {
                    j++;
                }
            }
            tmpRndNum[i] = tempNum;
        }

        for (int k = 0; k < 6; k++) {

            lotteryNum[k] = tmpRndNum[k];

        }

        Arrays.sort(lotteryNum);

        String numStr = "";

        for (int i =0;i < 6;i++)
        {
            numStr += String.valueOf(lotteryNum[i]) + " ";
        }

        return numStr;
    }


}
