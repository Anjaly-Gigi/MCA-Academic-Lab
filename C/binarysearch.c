#include<stdio.h>
#include<stdlib.h>
int main()
{
 int n,a[100],item,high,low=0,flag=0,mid,i;
 printf("enter the size of array\n");
 scanf("%d",&n);
 
 printf("enter the values\n");
 for(i=0;i<n;i++)
 scanf("%d",&a[i]);
 
 printf("enter the item to search\n");
 scanf("%d",&item);

 high=n-1;
 while(low<=high)
 mid=(high+low)/2;
 for(i=0;i<n;i++)
 {
 if(a[mid]==item)
  {
  printf("the item=%d is found in mid",item);
  flag=1;
  }
  
 else if(item<a[mid])
   high=mid-1;
   
 else(item>a[mid])
  low=mid+1;
 } 
 
  if(flag==0)
   printf("search is unsuccesful");
   
  return 0;
}
 
