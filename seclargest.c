#include<stdio.h>
int main()
{
    int arr[7]={1,99,7,55,33,13},largest=arr[0],seclargest=-1,i=0,temp,j;
    for(i=1;i<7;i++){
        if (arr[i]>largest){
            seclargest=largest; 
            largest=arr[i];
             // FOR FINDING LARGEST ELEMENT OF AN ARRAY
          }
        else if (arr[i]>seclargest){
            seclargest=arr[i];
        }
    } 
    // for(j=temp;j<6;j++){
    //     arr[j]=arr[j+1];
    // } 
    // // for (i=0;i<6;i++){
    // //     printf("\n%d\n",arr[i]);
    // // }
    // for(i=0;i<6;i++){
    //     if (arr[i]>seclargest){
    //         seclargest=arr[i]; // FOR FINDING SECLARGEST ELEMENT OF AN ARRAY
    //     }
    // }
    printf("\n%d is the second lagest element in an array",seclargest);



return 0;
}