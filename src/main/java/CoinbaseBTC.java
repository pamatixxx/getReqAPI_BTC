import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonAutoDetect
@JsonIgnoreProperties
public class CoinbaseBTC extends Data{
    public  String base;
    public String currency;
    public double amount;
    CoinbaseBTC(){}
}
/*
https://api.coinbase.com/v2/prices/:currency_pair/spot
{
    "data": {
        "base": "BTC",
        "currency": "USD",
        "amount": "7340.6"
    }
}

 */