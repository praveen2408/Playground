#include<stdio.h>
int main()
{
long int n,fno=0,secon=1,sum;
  scanf("%ld",&n);
  if(n>2){
  printf("%d %d ",fno,secon);
 for(long int i=2;i<n;i++)
 {
   sum=fno+secon;
   printf("%d ",sum);
   fno=secon;
   secon=sum;
 }
  }
  else if(n==2)
    printf("%d %d",fno,secon);
  else
    printf("%d",fno);
  return 0;
}