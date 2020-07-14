#include<iostream.h>
#include<conio.h>
class swap_using_friend
{
   private:
       int x,y;
   public:
       void setdata(int a,int b)
       {
          x=a;
          y=b;
       }
       void showdata()
       {
          cout<<"x="<<x<<"\ny="<<y;
       }
   friend void swap(swap_using_friend &s);
};
   void swap(swap_using_friend &s)
   {
      int temp;
      temp=s.x;
      s.x=s.y;
      s.y=temp;
   }
void main()
{
    swap_using_friend s;
    int x1,x2;
    clrscr();
    cout<<"Input 2 Numbers:";
    cin>>x1>>x2;
    s.setdata(x1,x2);
    cout<<"\Before Swapping\n";
    s.showdata();
    cout<<"After Swapping\n";
    s.showdata();
    getch();
}
