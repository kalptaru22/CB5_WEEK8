package cbgroupsinheritance;

public class CodeBuster {
    /*
    Write a Java program to create a class called codebuster with a method called
groupName(). Create a subclass called codebusterGroups() that overrides the
groupName() method.
     */
    public static void main(String[] args) {
        CodeBuster codeBuster = new CodeBuster();
        codeBuster.groupName();
    }

    public void groupName() {
        System.out.println("There are 3 groups");
    }
}
