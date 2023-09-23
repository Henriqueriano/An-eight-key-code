public class CodeCreater {
    public static void main(String[] args) {
        String [] letters = new String[36];
        letters[0] = "A";
        letters[1] = "B";
        letters[2] = "C";
        letters[3] = "D";
        letters[4] = "E";
        letters[5] = "F";
        letters[6] = "G";
        letters[7] = "H";
        letters[8] = "I";
        letters[9] = "J";
        letters[10] = "K";
        letters[11] = "L";
        letters[12] = "M";
        letters[13] = "N";
        letters[14] = "O";
        letters[15] = "P";
        letters[16] = "Q";
        letters[17] = "R";
        letters[18] = "S";
        letters[19] = "T";
        letters[20] = "U";
        letters[21] = "V";
        letters[22] = "W";
        letters[23] = "X";
        letters[24] = "Y";
        letters[25] = "Z";
        letters[26] = "0";
        letters[27] = "1";
        letters[28] = "2";
        letters[29] = "3";
        letters[30] = "4";
        letters[31] = "5";
        letters[32] = "6";
        letters[33] = "7";
        letters[34] = "8";
        letters[35] = "9";
        int choiceOne = (int) (Math.random() * 36);
        int choiceTwo = (int) (Math.random() * 36);
        int choiceTree = (int) (Math.random() * 36);
        int choiceFour = (int) (Math.random() * 36);
        int choiceFive = (int) (Math.random() * 36);
        int choiceSix = (int) (Math.random() * 36);
        int choiceSeven = (int) (Math.random() * 36);
        int choiceEight = (int) (Math.random() * 36);
        System.out.println(letters[choiceOne] + letters[choiceTwo] + letters[choiceTree] + letters[choiceFour] + letters[choiceFive] + letters[choiceSix] + letters[choiceSeven] + letters[choiceEight]);
        }
}

