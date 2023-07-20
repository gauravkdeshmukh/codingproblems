// x , y, b 
// b == 1 => x
// b == 0 => y

// logical operation
var logicalComparison = (x,y,b) => {
  return ((x + y) - y) * b || y;
}
logicalComparison(122,54546,1);