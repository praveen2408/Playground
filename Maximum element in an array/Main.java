#include<stdio.h>
int main()
{
  int n,max=-1;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(int i=0;i<n;i++)
  {
    if(a[i]>max)
      max=a[i];
  }
  printf("%d",max);
  return 0;
}