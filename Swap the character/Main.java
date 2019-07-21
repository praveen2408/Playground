#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
 char a[100],b[100],c[100];
  scanf("%s%s%s",a,b,c);
  for(int i=0;i<strlen(a);i++)
  {
    if(a[i]=='a'||a[i]=='A'||a[i]=='e'||a[i]=='E'||a[i]=='i'||a[i]=='I'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U')
    a[i]='$';
  }
  for(int i=0;i<strlen(b);i++)
  {
    if(b[i]=='a'||b[i]=='A'||b[i]=='e'||b[i]=='E'||b[i]=='i'||b[i]=='I'||b[i]=='o'||b[i]=='O'||b[i]=='u'||b[i]=='U')
    {}
    else
      b[i]='#';
  }
   for(int i=0;i<strlen(c);i++)
   {
     if(islower(c[i]))
       c[i]-=32;
   }
  printf("%s%s%s",a,b,c);
  return 0;
}