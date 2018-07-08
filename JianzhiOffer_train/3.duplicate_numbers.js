
let testInput = [2,3,1,0,2,5];

let duplicate = function(nums){

    let repeated = -1;

    if(nums === null || nums.length <= 0){
        return false;
    }

    for(let i = 0;i < nums.length;i++){

        while( i != nums[i]){

            if( nums[i] === nums[nums[i]]){
                repeated = nums[i];
                console.log("repeated",i)
                return true;
            }

            let temp = nums[i]
            nums[i] = nums[nums[i]]
            nums[temp] = temp;
            console.log(nums);
        }
    }
    
    return true;
}

duplicate(testInput);