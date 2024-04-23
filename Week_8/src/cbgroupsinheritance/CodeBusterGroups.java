package cbgroupsinheritance;

public class CodeBusterGroups extends CodeBuster{
    /*
    Write a Java program to create a class called codebuster with a method called
groupName(). Create a subclass called codebusterGroups() that overrides the
groupName() method.
     */
    public static void main(String[] args) {
        CodeBusterGroups codeBusterGroups = new CodeBusterGroups();
        codeBusterGroups.groupName();
    }

    public void groupName(){
        System.out.println("All Groups Are Learing Java");
    }
}
