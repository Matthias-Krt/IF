public String vigenereEncrypt(String klarTxt, String codeWord) {

    String chiffre = "";
    char klarCh, codeWordCh;
    int charNum, codeIndex = 0;
    int key;

    for(int i = 0; i < klarTxt.length(); i++){
        klarCh = klarTxt.toUpperCase().charAt(i);
        codeWordCh = codeWord.toUpperCase().charAt(codeIndex);

        key = (int) codeWordCh - 65;

        charNum = (int) klarCh - 65;
        charNum += key;
        charNum %= 26;

        chiffre += (char) charNum;

        if(codeIndex < codeWord.length() - 1) {codeIndex++;} else {codeIndex = 0;}
    }

    return chiffre;

}
