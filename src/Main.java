import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
int arr[]= {5,4,3,2,1};
int ans[]= new int [arr.length];
int i=0;
        while ( i <arr.length ) {

            int j=i+1;
            while(j!=i){


                if(j<arr.length&&arr[i]<arr[j]){
                    ans[i]=arr[j];
                    break;
                }

j++;
                if(j>=arr.length){
                    j=0;
                }

            }
if(i==j){
    ans[i]=-1;
}
i++;
        }
        System.out.println(Arrays.toString(ans));
        }
    }
