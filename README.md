## java_task3
### MAIN.class
- starting with creating a Scanners and read in n from keybord
- create Graph class instance 
- using for loop to get all edges and add interactions between them 
- calling method to display quantity of graphs
### GRAPH.class
- using LinkedList for storing a HashSet's, which are representing a single graph 
- using addInteraction method 
- using for loop to find graph with a 
- using for loop to find graph with b
- if: a doesn't exist a and b doesn't exist 
  - creating newGraph 
  - add a and b to newGraph 
  - add to the list 
- if: a exist and b doesn't exist
  - add b to the graph with a  
- if: b exist and a doesn't exist
  - add b to the graph with a  
- if: a exist b and a does exist 
  - add graph b to a 
  - remove graph b 
