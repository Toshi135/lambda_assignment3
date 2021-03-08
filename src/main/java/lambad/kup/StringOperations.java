package lambad.kup;

public class StringOperations {
    public static void main(String[] args) {

        StringOperations_Interface obj;

        obj = (word1, word2, word3, word4, word5, word6, word7) -> ("The" + "lambda" + "has" + "too" + "many" + "string" + "arguments.")
                .toUpperCase();
        System.out.println(obj.getConcateUppercase("The", "lambda", "has", "too", "many", "string", "arguments."));

    }
}
