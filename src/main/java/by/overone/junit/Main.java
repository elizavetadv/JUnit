package by.overone.junit;

public class Main {

    int getNumberWords(String str){
        int count = 0;

        for(char s : str.toCharArray()){
            if(s == ' '){
                count++;
            }
        }

        return count + 1;
    }

    String changeString(String str){
        return str.trim().replaceAll("a", "%");
    }

    boolean isStringEmpty(String str){
        return str.isEmpty();
    }
}
