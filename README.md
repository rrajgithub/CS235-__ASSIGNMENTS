                                                          # CS235-assignments
                                                          Artificial Intelligence
///////////////ASSIGNMENT 3.BEGIN()

Grouping problem using Genetic Algorithm :

	Genetic algorithms have become increasingly important for researchers in resolving difficult problems because they can 
	provide feasible solutions in limited time. Using genetic algorithms to solve a problem involves first defining a 
	representation that describes the problem states.

	The Simple Genetic Algorithm : 

	Step 1. Define a suitable representation of the problem to be solved.

	Step 2. Create an initial population of individuals for evolution.

	Step 3. Define a suitable fitness function for evaluating the individuals.

	Step 4. Perform genetic operations (crossover and mutation) to generate possible offspring.

	Step 5. Evaluate the fitness value of each individual.

	Step 6. Select superior individuals according to their fitness values.

	Step 7. If the termination criterion is not satisfied, go to Step 4; otherwise, stop the algorithm.


	a novel genetic algorithm based on encoding. Appropriate  crossover and mutation operations are designed to generate the 
	next generations. The proposed crossover operator may adopt combination to generate the offspring chromosomes. A repairing 
	mechanism is also adopted to adjust infeasible chromosomes into feasible ones. Several  mutation operators, including two-point
	 swapping, string swapping, and substring swapping, are presented. 

	I have defined the constant valriable K,N,M,Y for the tournament selection, population size, maximum marks, genes undergoing 
	mutuation. I have used a fitnessValue() function, chromosomes() function etc. for the various purposes like crossover, mutuation
	to solve the problem. Also, an array named stud[n] have been used to store the marks of n students.


///////////ASSIGNMENT 3.END()




///////////ASSIGNMENT 4.BEGIN()


Structure of my files :
	
	├── AI : This file contains the AI class which is used to solve the (2)nd and (3)rd questions.
	│   
	│   
	├── Human : This file contains the Human class which is use to solve (1)st and (2)nd questions.
	│   
	│   
	├── Player : This file contains the Player interface for the player to play.
	│  
	│   
	├── SticksGame : This is the ***main file*** from where all the function , related classes, interface etc. are called.


Game of Sticks

In the game of sticks there is a heap of sticks on a board. On their turn, each player picks up 1 to 3 sticks. The one who has to 
pick the final stick will bethe loser. 

1 : Human vs Human

	First, create a game where two players can play against each other that always removes 1 or 2 or 3 sticks. In this way the game 
	continues and the player who picks the last stick loses.

2 : Human vs AI

	One of the amazing things about computers is that they can learn. We're going to develop an AI that can learn to play the game 
	better, with experience. Here's how we're going to do it.The AI has a number of hats, one hat for each possible amount of sticks 
	on the table. 

3 : AI vs AI

	 In the previous part we created an AI that is able to learn from playing against the player. As we play against it, we notice 
	 that it takes a considerable amount of time before the AI is able to perform against a human player. In this part, you need to 
	 modify the program so that the player can choose to play either against a naive AI or a pre-trained AI.In order to pre-train 
	 an AI, you need to write Java that allows two AIs to battle against each others – say a hundred thousand times (after the training 
	 is working, try out different numbers as well!) – and after that the player will be set to play against the AI that is ready to
	 battle the player. 


/////////////ASSIGNMENT 4.END()
