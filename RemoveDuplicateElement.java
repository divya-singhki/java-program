//java array program to remove duplicate element from an array.
import java.util.Arrays;
public class RemoveDuplicateElement {
     public static void main(String[] args) {
        int[]originalArray={1,2,3,4,2,5,3,6};
int[]uniqueArray=new
int[originalArray.length];
int index=0;
for(int i=0;i<originalArray.length;i++){
    boolean isDuplicate=false;
for(int j=0;j<index;j++){
    if(originalArray[i]==uniqueArray[j]){
        isDuplicate=true;
break;
    }
}
if(!isDuplicate){
    uniqueArray[index++]=originalArray[i];
}
}
int[]finalArray=Arrays.copyOf(uniqueArray,index);
System.out.println("original Array:"+Arrays.toString(originalArray));
System.out.println("Array with Duplicates Removed:"+Arrays.toString(finalArray));
     }
}
