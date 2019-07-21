#include<stdio.h>
int gcd(int c,int d)
{
  if(c==0)
    return d;
  return gcd(d%c,c);
}
int main()
{
 int a,b;
  scanf("%d%d",&a,&b);
  int lcm=(a*b)/(gcd(a,b));
  printf("%d",lcm);               //Type your code here
  return 0;
}