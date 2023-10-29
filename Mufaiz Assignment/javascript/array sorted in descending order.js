'use strict';

const desecendingOrder =function(arr){
    for(let i = 0; i<arr.length-1; i++){
        let max = i;
        for(let j = i+1;j<arr.length;j++){
            if(arr[max] < arr[j]){
                max = j;
            }
        }

        const temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
    }
};

const array = [4,2,1,5,9,0,10];
console.log('Before sorting',array);

desecendingOrder(array);
console.log('array after sorted',array);
