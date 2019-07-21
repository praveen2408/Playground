#include<stdio.h>
int l_search(int n,int a[],int s){
  int d=-1;
  for(int j=0;j<n;j++)
  {
    if(a[j]==s)
      d=j+1;
  }
  return d;
}
int main()
{
  int a,s;
  scanf("%d ",&a);
  int b[a];
  for(int i=0;i<a;i++)
    scanf("%d",&b[i]);
  scanf("%d",&s);
  int e= l_search(a,b,s);
  if(e==-1)
  printf("%d isn't present in the array.",s);
  else
    printf("%d",e);
  return 0;
}
