package week2concept_4;

public class Practice {
	public int ivalue;
	public float fvalue;
	
	public Practice(int ivalue, float fvalue) {
		this.ivalue=ivalue;
		this.fvalue=fvalue;
		System.out.printf("%d,%f\n",ivalue,fvalue);
		
	}

	public static void main(String[] args) {
		Practice pc = new Practice((int)10,(float)1.2345);
	}
}
