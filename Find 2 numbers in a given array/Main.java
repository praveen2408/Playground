#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int j=0;j<n;j++)
    scanf("%d",&a[j]);
  int e1, e2;
  scanf("%d %d",&e1,&e2);
  int pos1=-1,pos2=-1;
  for(int i=0;i<n;i++)
  {
    if(a[i]==e1)
      pos1=i;
    if(a[i]==e2)
      pos2=i;
  }
  printf("Element 1 index = %d\nElement 2 index = %d",pos1,pos2);
  return 0;
  	
}