#include<stdio.h>
#include<math.h>
int main()
{
  long int base,exp,pow=1;
  scanf("%ld %ld",&base,&exp);
  if(exp<0)
    printf("Wrong input");
  else
  {for(long int i=1;i<=exp;i++)
    {
      pow*=base;
    }
  printf("%ld",pow);
  }
  return 0;
}