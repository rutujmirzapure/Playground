#include<iostream>
using namespace std;
int main()
{
    int num;
    cin>>num;
   for(int i=1;i<=num;i++)
  {
      for(int j=1;j<=i;j++)
      {
          if(j<i)
          {
                    cout<<i<<"*";
          }
    else
    {
              cout<<i;
    }
      }
        cout<<endl;
  }
  for(int i=num;i>=1;i--)
  {
     for(int j=1;j<=i;j++)
      {
          if(j<i)
          {
                    cout<<i<<"*";
          }
    else
    {
              cout<<i;
    }
      }
      cout<<endl;
  }



    return 0;
}
