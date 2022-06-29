package com.jackpan.leetcode.encodeDecodeTinyurl;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/29 12:43
 **/
public class Codec {
    static final int K1 = 1117;
    static final int K2 = 1000000007;

    private Map<Integer, String> dataBase = new HashMap<>();
    private Map<String, Integer> urlToKey = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (urlToKey.containsKey(longUrl)) {
            return "http://tinyurl.com/" + urlToKey.get(longUrl);
        }
        int key = 0;
        int base = 1;
        for (int i = 0; i < longUrl.length(); i++) {
            char c = longUrl.charAt(i);
            key = (int) ((key + (long) c * base) % K2);
            base = (base * K1) % K2;
        }

        while (dataBase.containsKey(key)) {
            key = (key + 1) % K2;
        }

        dataBase.put(key, longUrl);
        urlToKey.put(longUrl, key);
        return "http://tinyurl.com/" + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int p = shortUrl.lastIndexOf('/') + 1;
        int key = Integer.parseInt(shortUrl.substring(p));
        return dataBase.get(key);
    }
}
