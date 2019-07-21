#include<stdio.h>
int isvowel(char a)
{
  if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U')
    return 0;
  else 
    return 1;
}
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
 for(int i=0;str[i]!='\0';i++)
 {
   if(isvowel(str[i]))
      printf("%c",str[i]);
  }

  return 0;
}