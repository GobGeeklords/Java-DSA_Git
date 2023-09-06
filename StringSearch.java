public class StringSearch {
    public static void main(String[] args) {
      String name="Rick";
      char target='i';
        System.out.println(Search(name,target));
    }
    public static boolean Search(String name, char target){
        if(name.length()==0)
            return false;
        for (int i = 0; i < name.length(); i++) {
            char ans=name.charAt(i);
            if(ans==target)
                return true;
        }
 return false;
    }
}
