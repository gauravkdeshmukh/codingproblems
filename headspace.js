/*
[
      { managerId: 0, employeeId: 1 }, 
      { managerId: 0, employeeId: 3 }, 
      { managerId: 1, employeeId: 2 }, 
      { managerId: 0, employeeId: 0 }, 
    ]

0
|_1
  |_2
|_3


Extended Example:

[
  { managerId: 0, employeeId: 1 }, 
  { managerId: 0, employeeId: 3 }, 
  { managerId: 1, employeeId: 2 }, 
  { managerId: 1, employeeId: 4 }, 
  { managerId: 1, employeeId: 5 }, 
  { managerId: 5, employeeId: 6 }, 
  { managerId: 1, employeeId: 7 }, 
  { managerId: 0, employeeId: 0 }, 
  // top level; // all the subsquent ones can have more spaces
  // create levels; 
]

0
|_1
  |_2
  |_4
  |_5
    |_6
  |_7
|_3
Manager
________________
*/


var printResursively = function(org, current, level){
    if(org[current] == undefined) return;
    for(i=0; i<level; i++){
        console.log("");
    }
    console.log("|_" + org[current]);
    var value = org[current][0];
    printResursively(org, value, level++); 
}

var printOrgChart = function(array){
    // top level;
    let toplevel;
    // get the top-level
    array.forEach(element => {
        if(element.managerId == element.employeeId){
            toplevel = element;
        }
    });
    console.log(toplevel.managerId);
    var nextLevel = toplevel.managerId; 

    var org = {};
    
    array.forEach(element => {
        if(!(org[element.managerId])){
            org[element.managerId] = [];
        }else{
            var value = org[element.managerId];
            value.push(element.employeeId);
            org[element.managerId] = value;
        }
    });
    printResursively(org, nextLevel, 0);
}

