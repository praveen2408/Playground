#include <stdio.h>
int main() {
	int n,s;
  scanf("%d",&n);
  s=n;
  while(n>10)
  {
    n=n/10;
    s=s%10;
  }
  printf("%d",n+s);
	return 0;
}