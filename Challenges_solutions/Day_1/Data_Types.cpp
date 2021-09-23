#include <iostream>
using namespace std;

int main()
{

    int i = 4, a;
    double d = 4.0, b;
    string s = "HackerRank ", c;
    cin >> a;
    cin >> b;
    fflush(stdin);
    getline(cin, c);

    cout<<i+a<<endl;
    printf("%.1f\n",b+d);
    cout<<s+c<<endl;

    return 0;
}