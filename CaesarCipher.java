package com.company;

import java.util.Locale;

public class CaesarCipher {
     public static String decrypt(String inputStr,int key){
         inputStr = inputStr.toLowerCase();

         String alpha = "abcdefghijklmnopqrstuvwxyz";
         String decryptStr = "";

         for (int i = 0; i < inputStr.length(); i++)
         {
             int pos = alpha.indexOf(inputStr.charAt(i));
             int decryptPos = (pos - key) % 26;
             if (decryptPos < 0){
                 decryptPos = alpha.length() + decryptPos;
             }
             char decryptChar = alpha.charAt(decryptPos);
             decryptStr += decryptChar;
         }
         return decryptStr;
     }
    public static void main(String[] args) {
        String original = "LDPWKHORUGBRXUJRG\n" +
                "XNTRGZKKGZUDMNNSGDQFNCRADENQDLD\n" +
                "DTZXMFQQSTYRFPJDTZWXJQKFSDLWFAJSNRFLJ\n" +
                "SIOMBUFFHINNUEYNBYHUGYIZNBYFILXSIOLAIXCHPUCH\n" +
                "ERZRZOREGURFNOONGUQNLGBXRRCVGUBYL\n" +
                "CJIJPMTJPMAVOCZMVIYTJPMHJOCZM\n" +
                "DTZXMFQQSTYRZWIJW\n" +
                "ZPVTIBMMOPUDPNNJUBEVMUFSZ\n" +
                "FVBZOHSSUVAZALHS\n" +
                "KAGETMXXZAFSUHQRMXEQFQEFUYAZKMSMUZEFKAGDZQUSTNAGD\n" +
                "MCIGVOZZBCHRSGWFSOBMHVWBUHVOHPSZCBUGHCMCIFBSWUVPCIF";
        for(int i = 1;i<=25;i++){
            System.out.println(i+". "+"Decrypted Text:= "+decrypt(original.toLowerCase(),i).toUpperCase());
        }

    }
}
//   Decrypted Text:= IAMTHELORDYOURGODW k = 3
//   Decrypted Text:= YOUSHALLHAVENOOTHERGODSBEFOREMEA k = 25
//   Decrypted Text:= YOUSHALLNOTMAKEYOURSELFANYGRAVENIMAGE k = 5
//   Decrypted Text:=YOUSHALLNOTTAKETHENAMEOFTHELORDYOURGODINVAIN k = 20
//   Decrypted Text:=REMEMBERTHESABBATHDAYTOKEEPITHOLYM k = 13
//   Decrypted Text:=HONOURYOURFATHERANDYOURMOTHERE k = 21
//   Decrypted Text:=YOUSHALLNOTMURDERU k = 5
//   Decrypted Text:=YOUSHALLNOTCOMMITADULTERYY k = 1
//   Decrypted Text:=YOUSHALLNOTSTEALS k = 7
//   Decrypted Text:=YOUSHALLNOTGIVEFALSETESTIMONYAGAINSTYOURNEIGHBOURN k = 12
//   Decrypted Text:=YOUSHALLNOTDESIREANYTHINGTHATBELONGSTOYOURNEIGHBOUR k = 14
