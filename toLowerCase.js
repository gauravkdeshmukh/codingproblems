/**
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 

Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"

 * @param {string} str
 * @return {string}
 */

var toLowerCase = function (str) {
    var value = [];
    for (var i = 0; i < str.length; i++) {
        var cc = str.charCodeAt(i);
        if (cc > 64 && cc < 91) {
            value[i] = String.fromCharCode(cc + 32);
        } else {
            value[i] = str[i]
        }
    }
    return value.join('')
};