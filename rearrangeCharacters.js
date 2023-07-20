/**
 * Good morning! Here's your coding interview problem for today.
 * This problem was asked by IBM.
 * Given a string with repeated characters, rearrange the string so that no two adjacent characters are the same. If this is not possible, return None.
 * For example, given "aaabbc", you could return "ababac". 
 * Given "aaab", return None.
 */

 function findIndexOfNonMatch(s, adjChar, i) {
    for(let j=i ; j< s.length - 1; j++){
        if(s[j] != adjChar) return j;
    }
    return i;
 };

 function isAlternating(s) {
    for(let i=0 ; i< s.length - 1; i++){
        if(s[i] === s[i+1]) return null;
    }
    return s.join('');
 }

 function swap (arr,a,b) {
   var temp;  
   temp = arr[a];  
   arr[a] = arr[b];  
   arr[b] = temp;
 }

 function rearrangeCharacters(s) {
    let arr = s.split('');
    let j = 0;
    for(let i = 1 ; i < arr.length - 2; i+=2){
        j = findIndexOfNonMatch(arr, arr[i], i);
        swap(arr,i,j);
    }
    return isAlternating(arr);
 };

 console.log(rearrangeCharacters("aaabbc"));
 console.log(rearrangeCharacters("aaab"));