


function binarySearch(nums,key){

    let l = 0;
    let h = nums.length - 1;

    console.log("数组为：",nums);

    while(l <= h){
        let m = parseInt(l + (h - l) / 2);

        console.log("当前迭代：l:%d ,h:%d ,m:%d ",l,h,m);

        if( nums[m] === key ){
            return m;
        }
        else if(nums[m] > key){
            h = m - 1;
        }else if(nums[m] < key){
            l = m + 1;
        }

    }
    return -1;
}


// let nums = [1,2,3,4,5,6,7,8];   let key = 6;
// let result = binarySearch(nums,key);
// console.log("result:%d",result);


// 69.求开方  https://leetcode.com/problems/sqrtx/description/

var mySqrt = function(x) {

    if(x <= 1) return x;

    let l = 0, h = x;

    while(l <= h){

        let mid = parseInt(l + (h - l) / 2);
        let sqrt = x / mid;

        if(sqrt === mid) return mid;

        else if(sqrt > mid){
            l = mid + 1;
        }else {
            h = mid - 1;
        }
    }

    return h;
};

// let sqrtResult = mySqrt(9);
// console.log(sqrtResult);


// 744. Find Smallest Letter Greater Than Target (Easy)     https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

var nextGreatestLetter = function(letters, target) {

    let l = 0; let h = letters.length - 1;

    while(l <= h){

        let m = parseInt(l + (h-l) / 2);

        if(letters[m] > target){
            h = m - 1;
        }else {
            l = m + 1;
        }
    }

    if (l >= letters.length ) return letters[0];
    else return letters[l];
};


let l1 = ["c", "f", "j"];
let t1 = "a";
let r1 = nextGreatestLetter(l1,t1);

let t2 = "c";
let r2 = nextGreatestLetter(l1,t2);

let t3 = "d";
let r3 = nextGreatestLetter(l1,t3);

let t4 = "g";
let r4 = nextGreatestLetter(l1,t4);

let t5 = "j";
let r5 = nextGreatestLetter(l1,t5);

let t6 = "k";
let r6 = nextGreatestLetter(l1,t6);

console.log(r1,r2,r3,r4,r5,r6);












