#include<stdio.h>
int main()
{
 char a[1000];
  int i;
  scanf("%[^\n]s",a);
 for(i=0;a[i]!='\0';i++);
  printf("%d",i);
  return 0;
}