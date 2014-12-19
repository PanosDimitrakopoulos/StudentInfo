import java.io.Serializable;
class Students implements Serializable{
	private String Onoma,Epitheto,Patronumo, Eksamino;
	private int AM;
	

	public Students(String Onoma,String Epitheto,String Patronumo,int AM, String Eksamino){
		this.Onoma=Onoma;
		this.Epitheto=Epitheto;
		this.Patronumo=Patronumo;
		this.AM=AM;
		this.Eksamino = Eksamino;
	}


	public String getOnoma(String Onoma,String Epitheto,String Eksamino){
		return Onoma+ " " +Epitheto+ " " +Patronumo+ " " +Eksamino;

		}

	public int getAM(){
		return AM;
	}


	public void printData(){
		System.out.println("Name: " + Onoma + ", Surname: " + Epitheto +
			", Father's Name: " + Patronumo + ", Number of Student: " + AM + ", Period: " + Eksamino);
	}//end of printData()

	
}//end of class
