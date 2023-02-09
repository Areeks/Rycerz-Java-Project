#Rycerz and Ekwipunek Java Project
This project is a simulation of a Knight and its equipment in Java. It includes two classes: Rycerz and Ekwipunek. The Rycerz class represents a knight with its name, attack, defense, and hit points (HP). The Ekwipunek class represents the equipment that the knight has and includes its attack, defense, and HP bonuses.

#Class Rycerz
The Rycerz class includes the following properties:

Nazwa - the name of the knight
Atak - the attack power of the knight
Obrona - the defense power of the knight
HP - the hit points of the knight
eq - an object of the Ekwipunek class representing the knight's equipment
The Rycerz class has two constructors:

The first constructor allows the user to set the values for the knight's name, attack, defense, HP, and equipment (attack, defense, and HP bonuses).
The second constructor sets default values for the knight's name, attack, defense, and HP to "NewKnight", 0, 0, and 0 respectively.
There are also several setter methods to change the values of the knight's properties and getter methods to retrieve the values of the knight's properties.

The Walka method allows the knight to engage in a fight with another knight represented by an object of the Rycerz class. The fight continues until one of the knights' HP becomes less than or equal to 0, or until 100 rounds have passed. The outcome of the fight is displayed at the end.

Finally, the Wyswietl method displays the knight's properties, as well as its properties with the bonuses from its equipment.

#Class Ekwipunek
The Ekwipunek class includes the following properties:

Atak - the attack bonus from the equipment
Obrona - the defense bonus from the equipment
HP - the HP bonus from the equipment
The class has two constructors:

The first constructor allows the user to set the values for the equipment's attack, defense, and HP bonuses.
The second constructor sets default values for the equipment's attack, defense, and HP bonuses to 0.
There are also getter methods to retrieve the values of the equipment's properties.

#Using the Code
To use this code, you will need a Java development environment. You can then create objects of the Rycerz class and use its methods to simulate fights between knights and display their properties. You can also create objects of the Ekwipunek class to represent the equipment of the knights.