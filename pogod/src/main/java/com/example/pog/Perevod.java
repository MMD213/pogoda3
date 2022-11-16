package com.example.pog;

public class Perevod {


    public static String translate (String text){
        char[] abcCyr = {'а','б','в','г','д','е','ё','ж','з','и','к','л','м','н','о','п','р','с','т','у','й','ф','х','ц','ш','щ','ы','э','ю','я','А','Б','В','Г','Д','Е','Ё','Ж','З','И','К','Л','М','Н','О','П','Р','С','Т','У','Й','Ф','Х','Ц','Ш','Щ','Ы','Э','Ю','Я',' ','-'};
        String[] abcLat = {"a","b","v","g","d","e","jo","zh","z","i","k","l","m","n","o","p","r","s","t","u","y","f","kh","ts","sh","sch","y","e","ju","ja","A","B","V","G","D","E","Jo","Zh","Z","I","K","L","M","N","O","P","R","S","T","U","Y","F","Kh","Ts","Sh","Sch","Y","E","Ju","Ja","_","_"};
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            for(int x = 0; x < abcCyr.length; x++ )
                if (text.charAt(i) == abcCyr[x]) {
                    builder.append(abcLat[x]);
                }
        }

        return builder.toString();
    }
}
