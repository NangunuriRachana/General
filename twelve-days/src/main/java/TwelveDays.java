class TwelveDays {

    String verse(int verseNumber) {

        String lyrics="";

        switch(verseNumber){
            case 1: lyrics = "On the first day of Christmas my true love gave to me: " +
                    "a Partridge in a Pear Tree.\n";
                    break;

            case 2: lyrics = "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n";
                    break;

            case 3: lyrics = "On the third day of Christmas my true love gave to me: three French Hens, " +
                    "two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;

            case 4: lyrics = "On the fourth day of Christmas my true love gave to me: four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;

            case 5: lyrics = "On the fifth day of Christmas my true love gave to me: five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;

            case 6: lyrics = "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, " +
                    "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n";
                    break;

            case 7: lyrics = "On the seventh day of Christmas my true love gave to me: " +
                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +
                    "two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;

            case 8: lyrics = "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking," +
                    " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;

            case 9: lyrics = "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, " +
                    "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;

            case 10: lyrics = "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, " +
                    "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +
                    "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n";
                    break;

            case 11: lyrics = "On the eleventh day of Christmas my true love gave to me: " +
                    "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;

            case 12: lyrics = "On the twelfth day of Christmas my true love gave to me: " +
                    "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +
                    "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;
        }
        return lyrics;
    }

    String verses(int startVerse, int endVerse) {
        String lyrics="";
        for (int verse_number = startVerse; verse_number <= endVerse; verse_number++) {
            lyrics+=verse(verse_number);
            if(verse_number!=endVerse)
                lyrics+="\n";
        }
        return lyrics;
    }
    
    String sing() {
        return verses(1,12);
    }
}