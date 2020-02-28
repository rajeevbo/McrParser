package com.interview.mcr;

public class ParserImpl implements Parser {
    @Override
    public LineOne parseLineOne(String line1) {
        if (line1 == null) {
            throw new IllegalArgumentException("Line one characters cannot be null");
        }

        if (line1.length() != 44) {
            throw new IllegalArgumentException("Line one characters have to be 44 characters in length");
        }

        String documentType = line1.substring(0, 1);
        String country = line1.substring(2, 5);
        String names = line1.substring(5);
        String[] firstAndLast = names.split("<<", 3);

        String fname = firstAndLast.length > 0 && firstAndLast[0] != null && firstAndLast[0].length() == 0 ? null : firstAndLast[0].replace("<", " ");
        String lname = firstAndLast.length > 1 && firstAndLast[1] != null && firstAndLast[1].length() == 0 ? null : firstAndLast[1].replace("<", " ");

        if (lname != null && lname.length() != 0) {
            lname = lname.trim();
        }

        LineOne lineOne = new LineOne(documentType, country, fname , lname);
        return lineOne;
    }


}
