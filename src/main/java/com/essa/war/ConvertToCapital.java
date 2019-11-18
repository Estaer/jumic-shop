package com.essa.war;

public class ConvertToCapital {
    public static void main(String[] args) {
        ConvertToCapital convertToCap = new ConvertToCapital();
        System.out.println(convertToCap.covert("most trees are blue") + " --> " + convertToCap.covert("most trees are blue").equals("Most Trees Are Blue"));
        System.out.println(convertToCap.covert("") + " --> " + (convertToCap.covert("") == null));
        System.out.println(convertToCap.covert(null) + " --> " + (convertToCap.covert(null) == null));
        System.out.println(convertToCap.covert("unforgettable") + " --> " + convertToCap.covert("unforgettable").equals("Unforgettable"));
    }

    public String covert(String statement){

        if(statement == null || statement.equals("")){
            return null;
        }
        else{
            String [] myStatement = statement.split(" ");
            String capitalized = "";
            for (String str : myStatement) {
                String newWord = str.toUpperCase().charAt(0) + str.substring(1);
                capitalized += newWord + " ";
            }
            return capitalized.trim();
            }
        }
    }
