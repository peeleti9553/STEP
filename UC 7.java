import java.util.*;

public class OOPSBannerApp {

    // CharacterPattern class to store character and its pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Static Inner Class to manage character-pattern mapping
    static class CharacterPatternMap {
        private Map<Character, CharacterPattern> patternMap;

        public CharacterPatternMap() {
            patternMap = new HashMap<>();
            loadPatterns();
        }

        private void loadPatterns() {

            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "**** ",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    "
            }));


            pattern
