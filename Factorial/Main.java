#include<stdio.h>
int main()
{
long int n;
  long int fact=1;
  scanf("%ld",&n);
  for(long int i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  printf("%ld",fact);
}