package adpater;

public class Teste {

	public static void main(String[] args) {
		MPay myPay=new MpayImpl("Numero do cartão do MYPAY", "Dono do cartão do MYPay", "Expiração do MyPay", "Ano de Expiracao do MYPAY"
				, (short) 123,1.500);
		
		PPay myPayPalAdpater=new MyPayAdapter(myPay);
		testPPay(myPayPalAdpater);
	}
	
	public static void testPPay(PPay pp){
		System.out.println(pp.getCardOwnerName());
		System.out.println(pp.getCustCardNo());
		System.out.println(pp.getCardExpMonthDate());
		System.out.println(pp.getCVVNo());
		System.out.println(pp.getTotalAmount());
		}
}
