import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpURLConnectionExample {

    public static void main(String[] args) throws Exception {

        HttpURLConnectionExample obj = new HttpURLConnectionExample();
/*
        System.out.println("Testing 1 - Send Http GET request");
        String urlBTC = "https://www.bitstamp.net/api/ticker/";
        //obj.sendGet(); get запрос для получения курса по ссылке urlBTC - https://ru.bitstamp.net/api/
        BTC btc = new ObjectMapper().readValue(new StringReader(obj.sendGet(urlBTC)), BTC.class);
        System.out.println(btc.ask);
*/
        //HttpURLConnectionExample obj2 = new HttpURLConnectionExample();

        System.out.println("Testing 2 - Send Http GET request");
        String urlBTC2 = "https://api.coinbase.com/v2/prices/BTC-USD/spot";
        CoinbaseBTC coinbaseBTC = new ObjectMapper().readValue(new StringReader(obj.sendGet(urlBTC2)),CoinbaseBTC.class);
        System.out.println(obj.sendGet(urlBTC2));

    }

    private String sendGet(String url) throws Exception {


        HttpURLConnection httpClient =
                (HttpURLConnection) new URL(url).openConnection();

        // optional default is GET
        httpClient.setRequestMethod("GET");

        //add request header
        httpClient.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = httpClient.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(httpClient.getInputStream()))) {

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }

            //print result
            return response.toString();
        }

    }


}

