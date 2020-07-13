package hw6Q2Abstraction04;

public class TestInstitute {

	public static void main(String[] args) {
		ColumbiaUniversity cl =new ColumbiaUniversity();
		cl.dorme();
		cl.gymnasium();
		cl.morgue();
		cl.vocationalInfo();
		RockefellerUniversity ru=new RockefellerUniversity();
		ru.aeronauticalInfo();
		ru.dorme();
		ru.gymnasium();
		ru.morgue();
		//University ut=new University();can't be instantiated
		//Hospital hs=new Hospital() ;can't be instantiated
		//MedicalSchool md=new MedicalSchool();
		//NursingSchool nsNursingSchool=new NursingSchool();
		
		}

}
