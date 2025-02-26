//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6
package prison;
public class Prisoner {

    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor}
    //Methods
    public Prisoner (String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
    
    public void think(){
        System.out.println("I'll have my revenge.");
    }   
    public void print() {
    
	System.out.println(this.name);
	System.out.println(this.height);
	System.out.println(this.sentence);
    }
}
