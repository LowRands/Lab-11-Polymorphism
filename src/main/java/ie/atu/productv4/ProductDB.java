package ie.atu.productv4;

public class ProductDB {
    public static Product getProduct(String productCode) {

        Book myBook = null;
        Software mySoftware = null;
        Music myMusic = null;
        TV myTV = null;
        Product myProduct = null;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        }else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }
        if (productCode.equalsIgnoreCase("Pink")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Part of the Columbia group");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("Taylor")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("The Fate of Ophelia");
            myMusic.setPrice(10);
            myMusic.setArtist("Taylor");
            myMusic.setLabel("Republic Records");
            myProduct = myMusic;
        }else if (productCode.equalsIgnoreCase("Alex")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Ordinary");
            myMusic.setPrice(12);
            myMusic.setArtist("Alex Warren");
            myMusic.setLabel("Atlantic Records");
            myProduct = myMusic;
        }
        if (productCode.equalsIgnoreCase("kdl43")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTV.setPrice(819);
            myTV.setManufacturer("Sony");
            myTV.setSize(55);
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("LG")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Evo G4 OLED TV");
            myTV.setPrice(1299.99);
            myTV.setManufacturer("LG");
            myTV.setSize(55);
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("Hisense")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("U6N");
            myTV.setPrice(999);
            myTV.setManufacturer("Hisense");
            myTV.setSize(65);
            myProduct = myTV;
        }
        return myProduct;
    }
}

