
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ug1();
        ug2();
        ug3();
        ug4();
        ug5();
        ug6();
        ug7();
        ug8();
        ug9();
        ug10();
        ug11();
        ug12();
        ug13();
        ug14();

    }

    //Uppgift 1:1 VARIABLE och UTSKRIFT och DATATYPER
    public static void ug1(){
        System.out.println("Hello, World!");
        System.out.println("My name is Petra");
        System.out.println("min favorit fär är lila");
    }

    //Uppgift 1:2
    static void ug2() {

        String productname = "laser_printer";
        int pris = 55;
        boolean lagerstatus = true;
        double kg = 3.5;

        System.out.println("the produkt is a " + productname);
        System.out.println("the price for the " + productname + "is:  " + pris);
        System.out.println("if on stock:" + lagerstatus);
        System.out.println("the wight for the " + productname + "is: " + kg);
    }

    //Uppgift 1:3
    static void ug3() {

        String product = "Jump_suit";
        int price = 100;
        char size = 'L' ;
        String color = "red";
        double kg = 1.2;
        boolean status = true;

        System.out.println();
        System.out.println("This amazing "+ product + " in "+ color + " come in size " + size +
                " GREAT price today, only for "+ price + " kr. Super light only " + kg + "kg, still some left in stock "
                + status);
    }

    //Uppgift 2:1 OPERATORER
    static void ug4(){
        int price = 3;
        int count = 5;
        int totalprice = price * count;

        System.out.println();
        System.out.println("For all the "+ count+ " products, the price is "+ totalprice +"kr");
    }

    //Uppgift 2:2
    static void ug5(){

        int prisUtanMoms = 100;
        int moms = (prisUtanMoms / 100)*25;
        int priceMedMoms = prisUtanMoms + moms;
        int discunt = (priceMedMoms / 100)*10;
        int prisMedDiscunt = prisUtanMoms - discunt;

        System.out.println();
        System.out.println("Priset är " + priceMedMoms + "kr. Det includerar en moms på " + moms
                + "kr. Now on special offer with a 10% discount. you can buy it for only " + prisMedDiscunt + "kr");
    }

    //Uppgift 2:3
    static void ug6(){

        int lagerAntal = 10;

        System.out.println();
        System.out.println("Ursprungligt lager antal: " + lagerAntal );

        int lagerAntalPlus1m = ++lagerAntal;
        System.out.println("ursprungligt lager antal + 1 = " + lagerAntalPlus1m);

        int lagerAntalMinus1 = --lagerAntal;
        System.out.println("updaterad lagerstatus minus 1 = " + lagerAntalMinus1);

        int lagerPlus5 = lagerAntal+=5;
        System.out.println("added another 5 products, lager status is now: "+ lagerPlus5);

        int lagerMinus3 = lagerAntal -=3;
        System.out.println("removed 3 products, lager status i snow: " + lagerMinus3);

    }

    //Uppgift 3 STRING MANIPULATION

    //Uppgift 3:1 Grundlägande string operation
    static void ug7(){

        String produktBeskrivning = "Elegant kaffemugg i porslin, tillverkad i Sverige";

        System.out.println();
        System.out.println("There are " + produktBeskrivning.length()+ " letters and breaks used in this sentence");
        System.out.println(produktBeskrivning.toUpperCase());
        System.out.println(produktBeskrivning.toLowerCase());
        System.out.println(produktBeskrivning.substring(0,10));
        System.out.println(produktBeskrivning.substring(39,49));
        System.out.println(produktBeskrivning.replace('e','x'));
    }

    //Uppgift 3:2 sökning i text
    static void ug8(){

        String beskrivning = "Handgjord keramikmugg med unikt mönster, perfekt för både kaffe och te.";

        System.out.println();
        System.out.println(beskrivning.contains("kaffe"));
        System.out.println(beskrivning.contains("glas"));
        System.out.println(beskrivning.indexOf("mugg"));
        System.out.println(beskrivning.startsWith("Hand"));
        System.out.println(beskrivning.endsWith("."));

        System.out.println("The sentence: " + beskrivning + " It is " + beskrivning.contains("kaffe") + " that the" +
                " sentence contain 'kaffe'. it is " + beskrivning.contains("glas") + " that the sentence contain glas " +
                " in the sentence the world mugg start att index position " + beskrivning.indexOf("mugg") + "it is " +
                " also" + beskrivning.startsWith("Hand") + " that the sentence start with 'hand' and ends with a .");
        System.out.println();
    }

    //Uppgift 3:3 CSV-data,  Att dela upp och kombinera text
    static void ug9(){

        String produktData = "Kaffemugg,Röd,89.50,Porslin,42";
        String comma = "[,]";
        String[] myArray = produktData.split(comma);

        String product = myArray[0];
        String color = myArray[1];
        String price = myArray[2];
        String material = myArray [3];
        String stocks = myArray[4];

        System.out.println("myArray as a string: " + Arrays.toString(myArray));

        System.out.println("product = " + product);
        System.out.println("color = " + color);
        System.out.println("price = " + price + "kr");
        System.out.println("material = " + material);
        System.out.println("stocks = " + stocks);

        String result = "Product: " + product + ", color: " + color + ", Price: " + price + "kr, Material: " + material +
                ", stocks: " + stocks;

        System.out.println();
        System.out.println(result);
    }

    //Del 4: Kombinerade övningar
    // Övning 4.1: Kundvagn

    static void ug10(){

        // Produktinformation
        String produkt1 = "T-shirt";
        int antalProdukt1 = 2;
        double prisProdukt1 = 149.50;
        double summaProduct1 = prisProdukt1 * antalProdukt1;

        System.out.println();
        System.out.println("The " + produkt1 + ", amount: " + antalProdukt1 + ", Gives a total price: " +summaProduct1);

        String produkt2 = "Jeans";
        int antalProdukt2 = 1;
        double prisProdukt2 = 499.90;
        double summaProduct2 = prisProdukt2 * antalProdukt2;

        System.out.println("The " + produkt2 + ", amount: " + antalProdukt2 + ", Gives a total price: " +summaProduct2);

        double totalSum = summaProduct1 + summaProduct2;
        System.out.println("The total sum for all products in the wagon is: " + totalSum);

        int shipingPrice = 39;
        double addShipingcost = totalSum + shipingPrice;

        if (totalSum > 500) {
            System.out.println("The total price is over 500 kr so the shipping cost is free !");
        }else {
            System.out.println("The price for the shipping is: " + shipingPrice + ", Total price including shiping is: "
                    + addShipingcost);
        }
    }

    //Uppgift 4.2: Produktkod-parser
    static void ug11(){

        String produktkod = "SWE-TR-L-123456";
        String produktkodLower = produktkod.toLowerCase();
        String streck = "[-]";
        String [] array = produktkodLower.split(streck);

        String land = array[0];
        String productType = array[1];
        String size = array[2];
        String ordernr = array[3];

        System.out.println();
        System.out.println("order: " + Arrays.toString(array));

        String swe = "Sverige";
        String dnk = "Danmark";
        String nor = "Norge";

        String tr = "Tröjor";
        String bx = "Byxor";
        String sk = "skor";

        String s = "Small";
        String m = "Medium";
        String l = "Large";
        String xl = "Extra Large";

        String country = "";
        switch (land) {
            case "swe": country = swe;
                break;
            case "dnk": country = dnk;
                break;
            case "nor": country = nor;
                break;
            default: country = "Unknown country";
                break;
        }

        String product = "";
        switch (productType) {
            case "tr": product = tr;
                break;
            case "bx": product = bx;
                break;
            case "sk": product = sk;
                break;
            default: product = "Unknown product";
                break;
        }

        String storlek = "";
        switch (size) {
            case "s": storlek = s;
                break;
            case "m": storlek = m;
                break;
            case "l": storlek = l;
                break;
            case "xl": storlek = xl;
                break;
            default: storlek = "Unknown size";
        }

        System.out.println("Country: " + country);
        System.out.println("Product: " + product);
        System.out.println("Size: " + storlek);
        System.out.println("order Nr: " + ordernr);
    }

    //Uppgifter 4:3 Orderbekräftelse

    static void ug12(){
        String kundNamn = "Anna Andersson";
        String adress = "Storgatan 1, 123 45 Staden";

        String product1 = "potatis";
        String product2 = "banana";
        String product3 = "lolopop";

        double pris1 = 20.30;
        double pris2 = 30.90;
        double pris3 = 3.60;

        int antal1 = 1;
        int antal2 = 2;
        int antal3 = 3;

        double delsummaProduct1 = pris1 * antal1;
        double delsummaProduct2 = pris2 * antal2;
        double delsummaProduct3 = pris3 * antal3;

        double totalSum = delsummaProduct1 + delsummaProduct2 + delsummaProduct3;
        String totalSum2 = String.format("%.2f", totalSum);

        String n = "\n";
        String tack = "Thank you for buying food in our shop";

        System.out.println();
        System.out.println("Your recite: " + n + "Product: " + product1 + n +
                pris1 + "kr " + antal1 + "st " + delsummaProduct1+ "kr " + n + n + "Product: " + product2 + n +
                pris2 + "kr " + antal2 + "st " + delsummaProduct2+ "kr " + n + n + "Product: " + product3 + n +
                pris3 + "kr " + antal3 + "st " + delsummaProduct3+ "kr " + n + "Total price : " + totalSum2 + "kr" +
                n + tack);

    }

    // Utmaningsövningar
    // Utmaning 1: Priskonverterare

    static void ug13(){

        double pris = 1299.90;
        double prisUtanMoms = pris/ 1.25;

        String formattedPrice = String.format(Locale.US,"%.2f", pris);
        DecimalFormat df = new DecimalFormat("#.00");
        String tusen = String.format(Locale.US,"%,.2f", pris);

        System.out.println();
        System.out.println("Price: " + formattedPrice + "kr");
        System.out.println("price with out moms: "+ prisUtanMoms + "kr");
        System.out.println("price: " + tusen + "kr");
        System.out.println( "Price: " + df.format(pris) + "kr");

    }
    // 2: SEO-optimerare

    static void ug14(){

        String produktRubrik = "Exklusiv Handgjord Kaffemugg i Svenskt Porslin - Blå";

        String beskrivning = "Denna vackra kaffemugg är handgjord av erfarna keramiker i Sverige. " +
                "Perfekt för dig som uppskattar högkvalitativa produkter med lång livslängd. " +
                "Tillverkad av finaste porslin.";

        String urlFriendly1 = produktRubrik.replace(' ', '_');
        String urlFriendly2 = urlFriendly1.toLowerCase();
        String urlFriendlyå = urlFriendly2.replace('å','a');
        String urlFriendlyä = urlFriendlyå.replace('ä','a');
        String urlFriendlyö = urlFriendlyä.replace('ö','o');

        String beskrivning50 = beskrivning.substring(0,50);
        String beskrivningDot = beskrivning50.replace("ker","...");

        String space = "[ ]";
        String[] splitWords = beskrivning.split(space);
        int countW = splitWords.length;

        System.out.println();
        System.out.println(urlFriendlyö);
        System.out.println(beskrivningDot);
        System.out.println("This is how many words there are in the beskrivning: " + countW + "st");

        int count = 0;
        ArrayList<String> longWords = new ArrayList<>();

        for(String word5 : splitWords){
            if(word5.length()> 5){
                longWords.add(word5);
            }
        }

        String[] longWordsArray = longWords.toArray(new String[0]);

        System.out.println("This is all words that have more than 5 letters: ");
        System.out.println(Arrays.toString(longWordsArray));
        System.out.println("My 5 picked key words: " +  longWordsArray[1] + ", " + longWordsArray[2] + ", " +
                longWordsArray[4] + ", " + longWordsArray[8] + ", " + longWordsArray[13]);

        String meta = beskrivning.substring(0,144);
        System.out.println("Min meta text: " + meta);

    }
}