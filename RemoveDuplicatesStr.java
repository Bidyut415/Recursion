public class RemoveDuplicatesStr {

  public static void removeDuplicates(String str,int idx,StringBuilder newstr,boolean map[]){
    //base condtion
    if(idx==str.length()){
      System.out.println(newstr);
      return;
    }

    //Recursion 
    char currChar = str.charAt(idx);
    if(map[currChar-'a']==true){
      //duplicate
      removeDuplicates(str, idx+1, newstr, map);
    }else{
      map[currChar-'a']=true;
      removeDuplicates(str, idx+1, newstr.append(currChar), map);
    }
  }
  public static void main(String[] args) {
    String str="abbccdda";
    removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
  }
}
