package lab_6;

class organization { 
	String Name, Sname, des, city, ph_no; 
	int salary; 
	public 
    organization(String Name, String Sname, String des, String city, String ph_no, int salary){ 
		this.Name = Name; 
		this.Sname = Sname;
		this.des = des; 
		this.city = city; 
		this.ph_no = ph_no; 
		this.salary = salary; 
	} 
	organization() { } 
	void show_m_e(organization[][] org) { 
		int manager = 0, eng = 0; 
		for (int i = 0; i < org.length; i++) 
		    for(int j=0;j<org[i].length;j++)
		        if ((org[i][j].des.equals("Manager")) || (org[i][j].des.equals("Engineer")) )
    			    if(org[i][j].city.equals("Ambala"))
    			        org[i][j].show();
	} 
    void show_salary(organization[][] org) { 
		for (int i = 0; i < org.length; i++) 
		    for(int j=0;j<org[i].length;j++)
    			if(org[i][j].salary > 10000) 
    				org[i][j].show(); 
	} 
	void name_check(organization[][] org) { 
		for (int i = 0; i < org.length; i++) 
		     for(int j=0;j<org[i].length;j++)
    			if (org[i][j].Name.startsWith("A") || org[i][j].Name.startsWith("E") || org[i][j].Name.startsWith("I") || org[i][j].Name.startsWith("O") || org[i][j].Name.startsWith("U")) 
    				org[i][j].show();  
	} 
	void fullName(organization[][] org){
		for (int i = 0; i < org.length; i++) 
		     for(int j=0;j<org[i].length;j++)
    			System.out.println(org[i][j].Name+" "+org[i][j].Sname);  
	}
	void show() {
		System.out.println(
				"Employee name is - " + Name + "\nEmployee designation is - " + des + "\nEmployee City is - "
						+ city + "\nEmployee phone Number is - " + ph_no + "\nEmployee salary is - " + salary
						+ "\n");
	}
} 
public class lab_6 {
	public static void main(String[] args) {
		organization[][] employees = {
                {   new organization("Aditya","Goyal", "Manager", "Ambala", "6787765543", 40000), 
                	new organization("Deepak","Airan", "Manager", "Rajpura", "7763332441", 25000)},
                {   new organization("Sam","Arora", "Engineer", "Ambala", "1010101010", 8000), 
                	new organization("Utsav","Singh", "Mechanic", "Rajpura", "0987654321", 4500)},
        };
        System.out.println("\nEngineers and Managers from Ambala\n");
        employees[0][0].show_m_e(employees); 
        System.out.println("\nShowing Employees Whose salary > 10000\n"); 
		employees[0][0].show_salary(employees); 
		System.out.println("\nShowing Employees Whose name start with Vowel\n"); 
		employees[0][0].name_check(employees); 
		System.out.println("Full Names Of Employees: ");
		employees[0][0].fullName(employees);

	}
}