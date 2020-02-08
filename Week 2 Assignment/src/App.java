
public class App {

	public static void main(String[] args) {
		
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.89;
		double moneyInWallet = 13.25;
		int thirstLevel = 7;
		
		boolean shouldBuyIcecream = true;
		shouldBuyIcecream = hasMoneyInPocket && isHotOutside;
		
		boolean willGoSwimming = true;
		willGoSwimming = isHotOutside && !isWeekday;
		
		boolean isAGoodDay = true;
		isAGoodDay = isHotOutside && !isWeekday;
		
		boolean willBuyMilk = true;
		willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk;
	}
}
