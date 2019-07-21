#include<stdio.h>
#include<math.h>
int main()
{
float s1,s2;
scanf("%f%f",&s1,&s2);
  float hyp;
  hyp=sqrt((s1*s1)+(s2*s2));
  printf("%.2f",hyp);
  return 0;
}