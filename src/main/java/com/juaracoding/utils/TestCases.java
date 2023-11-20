package com.juaracoding.utils;

public enum TestCases {

    //DayOff Page
    T1("Show Day Off Page"),

    //Event Date Page
    T2("Add Event Date"),
    T3("Close Form Event Date"),
    T4("Test Without Event Name"),
    T5("Test Without Event Date"),
    T6("Test Without Start Date"),
    T7("Test Without End Date"),
    T8("Test Empty Form Add Event Date"),
    T9("Test Wrong Year Start Date"),
    T10("Test Wrong Year End Date"),
    T11("Test Wrong Year End Date"),
    T12("Test Invalid Date Event"),
    T13("Test Edit Event Date"),
    T14("Test Cancel Form Edit Event Date"),
    T15("Test Empty Date Edit Event"),
    T16("Test Empty Form Edit Event"),
    T17("Test Cancel Delete Event Date"),
    T18("Test Delete Event Date"),
    T19("Test Show Page Event Date"),

    //Hari Libur Page
    T20("Add Hari Libur"),
    T21("Cancel Form Add Hari Libur"),
    T22("Empty Form Add Holiday"),
    T23("Test Without Input Description Holiday"),
    T24("Test Without Input Date Holiday"),
    T25("Input Invalid Date Holiday"),

//    T26("Edit Data Holiday"),
//    T27("Cancel Edit Data Holiday"),
//    T28("Test Without Input Description Edit"),
//    T29("Test Invalid Date Edit"),
//    T30("Delete Data Holiday"),
//    T31("Cancel Delete Data Holiday"),


    //Laporan Semua Page
    T32("Search With Input Name"),
    T33("Search With Filter"),
    T34("Search With Calendar"),
    T35("Test Button Reset Calendar"),
    T36("Test Invalid Search Input Name");

    private String testCaseName;
    TestCases(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
