package chucknorris;

import java.util.Objects;

class Code {

    private final String INPUT;
    private String binaryCode;
    private String encodedString;
    private String decodedString;

    Code(String INPUT) {
        this.INPUT = INPUT;
    }

    void setBinaryCodeToEncode() {
        StringBuilder binaryCode = new StringBuilder();
        char[] arrayOfChars = INPUT.toCharArray();
        for (char i : arrayOfChars) {
            binaryCode.append(String.format("%7s", Integer.toBinaryString(i)).replace(" ", "0"));
        }
        this.binaryCode = binaryCode.toString();
    }

    void setEncodedString() {
        StringBuilder encodedString = new StringBuilder();
        int index = 0;
        while (index < binaryCode.length()) {
            int counter = 0;
            String isZero = binaryCode.charAt(index) == '0' ? "00" : "0";
            encodedString.append(isZero).append(" ");
            for (int i = index; i < binaryCode.length(); i++) {
                if (binaryCode.charAt(index) != binaryCode.charAt(i)) {
                    break;
                }
                ++counter;
            }
            encodedString.append("0".repeat(counter)).append(" ");
            index += counter;
        }
        this.encodedString = String.valueOf(encodedString.deleteCharAt(encodedString.length() - 1));
    }

    void setBinaryCodeToDecode() {
        StringBuilder binaryCode = new StringBuilder();
        String[] chuckNorrisUnaryCode = INPUT.split(" ");
        for (int i = 1; i < chuckNorrisUnaryCode.length; i = i + 2) {
            String digit = Objects.equals(chuckNorrisUnaryCode[i - 1], "00") ? "0" : "1";
            binaryCode.append(digit.repeat(chuckNorrisUnaryCode[i].length()));
        }
        this.binaryCode = binaryCode.toString();
    }

    void setDecodedString() {
        StringBuilder decodedString = new StringBuilder();
        for (int i = 0; i < binaryCode.length(); i = i + 7) {
            String sevenChars = binaryCode.substring(i, i + 7);
            int tempValue = 0;
            for (int j = 0; j < sevenChars.length(); j++) {
                tempValue += Integer.parseInt(String.valueOf(sevenChars.charAt(j))) * (int) (Math.pow(2, 6 - j));
            }
            decodedString.append((char) tempValue);
        }
        this.decodedString = decodedString.toString();
    }

    void getEncodedString() {
        System.out.println("Encoded string:\n" + encodedString + "\n");
    }

    void getDecodedString() {
        System.out.println("Decoded string:\n" + decodedString + "\n");
    }
}