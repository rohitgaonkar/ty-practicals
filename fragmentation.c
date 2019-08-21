#include<stdio.h>
/*#include<conio.h>*/
int main()
{
  long dsize,mtusize,oset,psize,ndsize;
  int flag=1,mf=1,i;
  char ident='x';
  FILE *f;

    f=fopen("out.txt","wt");

  printf("Enter the size of the data\n");
  scanf("%ld",&dsize);

  while(flag==1)
    {
      printf("Eter the size of the maximum tranfer unit\n");
      scanf("%ld",&mtusize);
      if((mtusize-20)%8==0)
	flag=0;
    }
  oset=0;
  psize=mtusize-20;
  for(i=1;oset<dsize;i++)
    {
      fprintf(f,"%d\t%c\t%d\t%ld\t%ld\n",i,ident,mf,oset,psize);
      oset=oset+psize;
    }

  if(oset>=dsize)
    {
      mf=0;
      ndsize=oset-dsize;
      if(oset==dsize)
	ndsize=psize;
        fprintf(f,"%d\t%c\t%d\t%ld\t%ld\n",i,ident,mf,dsize,ndsize);
    }
  fclose(f);
  return 0;
}
