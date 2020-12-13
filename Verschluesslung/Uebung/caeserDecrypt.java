public String decrypt(String klarTxt, int key) {
    String chiffre = "";
    char klarCh;
    int charNum;

    for(int i = 0; i < klarTxt.length(); i++){
        klarCh = klarTxt.toUpperCase().charAt(i);

        charNum = (int) klarCh - 65;
        charNum += key;
        charNum %= 26;

        chiffre += (char)(charNum + 65);
    }

    return chiffre;
}
