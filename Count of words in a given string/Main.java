#include<stdio.h>
#include<string.h>
int main()
{
  char a[100];
  int count=0;
  scanf("%[^\n]s",a);
  for(int i=0;i<strlen(a);i++)
  {
    if(a[i]==' ')
      count++;
  }
  printf("%d",count+1);
  return 0;
  //Type your code here
  
}