package com.Accenture;
import java.lang.String;

public class PasswordChecker {
    public static int Validation(String str) {
        if (str==null||str.length() < 4) {
            return 0;
        }
        boolean hasDigit=false;
        boolean hasUpperCase=false;
        boolean firstCharacter = !(Character.isDigit(str.charAt(0)));
        for (int i=0;i<str.length();i++) {

            char ch = str.charAt(i);

            if ((ch == ' ') || (ch=='/')){
                return 0;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
        }
        if (hasDigit && hasUpperCase && firstCharacter){
            return 1;
        }
        else{
            return 0;
        }
    }
}
