## Feature Set – 
Your group are to produce (design and implement) software that is capable of
performing the following features with the provided dataset. There are a number of structured tasks
which specify how you should tackle this problem and produce your deliverables; detailed in the
next section.
You should ensure that your software supports as many of the following features are you can (this
list broadly increases in difficulty):

A. List all the regions (region) from which you have data.

B. Display all the film names (title) for a specified region (region).

C. For a specified partial film title, display all possible film titles (title) along with their region
(region).

D.
  a. Display the name of the film (title) and the category of their contribution (category), for any
specified person (nconst).
  b. Given the title of a film, display the names (nconst) and category of contribution (category)
of all the people that worked on the film in the order (order) specified in the data.

E. Find the person (nconst) with the highest number of credits to their name and display the films
(title) they have been associated with.

F.Find the person (nconst) with the highest number of credits to their name of a specified
category type (category) and display the films (title) they have been associated with in that
capacity.

Notes:
* When a feature states “for a specified”, or similar, you should assume that the user should be
prompted to choose – you can decide how this should be presented to the user.
* You must read the files at the start of program execution, and perform all features on the data
in-memory.
## Tasks
Your group are required to complete the following tasks (Stages 1-3) as part of this software
development. A pass grade is theoretically possible with a complete demonstration of the basic
concepts (Stage 1) for all software features A through F; thus partial submissions are strongly
encouraged. However, higher marks are restricted to those that complete more of the following
tasks (Stages 2 and 3). If your group plan to submit all tasks, it is strongly recommended to begin
with the basic tasks and build on these to reach the higher-level tasks: later tasks require analysis
of your basic work.

## Stage One:
1. Analyse the sample dataset (SampleDataset) and produce a basic class design and
implementation to read the file data and store the film data in memory; clearly identifying any
library collection types that you use; restricting this to linear collections.
You should at a minimum produce a UML Class Diagram to describe your customised types
with some brief explanatory text to explain how file data is mapped to these types (and your
usage of Java’s Collections).

2. Explain how solutions to the stated problems / features would be facilitated with linear /
exhaustive search and simple sorting algorithms; i.e. describe the algorithm(s) you use and
why you selected this algorithm. It is recommended that you use a combination of brief
descriptive text and UML Activity Diagrams (i.e. flowcharts) to illustrate your algorithm(s). (Note:
at this stage, do not concern yourself with the operational time or space efficiency of this
solution. The aim should be to ensure that it is functional, whilst being as simplistic as possible!)

3. Implement a working solution to the problems using this “simplistic” approach. The
implementation should realise the class design produced earlier and operate as a Java
console application.
