#include <stdio.h>
// Main function
int gcd(int c,int d)
{
  if(c==0)
    return d;
  if(d==0)
    return c;
  if(c>d)
    return gcd(c-d,d);
  else
    return gcd(c,d-c);
}
int main()
{
 int a,b;
  scanf("%d %d",&a,&b);
  printf("%d",gcd(a,b));// Enter your code here 
  
   return 0;
}