##Tango Tek Multisorting storage system V2.0

%vstart% https://www.youtube.com/watch?v=wsNV9Mo00Gw %vend%

Onze eerste opslag systeem. Zoals je kan zien aan de titel is dit de 2de versie van dit opslag systeem.
Dit was een versie oorspronkkelijk voor 1.12, dus geen mogelijkheid om meerdere kisten naast elkaar te zetten.

De belangrijkste regel in dit systeem.  


   **Minstens 1 item moet aanwezig zijn.**
 
 Met andere woorden er mag geen enkele plaats leeg zijn in de kisten.
  
 Voordeel van dit ontwerp is dat het modulair, gemakkelijk uitbreidbaar, is.  
 Laten we beginnen. Open een test wereld in minecraft 1.13+.  
 Op onderstaande foto's zie je een kamer met 8 modules. (De totale kamer bevat er 8).  
 
 %cstart%
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/TangoTekMultiSortRoom.gif?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/TangoTekStorageV2.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/TangoTekStorageRoomView.png?raw=true
 %cend%
 
 Voor deze uitleg houden we het op 1 modules.  
 Dit om te toenen hoe het syteem werkt en hoe we tussen modules items doorgeven.  
 Een module is minimum 4 bij 9 en 11 hoog (kisten en redstone logica voor de module) hierbij moet men dus nog rekening houden met invoer van en transport tussen meerdere modules.
 
 
 Laten we beginnen met de eerste module.
 
 Begin met het bouwen van een platform van 4 bij 9. en plaats ook de kisten voor het systeem.  
 Zie onderstaande afbeelding als referentie. Zoals je ziet heb je dus een constructie van in totaal 11 hoog en 4 breed en 9 lang
  
%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/ModuleReference.png?raw=true %iend%  

Eenmaal je dit geplaatst hebt kunnen we verder gaan met de redstone gedeeltes.

## De redstone constuctie

###Stap 1

Ga naar de achterkant van het systeem plaats en plaats in de rechterhoek onder de muur een blok op de grond met daar een redstone toorts op

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap1.png?raw=true %iend%


###Stap 2

Plaats een blok direct naast de vorige blok en plaats dan een derde blok 1 hoger. zodat je het volgende hebt.

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap2.png?raw=true %iend%

###Stap 3

Plaats redstone stof op de 2 blok. dit wordt dan direct gevoed door de toorts en han een redstone toorts aan de andere kant van de blok die een positie hoger hangt. (Zie Afbeelding)

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap3.png?raw=true %iend%

###Stap 4

Plaats een repeater onder de blok en zet deze op 4 ticks. en plaats een stuk redstone dust acher deze repeater

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap4.png?raw=true %iend%

Dit es een clock circuit. eenmaal de eerste redstone torch geen kracht meer geeft zal  de clock in werking komen.

###Stap 5
Plaats een repeater tegen de block van de eerste redstone torch. Laat deze op 1 tick staan.  
Plaats een blok naast deze repeater gevolgd door een stuk redston stof

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap5.png?raw=true %iend%


###Stap 6

Plaats nu 2 comparators(vergelijkrers) met hun uitgang naar de blok en plaats daarnaast aan de uiterst links kant 2 comparators in de omgekeerde richting.  
Verbindt de ingang en uitgang met elkaar aan de zijde die het verst weg is van de kisten. en verleng met nog 2 stukjes redstone stof.

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap6.png?raw=true %iend%


##Stap 7 (De item lift)

Plaats een blok met redstone stof aan de meest rechtsekant van de constructie. Plaats deze blok op dezelfde hoogt waar de redstone stof lijn van stap 6 gestopt is.
Plaats een Dropper die naar boven wijst op de redstone toorts
 
%cstart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap7a.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap7b.png?raw=true
%cend%
 
###Stap 8
 
Plaats nu een blok naast de toorts. Plaats op deze blok een comparator(vergelijker) komend uit de dropper.  
Plaats een blok tegen de uitgang van de comparator en plaats een redstone toorts tegen deze blok.  
Plaats op de grond terhoogte van de toorts een blok.   
Plaats redston stof op deze blok en leg een lijn naar de vorige blok.
 
%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap8.png?raw=true %iend%
 
###Stap 9
 
Dupliceer Dit nu aan de linker kant.
 
%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap9.png?raw=true %iend%
 
 
###Stap 10
Plaats de volgende 2 toortsen 

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap10.png?raw=true %iend%

###Stap 11
Plaats 5 hoppers in de volgende confiuratie. De pijltjes duiden de richting aan. (Indien er geen pijltjes staan is het een neerwaartse hopper.)

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap11.png?raw=true %iend%

###Stap 12

Plaats nu 3 hopper in de volgende configuratie. De pijltjes duiden de richting aan. (Indien er geen pijltjes staan is het een neerwaartse hopper.)

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap12.png?raw=true %iend%

###Stap 13

Plaats nu 2 hoppers met hun uitgang naar links en doe dit onder de hopper die naar een luchtblok wijst.

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap13.png?raw=true %iend%

Nu zijn de input en output van onze modules gemaakt.

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap13b.png?raw=true %iend%

###Stap 14

Plaats alle hoppers met de invoer naar de kist.

%cstart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap14a.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap14b.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap14c.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap14d.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap14e.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap14f.png?raw=true
%cend%
