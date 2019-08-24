package com.company;

public class LineWrapper {
    public static String formatWrapped(String original, int maxLineWidth) {
        StringBuilder formattedText = new StringBuilder();

        String[] paragraphs = original.split("\n\n");
        for (String paragraph : paragraphs) {
            formattedText.append(formatParagraph(paragraph, maxLineWidth));
            formattedText.append("\n\n");
        }
        return formattedText.toString();
    }

    private static String formatParagraph(String paragraph, int maxLineWidth) {
        StringBuilder formattedParagraph = new StringBuilder();
        String[] words = paragraph.split(("\\s+"));
        int currentLineWidth = 1;
        for (String word : words) {
            int length = word.length();
            if (currentLineWidth + length > maxLineWidth) {
                formattedParagraph.deleteCharAt(formattedParagraph.length() - 1);
                formattedParagraph.append("\n");
                currentLineWidth = length + 1;
                formattedParagraph.append(word + " ");
            } else {
                currentLineWidth += length + 1;
                formattedParagraph.append(word + " ");
            }
        }
        return formattedParagraph.toString();
    }

    public static void printLineLengths(String formattedText) {
        String[] lines = formattedText.split(("\\r?\\n"));
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            System.out.println("Line Index: " + i + "\t Length: " + line.length());
        }
    }

}
