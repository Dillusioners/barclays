#include <iostream>

int main(int argc, char const *argv[])
{
	int valence, period, valency, group;

	std::cout << "\n\n\tTeams Dillusioners Chemistry\n\n";
	std::cout << "Note that transition elements are not included" << std::endl;

	std::cout << "Enter the valence electrons: ";
	std::cin >> valence;
	std::cout << "Enter the period number: ";
	std::cin >> period;

	if(valence > 4 && period != 1){
		valency = 8 - valence;
	}
	else if(valence <= 4 && period != 1){
		valency = valence;
	}
	else if(period == 1){
		if(valence == 1) {valency = valence;}
		else {valency = 0;}
	}

	std::cout << "\nThe Valency of element: " << valency << std::endl;

	if(valence == 1 || valence == 2) group = valence;
	else group = 10 + valence;

	std::cout << "The Group Number of element: " << group << std::endl;

	return 0;
}
