<<<<<<< HEAD
package com.example.jwtauthdemo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NationService {

    private static final Map<String, Nation> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new Nation("IN", "India", "New Delhi"));
        countryMap.put("US", new Nation("US", "United States", "Washington, D.C."));
        countryMap.put("FR", new Nation("FR", "France", "Paris"));
        countryMap.put("JP", new Nation("JP", "Japan", "Tokyo"));
    }

    public Nation getNationByCode(String code) {
        return countryMap.get(code.toUpperCase());
    }
}
=======
package com.example.jwtauthdemo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NationService {

    private static final Map<String, Nation> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new Nation("IN", "India", "New Delhi"));
        countryMap.put("US", new Nation("US", "United States", "Washington, D.C."));
        countryMap.put("FR", new Nation("FR", "France", "Paris"));
        countryMap.put("JP", new Nation("JP", "Japan", "Tokyo"));
    }

    public Nation getNationByCode(String code) {
        return countryMap.get(code.toUpperCase());
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
