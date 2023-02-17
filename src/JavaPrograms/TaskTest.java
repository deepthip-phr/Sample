package JavaPrograms;

public class TaskTest {
    public static void main(String[] args) throws Exception,DuplicateString {
        String name = " five black balls and five blue balls";
        String words[] = name.split(" ");
        int count = 0;
        for(int i =0;i < words.length;i++)
        {
            for(int j = i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count ++;
                    System.out.println(words[j]);
                }
            }
            if(count ==0){
                throw new DuplicateString("No duplicates found");
            }
        }
    }
}
