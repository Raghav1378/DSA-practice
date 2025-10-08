
import java.util.HashSet;

//  ok so what is hashing :it is a technique to mapt the data to a fixed size structure using a hash function 
//  for eg if you have huge list of the elements and you want to check the presence,insert or delte effeiceentyl,instead of the scanning the whole list hashing gives you a shortcut to directly access where element should be 


public class hashing{
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);

        System.out.println(set);// {1,2,3,4}
        System.out.println(set.contains(2));//{true}



        // To push this code to GitHub, follow these steps:
        // 1. Initialize a git repository in your project folder:
        //      git init
        // 2. Add your file(s) to the staging area:
        //      git add hashing.java
        // 3. Commit your changes:
        //      git commit -m "Initial commit of hashing.java"
        // 4. Create a new repository on GitHub.
        // 5. Link your local repo to GitHub:
        //      git remote add origin https://github.com/your-username/your-repo-name.git
        // 6. Push your code:
        //      git push -u origin master }
}