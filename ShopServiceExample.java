
public class ShopServiceExample {

	public static void main(String[] args) {
		
		ShopService s1 = ShopService.getInstance();
		ShopService s2 = ShopService.getInstance();
		
		System.out.println("요렇게 수정이 되나보아요 근데 자동완성이 안되는구만 쩝");
		
		if(s1==s2){
			System.out.println("°°Ŕş°´Ăź");
		}else{
			System.out.println("´Ů¸Ľ°´Ăź");
		}
	}
}
