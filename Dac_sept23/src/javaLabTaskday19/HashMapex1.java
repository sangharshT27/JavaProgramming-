

//Q1. .Write a java program to Create a HashMap called populationMap,
//stores population data for several cities, retrieves and prints the population
//of a specific city, iterates through the map to print all city populations,
//removes a city from the map, and checks if a city exists in the map.

package javaLabTaskday19;

import java.util.*;


public class HashMapex1 {
    public static void main(String[] args) {
        
        Map<String,Integer>populationMap=new HashMap<>();
        
        populationMap.put("Wardha", 2500000);
        populationMap.put("Nagpur", 25000000);
        populationMap.put("Mumbai", 8623000);
        populationMap.put("Pune", 3990456);
        populationMap.put("Nashik", 2716000);
        populationMap.put("Yavatmal", 2320268);
        populationMap.put("Akola", 1680992);
        
        
        String cityRetrive="Wardha";
        if(populationMap.containsKey("Wardha"))
                {
                    int population=populationMap.get(cityRetrive);
                    System.err.println("Population of"+cityRetrive+","+population);
                }
               else
                {
                    System.err.println(cityRetrive+"city not found in map");
                }
          System.out.println("City Populations:");
        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        String cityToRemove = "Mumbai";
        if (populationMap.containsKey(cityToRemove)) {
            populationMap.remove(cityToRemove);
            System.out.println(cityToRemove + " has been removed from the map.");
        } else {
            System.out.println(cityToRemove + " not found in the map. No removal performed.");
        }
        
        String cityToCheck = "Nagpur";
        if (populationMap.containsKey(cityToCheck)) {
            System.out.println(cityToCheck + " exists in the map.");
        } else {
            System.out.println(cityToCheck + " does not exist in the map.");
        }
    }
}

