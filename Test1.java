public class Test1{
    public static void main(String[] args) {
        String sortedString=" ";
        char temp;
        String str ="ram went school";
        String [] st=str.split(" ");
        char [] chArr=st.toCharArray();
        for(int i=0;i<chArr.length;i++){
            for(int j=0;j<chArr.length;j++){
                if(chArr[i]<chArr[j]){
                    temp=chArr[i];
                    chArr[i]=chArr[j];
                    chArr[j]=temp;
                }
            }
        }
        for(int k=0;k<chArr.length;k++)
        {
             sortedString =sortedString +chArr[k];
            // System.out.println(sortedString);
        }
        System.out.println(sortedString);

    }
}