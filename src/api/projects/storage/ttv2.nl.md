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
 Een module is minimum 4 bij 9 en 12 hoog (kisten en redstone logica voor de module) hierbij moet men dus nog rekening houden met invoer van items en transport tussen meerdere modules.
 
 
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
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap14f.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap14g.png?raw=true
%cend%

##Stap 15

Plaats een blok boven de redstone toorts geplaatst in stap 2.    
Plaats nu 3 slabs in een l configuratie.

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap15.png?raw=true %iend%

###Stap 16
Plaats  nu een redstone block op de slab onder de kist.  
Plaats een blok op de slab naast de redstone.  
Plaats een repeater tegen de blok op de laatste vrije slab. (richting van de uitgang is naar de blok)

%cstart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap16a.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap16b.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap16c.png?raw=true
%cend%

###Step 17

Ga naar de andere kant van de module en plaats een blok op de output hopper en plaats 2 slabs op dezelfde hoogte als de dropper.

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap17.png?raw=true %iend%

###Stap 18
Plaats een repeater in de richting van de blok. Verbind deze repeater en die aan de andere kant met elkaar dmv redstone.

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap18.png?raw=true %iend%

###Stap 19
Plaats op de 2 centrale hoppers 2 volle blokken.  
Plaats aan beide zijden in de richting van de kisten 2 slabs.  
Plaats een volle blok naast de hoppers. Er mot dus een opening zijn.

%cstart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap19a.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap19b.png?raw=true
%cend%

###Stap 20

Plaats een repeater in de richting van van elke blok.  
Verbind deze met redstone stof.  
Aan de binnenzijde plaatst men 2 redstone toortsen.

%cstart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap20a.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap20b.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap20c.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap20d.png?raw=true
%cend%

###Stap 21

Herhaal dit nog 2 maal.


%cstart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap21a.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap21b.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap21c.png?raw=true
%cend%

###Stap 22

Maak nu de de 'droppervator' door nog 7, naar bovengerichte, droppers op elk van de de huiige droppers te plaatsen.
Plaats nu boven aan de droppervator een dropper met de uitgang naar de kisten gericht.

%cstart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap22a.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap22b.png?raw=true
%cend%

###Stap 23

Maak een verbinding van de droppers naar hun input hopper.

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap23.png?raw=true %iend%

###Stap 24

Plaats nu een paar blokken tussen de hoppers die aan de droppers staan.  
Plaats aan de voorzijde van de blok een paar redstone toortsen.  
Deze zouden in lijn moeten zijn met de toortsen van de blokken daaronder
Plaats boven op de blokken een stukje redstone dust.

%cstart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap24a.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap24b.png?raw=true
%cend%

###Stap 25

Verbind de restone van de droppervator met de redstoneclock.  
Ga naar de achterkant van de installatie. Maak tussen de 2 dropper Kolommen een opwaarts redstone traject.  
Doe dit door alternerend de bovenste slab te plaatsen aan een van de 2 kanten. en hierop een redstone stof te leggen. 
Plaats op de invoer hopper van de 2 de droppervator een stuk redstone. Dit verbind de volledig toren met het clock signaal.

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap25.png?raw=true %iend%


###Stap 26

Maak ne uun toren van blokken en toortsen zoals in de afbeelding. De hoogste blok moet gelijk lopen met de hoogste droppers.
Plaats ook alle redstone toortsen zoals in de afbeelding.  
Alle toortsen aan de binnenkant zouden moeten branden..

%cstart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap26a.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap26b.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap26c.png?raw=true
%cend%

###Stap 27

De laatste stap.  
Plaats nu toortsen op de buitenste witte blokken gericht naar de droppers. Dit is per kolom een totaal van 4 toortsen

%cstart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap27a.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Stap27b.png?raw=true
%cend%

Onze module is nu klaar.

Bouw een 2de module aan de rechterkant naast de eerste module. laat 1 blok plaats tussen de 2 modules. Indien je een 

##Lag preventie.

Aangezien we hier met knipperende redstone werken kunnen we onbedoeld lag creeren. Door de manier waarop minecraft en redstone werken zal bij elke 
redstone update een omgevingslicht update getriggered worden. Om dit tegen te gaan verlicht men de achter en tussen de modules met tortsen , gloeisteen blokken of zeelantaarns.
Als er voldoende ander licht aanwezig is zal er geen licht update gebeuren.

%istart% https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/DualModule.png?raw=true %iend% 

##Verbinden van 2 systemen
