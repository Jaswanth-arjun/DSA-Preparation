/*
Maximum Points You Can Obtain from Cards


0

100
Medium

Given N cards arranged in a row, each card has an associated score denoted by the cardScore array. Choose exactly k cards. In each step, a card can be chosen either from the beginning or the end of the row. The score is the sum of the scores of the chosen cards.



Return the maximum score that can be obtained.


Examples:
Input : cardScore = [1, 2, 3, 4, 5, 6] , k = 3

Output : 15

Explanation : Choosing the rightmost cards will maximize your total score. So optimal cards chosen are the rightmost three cards 4 , 5 , 6.

Th score is 4 + 5 + 6 => 15.

Input : cardScore = [5, 4, 1, 8, 7, 1, 3 ] , k = 3

Output : 12

Explanation : In first step we will choose card from beginning with score of 5.

In second step we will choose the card from beginning again with score of 4.

In third step we will choose the card from end with score of 3.

The total score is 5 + 4 + 3 => 12
*/
class Solution {
    public int maxScore(int[] cardScore, int k) {
        //your code goes here
    int ls=0,rs=0,ml=0;
    for(int i=0;i<k;i++){
        ls+=cardScore[i];
        ml=ls;
    }
    int ri=cardScore.length-1;
    for(int i=k-1;i>=0;i++){
        ls-=cardScore[i];
        rs+=cardScore[ri];
        ri--;
        ml=Math.max(ml,ls+rs);
    }
    return ml;
    }
}
