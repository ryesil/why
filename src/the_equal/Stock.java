package the_equal;

public class Stock {
String symbol;
String name;
double previouslyClosingPrice;
double currentPrice;

public Stock(String symbol,String name, double previouslyClosingPrice, double currentPrice) {
	this.name=name;
	this.symbol=symbol;
	this.previouslyClosingPrice=previouslyClosingPrice;
	this.currentPrice=currentPrice;
}

public double getChangePercent() {
	double percentage=Math.round(((currentPrice-previouslyClosingPrice)/previouslyClosingPrice)*100*100)/100.0;
	return percentage;
}

	
}
