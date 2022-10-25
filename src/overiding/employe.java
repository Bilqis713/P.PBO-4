package overiding;
public class employe {
    private String name;
    private double salary;


    protected employe(String name, double salary){
		this.name = name;
		this.salary = salary;
    }  
	protected String getDetails(){
		return "Name :"+name+ "\nSalary" +salary;
		}
		public void cetak(){
			System.out.println("Percobaan  di Class Employee");
		}
}
class Manager extends employe{
    private String dept;
    
    public Manager (String name, double salary, String dept){
        super (name, salary);
        this.dept = dept;
    }
    public  String getDept(){
        return dept;
    }
    public String getDetails(){
        return super.getDetails()+"\nDepartment : "+getDept();
    }
    public void cetak(){
        System.out.println("Percobaan di  Class Manager");
    }
}

class view{
    public static void main(String[] args) {
        employe em = new employe("Dilan", 4000000);
        Manager mn =new Manager("Milea", 5000000, "Marketing");
        System.out.println("Data Employe : \n"+ em.getDetails());
        em.cetak();
        System.out.println("DAta Manager : \n"+ mn.getDetails());
        mn.cetak();
    }
}


