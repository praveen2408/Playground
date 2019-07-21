#include<stdio.h>
#include<math.h>
int main()
{
int n;
  int j=0,k=0;
  double cube,square;
  scanf("%d",&n);
 int a[n];
  for(int i=1;i<=n;i++)
  {
   if(i%2!=0)
   {
     square=pow(2,j);
     a[i]=square;
     j++;
   }
    else
    {
      cube=pow(3,k);
      a[i]=cube;
      k++;
    }
    
  }
    printf("%d",a[n]); 
  return 0;
}