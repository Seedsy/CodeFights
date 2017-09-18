function sortByHeight(myArr) 
{
	var TreeIndexes = [];		//	Stores the location of each of the Tree's
	var rtnArr = [];			//	Stores the new array's return values
	//  Checks if "TREES" exist
	if (Math.min.apply(null,myArr) !== -1 )  {
		// There are NO trees, therefor us normal sort
		myArr.sort(LowToHigh);
		rtnArr = myArr;
	}
	else if (Math.max.apply(null,myArr) == -1)
		//	There are ONLY tree's, therefor no sort needed
		rtnArr = myArr;
	else    {
		//	Records each of the tree's locations
		for (var index = 0; index < myArr.length; index++)
		{
			if (myArr[index] === -1)
				TreeIndexes.push(index);
		}
		//Sorts the array of heights
		myArr.sort(LowToHigh);
		//  Removes the moved trees
		while (myArr[0] == -1)
		{
			myArr.shift();
		}
		//Puts the Tree's back in, where they belong
		for (var index = 0; index < myArr.length;index = index +0)
		{
			//Checks the index of the current resting position,
			//	and compares to the Next Tree's location
			if (rtnArr.length === TreeIndexes[0])	{
				rtnArr.push(-1);	//Adds the Tree back into the arr
				TreeIndexes.shift();	//Removes from list of Tree's to add
			}
			else	{
				// If its not a tree, add the next value and increment
				rtnArr.push(myArr[index]);
				index++;
			}
		}
	}
	return rtnArr;
}
//	Basic Lowest to highest Sort function (pre-coded)
function LowToHigh(a, b){return a - b;}