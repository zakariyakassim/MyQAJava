
package myqajava;

public class Person {
    
    private String name;
    private int age;
    private String jobTitle;
    
    
    public Person(){
        
       
        
        
        
        
    }
    
    public Person(String name, int age, String jobTitle) {
        
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }
    
    public String getPerson() {
        return name +" "+ age +" "+ jobTitle;
    }
    
    
}
