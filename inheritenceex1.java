class university {
	
	void UN() {
		System.out.println("rgpv");
	}
}

class college extends university {
	void showCollege() {
		System.out.println("global");
	}

}
public class inheritenceex1 {
    public static void main(String[] args){
		college global = new college();
		global.showCollege();
        global.UN();
    }
    
}
