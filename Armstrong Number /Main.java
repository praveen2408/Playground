#include <stdio.h>
#include<math.h>
int main() {
int a,num,i,sum=0;
  scanf("%d",&a);
  num=a;
  while(num!=0)
  {
    i=num%10;
    sum+=pow(i,3);
    num=num/10;
  }
  if(sum==a)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  
	return 0;
}