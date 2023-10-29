'use strict';

const reverseWord = function(word) {
    return word.reverse().join('');
  }


  const stringReverse = function(string) {

    const words = string.split(' ');


    const reversedWords = words.map(word => reverseWord(word.split('')));
//    console.log(reversedWords);

  
    const reversedString = reversedWords.join(' ');
  
    return reversedString;
  }
  
   const reverseString = stringReverse('this is a sunny day');
   console.log(reverseString);
  