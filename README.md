# Mulligan Decisions

A project to help you find out which will be your most common hands during a match. This project was created to study what would be the most common hands with 6, 5 or even 4 cards with and affinity deck, to make it easier making a mulligan decision.

# 1. Setting up your deck

First, let's build the needed enumerations. Create a classification for your cards in CardClassification.java. Choose a name and a diferent code for each item on your classification. Then you create each card of your deck at CardName.java, this is not really needed for the mulligan decisions, but if might come in hand with next versions.

Last step is create your list at Lists.java. There's already an affinity list there, so you can easily use it as a reference.

# 2. Looking at the chances

Run the main method at Statistics.java and you can see the best chance hands with any number of cards.

# 3. Future changes
- Implement pile shuffling
- Actually save the full hand instead of it's hash code before showing the results
- Show the N most likely hands 
- Make it intelligent enough to play the game and decide whether or not mulligan, saving it's results for further analysis.
