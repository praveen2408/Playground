#include<stdio.h>
#include<string.h>
int main()
{
	char a[100];
  int count=1;
  scanf("%s",a);
  if(strlen(a)>20)
    printf("Invalid Input");
  else
  {
    for(int i=0;i<strlen(a);i++)
    {
      if(a[i]==a[i+1])
        count++;
      else
      {
        printf("%c%d",a[i],count);
        count=1;
      }
    }
  }
  return 0;
  
}