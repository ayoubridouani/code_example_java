
public class Model {
	public Model() {
		
	}
	public String calc(String value1,String value2) {
		if(!value1.isEmpty() && !value2.isEmpty()) {
			int x = Integer.parseInt(value1);
			int y = Integer.parseInt(value2);
			return x+y+"";
		}
		return null;
	}
}
