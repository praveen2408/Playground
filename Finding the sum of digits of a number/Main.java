#include <stdio.h>
int main() {
	int n,sum=0,d;
  scanf("%d",&n);
  while(n!=0)
  {
    sum=n%10;
    d=d+sum;
    n=n/10;
  }
  printf("%d",d);
	return 0;
}