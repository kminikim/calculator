
public class ShopServiceExample {

	public static void main(String[] args) {
		
		ShopService s1 = ShopService.getInstance();
		ShopService s2 = ShopService.getInstance();
		
		if(s1==s2){
			System.out.println("������ü");
		}else{
			System.out.println("�ٸ���ü");
		}
	}
}
