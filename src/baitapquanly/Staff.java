package baitapquanly;

public class Staff extends Officer{
	 private String task;
	    public Staff(String name , int age , String gender, String address, String task) {
	    	super(name , age , gender , address);
	    	this.task = task;
	    }
	    
	    public String getBranch() {
	    	return task;
	    }
	    
	    public void setBranch(String task) {
	    	this.task = task;
	    }
	    
	    @Override
	    public String toString() {
	    	return "Engineer{" + 
	    			"task='" + task + '\'' +
	                ", name='" + name + '\'' +
	                ", age=" + age +
	                ", gender='" + gender + '\'' +
	                ", address='" + address + '\'' +
	                '}';

	    }
}
