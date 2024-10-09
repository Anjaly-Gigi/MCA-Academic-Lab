#include<stdio.h>
int n,adj[10][10]={0},visited[10]={0},q[10],f=-1,r=-1;

int main()
{
  int i,j,start,curr;
  printf("enter the no of vertices");
  scanf("%d",&n);
  
  printf("enter the adjacency matrix");
  for(i=1;i<=n;i++)
  { 
    for(j=1;j<=n;j++)
    {
      scanf("%d",&adj[i][j]);
    
    }  
  }
   printf("adjacency matrix is:");
   for(i=1;i<=n;i++)
  { 
    for(j=1;j<=n;j++)
    {
      printf("%d",adj[i][j]);
    
    }
     printf("\n");
  }
  
  printf("enter the starting vertex\n");
 
  scanf("%d",&start);
  curr=start;
  printf("BFS: %d",curr);
  visited[curr]=1;
  f=r=1;
  q[r]=curr;
   for(i=1;i<=n;i++)
  { 
    for(j=1;j<=n;j++)
    {
      if(adj[curr][j]==1 && visited[j]==0)
      {
        r=r+1;
        q[r]=j;
        visited[j]=1;
        printf("%d",j);
      }
    
    }
    f+=1;
    curr=q[f];
    
  }
  
  
  
  
  
  
}
