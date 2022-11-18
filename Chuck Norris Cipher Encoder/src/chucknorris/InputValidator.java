package chucknorris;

class InputValidator {

    private final String INPUT;
    private final String[] BLOCKS;

    InputValidator(String INPUT) {
        this.INPUT = INPUT;
        this.BLOCKS = INPUT.split(" ");
    }

    private boolean isZerosOnly() {
        for (int i = 1; i < INPUT.length(); i++) {
            if (INPUT.charAt(i) != INPUT.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    private boolean isFirstBlocksProper() {
        for (int i = 0; i < BLOCKS.length; i = i + 2) {
            if (BLOCKS[i].length() > 2) {
                return false;
            }
        }
        return true;
    }

    private boolean isProperLength() {
        return BLOCKS.length % 2 == 0;
    }

    private boolean isProperLengthOfAllSecondBlocks() {
        int counter = 0;
        for (int i = 1; i < BLOCKS.length; i = i + 2) {
            for (int j = 0; j < BLOCKS[i].length(); j++) {
                ++counter;
            }
        }
        return counter % 7 == 0;
    }

    boolean isValidInput() {
        return isZerosOnly() && isFirstBlocksProper() && isProperLength() && isProperLengthOfAllSecondBlocks();
    }
}