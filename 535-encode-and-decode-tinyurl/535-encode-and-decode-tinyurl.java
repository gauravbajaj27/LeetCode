public class Codec {
    
    HashMap<String, String> hm = new HashMap<>();
    String s1="http://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String tiny_url=s1+ longUrl.hashCode();
        hm.put(tiny_url,longUrl);
        return tiny_url;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hm.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));