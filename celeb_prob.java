public class celeb_prob {
    public static void main(String[] args) {
        int n = 5;
    int[][] arr = {
        {0,1,1,1,1},
        {1,0,0,1,0},
        {1,0,0,1,0},
        {0,0,0,0,0},
        {0,1,0,1,0}
    };
    int c = 0 ;
      for (int i = 0 ; i < arr.length ; i++){
        int sum = 0;
        for (int j = 0 ; j < arr.length ; j++){
            if(arr[i][j] == 1){
                sum+=arr[i][j];
            }
        }
        if(sum==0){
                c=i;
                break;
            }
    }

    int sum=0;
    for (int i = 0 ; i < arr.length ; i++){
        if(arr[i][c] == 1){
            sum+=arr[i][c];
        }
    }
    if(sum==n-1){
        System.out.println(c+" is the celebrity");
    }
    else{
        System.out.println("No celebrity");
    }
}

}
