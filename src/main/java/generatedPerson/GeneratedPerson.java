package generatedPerson;
/** Class is to read the files based on the country and gender provided to the Constructor
 * This is not applicable for the cases when application is using the database to load/check entered data of course
 * */
public class GeneratedPerson {
/**
 * @param stringCountry 2 chars to set the country, e.g. uk, us, ru etc.
 * @param gender gender to be considered during the generation, could be m, f, n or be absent
 *                  gender m male names will be taken
 *                  gender f female names will be taken
 *                  gender n will be generated from the combined list
 */
    private String name;
    private String surname;
    private String emailAddress; // based on name and surname with

    private String country;
    private String postalCode;
    private String town;
    private String building;
    private String buildingLiter; // like 1A
    private String buildingID;
    private String entranceID;
    private String street;
    private int floor; //0 to 200
    private String apartmentID; // could be number could be number and character 100, 1010B
    private String occupation;
    private String position;
    private int age; // must be limited from 1 to 120
    private String phoneNumber;
    private int salary; // 0 to eternity
    GeneratedPerson(String stringCountry, String gender){

    }
    GeneratedPerson(String stringCountry, String gender, String emailDomain){
        this(stringCountry, gender);
    }
}
