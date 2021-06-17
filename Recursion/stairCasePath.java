import java.util.*;
public class stairCasePath {
  public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     int n=sc.nextInt();
     ArrayList<String>  paths= getPaths(n);
    System.out.println(paths);
  }
  public static ArrayList<String> getPaths(int n){
      
    if(n==0){
        ArrayList<String> bres=new ArrayList<>();
        bres.add("");
        return bres;
    }

    if(n<0){   //if n becomes negative, simply return the arraylist without adding anything.
        ArrayList<String> bres=new ArrayList<>();
        return bres;
    }
    
    
    
    
    ArrayList<String> path1=getPaths(n-1);
      ArrayList<String> path2=getPaths(n-2);
      ArrayList<String> path3=getPaths(n-3);
      ArrayList<String> paths= new ArrayList<>();

    for(String path : path1){
        paths.add(1 + path);
    }
    for(String path : path2){
        paths.add(2 + path);
    }
    for(String path : path3){
        paths.add(3 + path);
    }


      return paths;
  }  
}
