#include <iostream>
#include <cmath>
using namespace std;

int main(){

    float mp;
    int tp,txp;
    cin>>mp>>tp>>txp;
    cout<<round(mp+(mp*tp/100)+(mp*txp)/100);
    return 0;
}