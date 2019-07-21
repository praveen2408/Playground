#include<stdio.h>
int main()
{
 int n,i=0;
  scanf("%d",&n);
  int a[n];
  while(n>0)
  {
  a[i]=n%8;
   // printf("%d",a[n-1]);
   i++;
     n=n/8;
  }
 for(int j=i-1;j>=0;j--)
     printf("%d",a[j]);
  
    return 0;
}