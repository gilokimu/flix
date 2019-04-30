package me.gilo.flix;

public class Config {

    public static String API_VERSION = "1";
    public static String ENVIRONMENT = "sandbox";
    public static String SITE_URL = "http://example.com/api";
    public static String BASE_URL = SITE_URL + "/v" + API_VERSION + "/" + ENVIRONMENT + "/";

    public static String API_KEY = "";
    public static String APP_SECRET = "";



  /**

   Movies end point
   https://api.apiumadomain.com/list?sort=seeds&short=1&cb=&quality=720p,1080p,3d&page=1

   Shows end point
   https://api.apiumadomain.com/shows?cb=0.5771242224060154&sort=seeds&page=1

   Shows detailed
   https://api.apiumadomain.com/show?imdb=tt0944947

   Show detailed info
   https://tinfo.apiumadomain.com/3/search/tv?query=Game%20of%20Thrones&api_key=49101d62654e71a2931722642ac07e5e
   https://tinfo.apiumadomain.com/3/tv/1399?api_key=49101d62654e71a2931722642ac07e5e

   */

}
	