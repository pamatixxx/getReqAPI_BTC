import com.fasterxml.jackson.annotation.JsonAutoDetect;


//дисериализация Биткойна
@JsonAutoDetect
public class BTC {
    public double high;
    public double last;
    public double timestamp;
    public double bid;
    public double vwap;
    public double volume;
    public double low;
    public double ask;
    public double open;

    BTC(){}
}


/*
last	Last BTC price.
high	Last 24 hours price high.
low	Last 24 hours price low.
vwap	Last 24 hours volume weighted average price.
volume	Last 24 hours volume.
bid	Highest buy order.
ask	Lowest sell order.
timestamp	Unix timestamp date and time.
open	First price of the day.
 */