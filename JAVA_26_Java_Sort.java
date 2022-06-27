import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}

        Student[] std = studentList.toArray(new Student[0]);
        sort(std);
        
      	for(Student st: std){
			System.out.println(st.getFname());
		}
        
        
	}
    
    private static void sort(Student[] std){
        int check = 0;
        while(check != std.length){
            check = 1;
            for(int i = 0; i < std.length - 1; i++){
                if(std[i].getCgpa() > std[i+1].getCgpa())
                    check++;
                if(std[i].getCgpa() < std[i+1].getCgpa())
                    swap(std, i, i+1);
                    
                if(std[i].getCgpa() == std[i+1].getCgpa()){
                    if(std[i].getFname().compareTo(std[i+1].getFname()) < 0)
                        check++;
                    if(std[i].getFname().compareTo(std[i+1].getFname()) > 0)
                        swap(std, i, i+1);
                    if(std[i].getFname().compareTo(std[i+1].getFname()) == 0){
                        if(std[i].getId() < std[i+1].getCgpa())
                            swap(std, i, i+1); 
                        else
                            check++;  
                    }
                        
                }
            }
            
        }

    }
    
    private static void swap(Student[] std, int i, int j){

        Student save = std[i];
        std[i] = std[j];
        std[j] = save;
            
    }
}
