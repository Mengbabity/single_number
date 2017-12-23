# single_number
#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
	int singleNumber(vector<int> nums) {

		int result = 0;
		for (int i = 0; i < nums.size(); i++)
		{
			result = result^nums[i];
		}
		cout << result<<endl;
		return result;
	}
};

void main(){
	Solution s;
	s.singleNumber({ 1, 2, 3, 4, 4, 3, 5, 2, 5, 1, 6, 7, 7 });
}
