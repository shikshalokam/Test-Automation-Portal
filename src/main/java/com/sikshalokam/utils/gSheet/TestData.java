package com.sikshalokam.utils.gSheet;

import com.google.api.services.sheets.v4.Sheets;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.*;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

public class TestData {
    //For Staging Environment
	public static String spreadsheetId = "1JMH66_OvH78z0xR-hnCgT9djwOCu5H4EUSLOKwBz5BY";
   
	//For Prepod Environment
	//public static String spreadsheetId = "1D0UaVurn-iAux-eJj41ujsQarpUeXPK-2KDg98cMUB8";
    
	//For Prod Environment
	//public static String spreadsheetId = "1n_ppQikGLio_u7AOS56QCnKUT73vNcAqKK3RHb3aRnQ";
	public static String range = "HomePage!A2:B2";
    public static Sheets service;

    @Test
    public static void verifyProfileInfo() throws IOException, GeneralSecurityException {
        GoogleSheet sheetAPI = new GoogleSheet();
        List<List<Object>> values = sheetAPI.getSpreadSheetRecords(spreadsheetId, range);
        for (List<Object> row : values) {
            System.out.println(row.get(1));
        }

    }

    public static Map<String, String> getFullGoogleSheetDataAsMapString(String range) throws Exception {
        List<List<Object>> values = null;
        try {
            values = GoogleSheet.sheetAPI.getSpreadSheetRecords(spreadsheetId, range);

            Map<String, String> dataMap = new LinkedHashMap<String, String>();
            for (int i = 1; i < values.size(); i++) {

                for (int j = 0; j < values.get(i).size() - 1; j++) {
                    String val = String.valueOf(values.get(i).get(j + 1));
                    if (val.equalsIgnoreCase("Null")) {
                        val = "";
                    }
                    dataMap.put(String.valueOf(values.get(i).get(j)), val);

                }

            }
            return dataMap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static String getGoogleSheetData(String range) throws IOException, GeneralSecurityException {
        String data = "";
        GoogleSheet sheetAPI = new GoogleSheet();
        List<List<Object>> values = sheetAPI.getSpreadSheetRecords(spreadsheetId, range);
        for (List<Object> row : values) {
            data = (String) row.get(1);
            break;
        }
        values = null;
        return data;
    }

    /**
     * @Author: Sunil H N
     * @noOfRows should be > = 3
     * @spreadsheetID : ID of the Sheet
     * @range :cells range
     * @Description: GetGoogleShhetData In map
     */
    public static LinkedHashMap<String, String> getGoogleSheetDataAsMapString(String range, int noOfrows)
            throws Exception {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        try {
            List<String> l = GoogleSheet.sheetAPI.getSpreadSheetValues(spreadsheetId, range, noOfrows);
            int size = (noOfrows - 1) * 2;
            for (int i = 0; i < size - 2; i++) {
                if (i > 0) {
                    i++;
                }
                String key = l.get(i);
                String value = l.get(i + 1);
                if (value.equalsIgnoreCase("NULL")) {
                    value = "";
                }
                map.put(key, value);
            }
            l = null;
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public static LinkedHashMap<String, Long> getGoogleSheetDataAsMapInt(String range, int noOfrows) throws Exception {
        LinkedHashMap<String, Long> map = new LinkedHashMap<>();
        try {
            List<String> l = GoogleSheet.sheetAPI.getSpreadSheetValues(spreadsheetId, range, noOfrows);
            int size = (noOfrows - 1) * 2;

            for (int i = 0; i < size - 2; i++) {
                if (i > 0) {
                    i++;
                }
                String key = l.get(i);
                long value = Long.parseLong(l.get(i + 1));
                map.put(key, value);
            }

            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * @Author: Sunil H N
     * @noOfRows should be > = 3
     * @spreadsheetID : ID of the Sheet
     * @range :cells range
     * @Description: GetGoogleShhetData In map
     */
    public static LinkedHashMap<String, Long> getGoogleSheetDataAsMapInt(String range, int start, int end)
            throws Exception {
        try {
            // List<List<Object>> values = null;
            LinkedHashMap<String, Long> map = new LinkedHashMap<>();
            List<String> l = GoogleSheet.sheetAPI.getSpreadSheetValues(spreadsheetId, range, end);
            int size = (end - 1) * 2;

            for (int i = 0; i < size - 2; i++) {
                if (i > 0) {
                    i++;
                }
                String key = l.get(i);
                String value = l.get(i + 1);
                long intVal = Long.parseLong(value);
                map.put(key, intVal);
            }
            l = null;
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static LinkedHashMap<String, String> getGoogleSheetDataAsMapString1(String range, int start, int end)
            throws Exception {

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        end++;
        List<String> l = GoogleSheet.sheetAPI.getSpreadSheetValues(spreadsheetId, range, end);
        try {

            int size = (end - 1) * 2;
            for (int i = start; i < size - 2; i++) {

                if (i > 0) {
                    i++;
                }
                String key = l.get(i);
                String value = l.get(i + 1);
                if (value.equalsIgnoreCase("NULL")) {
                    value = "";
                }

                map.put(key, value);
            }
            l = null;
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public static Map<Object, Object> getTestDataFromGoogleSheet(String range) throws GeneralSecurityException {
        List<List<Object>> values = null;
        try {
            values = GoogleSheet.sheetAPI.getSpreadSheetRecords(spreadsheetId, range);

            // Object[][] data = new Object[values.size() - 1][values.get(0).size()];
            Map<Object, Object> dataMap = new HashMap<Object, Object>();
            for (int i = 0; i < values.size(); i++) {

                for (int j = 0; j < values.get(i).size() - 1; j++) {

                    dataMap.put(values.get(i).get(j), values.get(i).get(j + 1));

                }

            }

            return dataMap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<String> getFullGoogleSheetKeysAsArrayList(String range, String select) throws Exception {
        ArrayList<String> Key = new ArrayList<>();
        ArrayList<String> Value = new ArrayList<>();
        // 500 is the max rows that can be fetched
        try {
            List<String> l = GoogleSheet.sheetAPI.getSpreadSheetValues(spreadsheetId, range, 1200);
            int size = l.size(); // (noOfrows - 1) * 2;
            // System.out.println("-Size ---:>" + l.size());
            for (int i = 1; i <= size - 2; i++) {
                if (i > 0) {
                    i++;
                }
                String key = l.get(i);
                String value = l.get(i + 1);
                if (value.equalsIgnoreCase("NULL")) {
                    value = "";
                }

                Key.add(key);
                Value.add(value);

            }

            if (select.equalsIgnoreCase("Key")) {
                return Key;
            } else {
                return Value;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Value;
    }

    public static ArrayList<String> getFullGoogleSheetValuesAsArrayList(String range) throws Exception {
        ArrayList<String> Key = new ArrayList<>();
        ArrayList<String> Value = new ArrayList<>();
        try {
            // 500 is the max rows that can be fetched
            List<String> l = GoogleSheet.sheetAPI.getSpreadSheetValues(spreadsheetId, range, 1200);
            int size = l.size(); // (noOfrows - 1) * 2;

            for (int i = 0; i < size - 2; i++) {
                if (i > 0) {
                    i++;
                }
                String key = l.get(i);
                String value = l.get(i + 1);
                if (value.equalsIgnoreCase("NULL")) {
                    value = "";
                }
                Key.add(key);

                Value.add(value);
                System.out.println(key);

            }
            l = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Value;
    }


    public static ArrayList<String> getTestCasesFromModuleName(String moduleName, String range) throws Exception {
        ArrayList<String> Key = new ArrayList<>();
        ArrayList<String> Value = new ArrayList<>();
        try {
            // 1200 is the max rows that can be fetched
            List<String> l = GoogleSheet.sheetAPI.getSpreadSheetValues(spreadsheetId, range, 1200);
            int size = l.size(); // (noOfrows - 1) * 2;

            for (int i = 0; i < size - 2; i++) {
                if (i > 0) {
                    i++;
                }
                String key = l.get(i);
                String value = l.get(i + 1);
                if (value.equalsIgnoreCase("NULL")) {
                    value = "";
                }
                if (key.equalsIgnoreCase(moduleName)) {
                    Key.add(key);
                    Value.add(value);
                } else {
                    System.out.println("Other Module");
                }

            }
            l = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        debugLogger().debug("Test Cases from " + moduleName + " " + Value.toString());
        return Value;
    }


    public static ArrayList<String> getTestCasesFromModuleName2( String range ,String... moduleName) throws Exception {
        ArrayList<String> Key = new ArrayList<>();
        ArrayList<String> Value = new ArrayList<>();
        try {
            // 1200 is the max rows that can be fetched
            List<String> l = GoogleSheet.sheetAPI.getSpreadSheetValues(spreadsheetId, range, 1200);
            int size = l.size(); // (noOfrows - 1) * 2;

            for (int i = 0; i < size - 2; i++) {
                if (i > 0) {
                    i++;
                }
                String key = l.get(i);
                String value = l.get(i + 1);
                if (value.equalsIgnoreCase("NULL")) {
                    value = "";
                }
                if (key.equalsIgnoreCase(moduleName[0])) {
                    Key.add(key);
                    Value.add(value);
                } else if(key.equalsIgnoreCase(moduleName[1])){
                    Key.add(key);
                    Value.add(value);
                }else{
                    System.out.println("Other Module");
                }

            }
            l = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        debugLogger().debug("Test Cases from " + moduleName[1] + " " + Value.toString());
        return Value;
    }

    public static void main(String[] args) throws Exception {
        // Map<String, String> a = TestData.getFullGoogleSheetDataAsMapString("TC!A:B");
       // ArrayList<String> b = TestData.getTestCasesFromModuleName2("WebTestCases!A:B","LoginPage","HomePage");
        ArrayList<String> b = TestData.getFullGoogleSheetValuesAsArrayList("LoginTestData!A:B");

        System.out.println("DATA " + b);
        // System.out.println("DATA " + a);
    }
}
