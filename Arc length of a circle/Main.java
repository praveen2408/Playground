#include<stdio.h>
int main()
{
  float pi=3.14;
  float r,a;
  scanf("%f %f",&r,&a);
  float len=2*pi*r*(a/360);
  printf("%.2f",len);
  return 0;
}