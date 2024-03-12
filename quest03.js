let arrays = [
    [1, 3, 5, 7],
    [2, 4, 8, 16, 32, 64],
    [0, 1, 4, 9, 16, 25, 36],
    [4, 16, 36, 64],
    [1, 1, 2, 3, 5, 8],
    [2, 10, 12, 16, 17, 18, 19]
  ];
  
  let numerosAdicionados = [9, 128, 49, 400, 13, 200];
  
  arrays.forEach((arr, index) => arr.push(numerosAdicionados[index]));
  
  arrays.forEach(arr => console.log(arr));