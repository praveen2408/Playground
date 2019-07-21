#include<stdio.h>

int main()
{
 long int a,b,c,d;
  scanf("%ld %ld %ld %ld",&a,&b,&c,&d);
  if(a<b && a<c && a<d)
 printf("%ld",a);
  else if(b<c && b<d && b<a)
    printf("%ld",b);
  else if(c<a && c<b && c<d)
  printf("%ld",c);
  else
    printf("%ld",d);
  return 0;
}