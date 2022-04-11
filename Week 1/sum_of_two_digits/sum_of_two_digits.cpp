#include <bits/stdc++.h>
using namespace std;
#define ll long long

int sum_of_two_digits(ll a, ll b){
    return (a+b);
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    ll a,b; cin>>a>>b;
    // cout << (a+b) << '\n';
    int ans = sum_of_two_digits(a,b);
    cout << ans << '\n';
    return 0;
}
