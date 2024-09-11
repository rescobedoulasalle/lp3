#include <iostream>
using namespace std;

int sum(int k) {
 // Code here ...
 if (k > 0) {
    return k + sum(k - 1);
  } else {
    return 0;
  }
 //Finish.
}

int main() {
  int result = sum(10);
  cout << result;
  return 0;
}
