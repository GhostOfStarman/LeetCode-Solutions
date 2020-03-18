class Solution {
//lengthL and lengthR variables are counters for finding a balanced string
//count is the number of balanced string in the passed in string
int count = 0;
int lengthL = 0;
int lengthR = 0;

//iterate through string
for(int i = 0; i < s.length(); i++){
	
	//increment the counters according to these conditions
    if(s.charAt(i) == ('R')){

        lengthR++;

    }

    else if(s.charAt(i) == ('L')){

        lengthL++;

    }
	
	//if the counter integers equal each other, we have found a balanced String
    if(lengthR == lengthL){

        count++;
		
		//reset our L and R counters to find the next balanced substring
        lengthL = 0;
        lengthR = 0;
    }

}

return count;
}
}
