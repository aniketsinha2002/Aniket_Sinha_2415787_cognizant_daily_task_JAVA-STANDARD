function selectionSort(arr) {
  for (let i = 0; i < arr.length - 1; i++) {
    let minIndex = i; // Assuming the first unsorted element is the smallest

    for (let j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[minIndex]) {
        minIndex = j; // Updating minIndex if a smaller element is found
      }
    }

    // Swaping the found minimum element with the first unsorted element
    [arr[i], arr[minIndex]] = [arr[minIndex], arr[i]];
  }

  return arr;
}

let arr = [3, 1, 4, 1, 5, 9, 2];
console.log("Sorted array:", selectionSort(arr));
