package chucknorris;

import java.util.Scanner;

class Game {

    private static final Scanner SCANNER = new Scanner(System.in);

    void playGame() {
        String operation = "";
        while (!operation.equals("exit")) {
            System.out.println("Please input operation (encode/decode/exit):");
            operation = SCANNER.nextLine();
            switch (operation) {
                case "encode" -> {
                    System.out.println("Input string:");
                    String input = SCANNER.nextLine();
                    Code code = new Code(input);
                    code.setBinaryCodeToEncode();
                    code.setEncodedString();
                    code.getEncodedString();
                }
                case "decode" -> {
                    System.out.println("Input encoded string:");
                    String input = SCANNER.nextLine();
                    InputValidator inputValidator = new InputValidator(input);
                    if (inputValidator.isValidInput()) {
                        Code code = new Code(input);
                        code.setBinaryCodeToDecode();
                        code.setDecodedString();
                        code.getDecodedString();
                    } else {
                        System.out.println("Encoded string is not valid.\n");
                    }
                }
                default -> {
                    if (!operation.equals("exit")) {
                        System.out.printf("There is no '%s' operation\n\n", operation);
                    }
                }
            }
        }
        System.out.print("Bye!");
    }
}