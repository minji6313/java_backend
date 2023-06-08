package study_0608;


public class Ex_6_twoGeneric {

	public static void main(String[] args) {
		
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key : " + key1 + "value:" + value1);

		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found (요청한 페이지를 찾을 수 없습니다.)");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key : " + key2 + "value = " + value2);
		
		KeyValue<String, void> kv3 = new KeyValue<>();
		//void 타입은 null만 가질 수 있는 타입
		kv3.setkey("키 값만 사용");
		String key3 = kv3.getKey();
		System.out.println("key = " + key3);
	}

}