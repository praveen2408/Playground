#include<stdio.h>
int main()
{
	int n,a,s_t,s,nth;
  int d;
  scanf("%d",&n);
   if(n%2==1)
   {
     a=0;
     d=2;
     s_t=(n-1)/2;
     nth=a+(s_t*d);
     printf("%d",nth);
   }
  else
  {
    a=0;d=1;
    s=n/2-1;
    nth=a+(s*d);
    printf("%d",nth);
  }
return 0;	
}