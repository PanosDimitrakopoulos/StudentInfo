import java.io.*;
class TestStudent{
	public static void main(String args[])throws IOException, ClassNotFoundException{
		
		
		InputStreamReader input = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (input);

	
		System.out.println("Posoi spoudastes ua eisax8oun? ");
		int num =  Integer.parseInt(br.readLine());
		
		Students [] StudentsMatrixIn = new Students[num];

		for(int i = 0; i < StudentsMatrixIn.length; i++){
			System.out.println("Doste to onoma tou " + (i+1) + "ou foititi:");
			String Onoma = br.readLine();
		    System.out.println("Doste to eponymo tou " + (i+1) + "ou foititi:");
			String Epitheto = br.readLine();
			System.out.println("Doste to patronumo tou " + (i+1) + "ou foititi:");
			String Patronumo  = br.readLine();
			System.out.println("Doste ton arithmo mitroou tou " + (i+1) + "ou foititi:");
			int AM = Integer.parseInt(br.readLine());
			System.out.println("Doste to eksamino tou " + (i+1) + "ou foititi (A, B,...): ");
			String Eksamino = br.readLine();
			System.out.println();

			StudentsMatrixIn[i] = new Students(Onoma, Epitheto, Patronumo, AM, Eksamino);
		}
	try{
	//diadikasia eggrafis se arxeio, anoigma enos revma eksodou gia na grapsoyme sto arxeio
		FileOutputStream sOutFile = new FileOutputStream("Students.dat");
		ObjectOutputStream sOutObjectFile = new ObjectOutputStream(sOutFile);

	//diavasma pinaka kai egrafi antikeimenwn sto arxeio
		for(int i = 0; i < StudentsMatrixIn.length; i++){
			sOutObjectFile.writeObject(StudentsMatrixIn[i]);
		}

	//kleisimo  arxeiou
		sOutObjectFile.close();

	//anoigma revmatos eisodou gia na diabasoyme to arxeio
		FileInputStream sInFile = new FileInputStream("Students.dat");
		ObjectInputStream sInObjectFile = new ObjectInputStream(sInFile);

	//dimioyrgia pinaka typou student gia  apothikeysi twn antikeimenwn poy tha diabasoyme
	 	Students StudentsMatrixOut[] = new Students[num];

	//apothikefsi twn antikeimenwn ston pinaka apo Students
	 	for(int i = 0; i < StudentsMatrixIn.length; i++){
	 		StudentsMatrixOut[i] = (Students)sInObjectFile.readObject();
		}

	 //kleisimo  arxeiou
		sInObjectFile.close();
	
	 //klisi tis methodoy printData()kai ektypwsi stoixeiwn
		for(int i = 0; i < StudentsMatrixOut.length; i++){
			StudentsMatrixOut[i].printData();
	 	}
	}
	catch (IOException io){
		io.printStackTrace();
		}
	catch (ClassNotFoundException not){
		not.printStackTrace();
	}
 }//end of main()

}//end of class