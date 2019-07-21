#include<stdio.h>
#include<math.h>
int main()
{
  float pi=3.14;
  int dia;
  float area;
  scanf("%d",&dia);
  float r=(float)dia/2;
  area=pi*(pow(r,2));
  printf("%.2f",area);
  return 0;
}