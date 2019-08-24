package com.company;

public class Main {

    public static void main(String[] args) {
        String rawText = "WASHINGTON-Unable to rest their eyes on a colorful photograph or boldface heading that could be easily skimmed and forgotten about, Americans collectively recoiled Monday when confronted with a solid block of uninterrupted text.\n" +
                "\n" +
                "Dumbfounded citizens from Maine to California gazed helplessly at the frightening chunk of print,\n" +
                "unsure of what to do next. Without an illustration, chart, or embedded YouTube\n" +
                "video to ease them in, millions were frozen in place, terrified\n" +
                "by the sight of one long, unbroken string of\n" +
                "English words.\n" +
                "\n" +
                "\"Why won't it just tell me what it's about?\" said Boston resident Charlyne Thomson, who was bombarded with the overwhelming mass of black text late Monday afternoon.  \"There are no bullet points, no highlighted parts. I've looked everywhere there's nothing here but words.\"\n" +
                "\n" +
                "\"Ow,\" Thomson added after reading the first and last lines\n" +
                "in an attempt to get the gist of whatever the article,\n" +
                "review, or possibly recipe was about.\n" +
                "\n" +
                "At 3:16 p.m., a deafening sigh was heard across the country\n" +
                "as the nation grappled with the daunting cascade of\n" +
                "syllables, whose unfamiliar letter-upon-letter structure\n" +
                "stretched on for an endless 500 words. Children wailed for\n" +
                "the attention of their bewildered parents, businesses were\n" +
                "shuttered, and local governments ground to a halt as\n" +
                "Americans scanned the text in vain for a web link to click\n" +
                "on.\n" +
                "\n" +
                "Sources also reported a 450 percent rise in temple rubbing\n" +
                "and under-the-breath cursing around this time.\n" +
                "\n" +
                "\"It demands so much of my time and concentration,\" said\n" +
                "Chicago resident Dale Huza, who was confronted by the\n" +
                "confusing mound of words early Monday afternoon. \"This\n" +
                "large block of text, it expects me to figure everything out\n" +
                "on my own, and I hate it.\"\n" +
                "\n" +
                "\"I've never seen anything like it,\" said Mark Shelton, a\n" +
                "high school teacher from St. Paul, MN who stared blankly at\n" +
                "the page in front of him for several minutes before finally\n" +
                "holding it up to his ear. \"What does it want from us?\"\n" +
                "\n" +
                "As the public grows more desperate, scholars are working to randomly italicize different sections of\n" +
                "the text, hoping the italics will land on the important parts and allow everyone to go on with their\n" +
                "day. For now, though, millions of panicked and exhausted Americans continue to repetitively search\n" +
                "the single column of print from top to bottom and right to left, looking for even the slightest\n" +
                "semblance of meaning or perhaps a blurb.\n" +
                "\n" +
                "Some have speculated that the never-ending flood of sentences may be a news article, medical study,\n" +
                "urgent product recall notice, letter, user agreement, or even a binding contract of some kind. But\n" +
                "until the news does a segment in which they take sections of the text and read them aloud in a slow,\n" +
                "calm voice while highlighting those same words on the screen, no one can say for sure.\n" +
                "\n" +
                "There are some, however, who remain unfazed by the virtual\n" +
                "hailstorm of alternating consonants and vowels, and are\n" +
                "determined to ignore it.\n" +
                "\n" +
                "\"I'm sure if it's important enough, they'll let us know\n" +
                "some other way,\" Detroit local Janet Landsman said. \"After\n" +
                "all, it can't be that serious. If there were anything\n" +
                "worthwhile buried deep in that block of impenetrable\n" +
                "English, it would at least have an accompanying photo of a\n" +
                "celebrity or a large humorous title containing a pop\n" +
                "culture reference.\"\n" +
                "\n" +
                "Added Landsman, \"Whatever it is, I'm pretty sure it doesn't even have a point.\"";

        String formattedText = LineWrapper.formatWrapped(rawText,80);
        System.out.println(formattedText);
        LineWrapper.printLineLengths(formattedText);
	// write your code here
    }
}
