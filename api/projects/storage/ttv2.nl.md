#Tango Tek Multisorting storage system V2.0

?v[
https://www.youtube.com/watch?v=wsNV9Mo00Gw
]

Onze eerste opslag systeem. Zoals je kan zien aan de titel is dit de 2de versie van dit opslag systeem.
Dit was een versie oorspronkkelijk voor 1.12, dus geen mogelijkheid om meerdere kisten naast elkaar te zetten.

De belangrijkste regel in dit systeem.  

**Minstens 1 item moet aanwezig zijn.**
 
Met andere woorden er mag geen enkele plaats leeg zijn in de kisten.
  
Voordeel van dit ontwerp is dat het modulair, gemakkelijk uitbreidbaar, is.  
Laten we beginnen. Open een test wereld in minecraft 1.13+.  
Op onderstaande foto's zie je een kamer met 8 modules. (De totale kamer bevat er 8).  
 

 
Voor deze uitleg houden we het op 2 modules.  
Dit om te tonen hoe het syteem werkt en hoe we tussen modules items doorgeven.  
Een module is minimum 4 bij 9 en 12 hoog (kisten en redstone logica voor de module) hierbij moet men dus nog rekening houden met invoer van items en transport tussen meerdere modules.
 
 ?r[
 Laten we beginnen met de eerste module.
  
 Begin met het bouwen van een platform van 4 bij 9. en plaats ook de kisten voor het systeem.
 Zie onderstaande afbeelding als referentie. Zoals je ziet heb je dus een constructie van in totaal 11 hoog en 4 breed en 9 lang
 ](
 ../MineCraftProjects/assets/projects/storage/tangotekv2/ModuleReference.png
 )


Eenmaal je dit geplaatst hebt kunnen we verder gaan met de redstone gedeeltes.

## De redstone clock

###Stap 1

?l[Ga naar de achterkant van het systeem plaats en plaats in de rechterhoek onder de muur een blok op de grond met daar een redstone toorts op
](../MineCraftProjects/assets/projects/storage/tangotekv2/Stap1.png)


###Stap 2

?r[
Plaats een blok direct naast de vorige blok. Deze blok wordt naar de achterkant van de module geplaatst
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap2.png
)

###Stap 3

?l[
Plaats redstone stof op de 2 blok. dit wordt dan direct gevoed door de toorts en han een redstone toorts aan de andere kant van de blok die een positie hoger hangt. Zie Afbeelding
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap3.png
)

###Stap 4
?r[
Plaats een repeater onder de blok en zet deze op 4 ticks. en plaats een stuk redstone dust acher deze repeater.
Dit is een clock circuit. eenmaal de eerste redstone torch geen kracht meer geeft zal  de clock in werking komen.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap4.png
)


###Stap 5
?l[
Plaats een repeater tegen de block van de eerste redstone torch. Laat deze op 1 tick staan.  
Plaats een blok naast deze repeater gevolgd door een stuk redston stof.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap5.png
)

###Stap 6
?r[
Plaats nu 2 vergelijkrers met hun uitgang naar de blok en plaats daarnaast aan de uiterst links kant 2 comparators in de omgekeerde richting.  
Verbindt de ingang en uitgang met elkaar aan de zijde die het verst weg is van de kisten. en verleng met nog 2 stukjes redstone stof.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap6.png
)

##Stap 7 (De item lift)
?l[
Plaats een blok met redstone stof aan de meest rechtsekant van de constructie. Plaats deze blok op dezelfde hoogt waar de redstone stof lijn van stap 6 gestopt is.
Plaats een Dropper die naar boven wijst op de redstone toorts
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap7a.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap7b.png
)

###Stap 8
 ?r[
 Plaats nu een blok naast de toorts. Plaats op deze blok een vergelijker komend uit de dropper.  
 Plaats een blok tegen de uitgang van de comparator en plaats een redstone toorts tegen deze blok.  
 Plaats op de grond terhoogte van de toorts een blok.   
 Plaats redston stof op deze blok en leg een lijn naar de vorige blok.
 ](
 ../MineCraftProjects/assets/projects/storage/tangotekv2/Stap8.png
 )

###Stap 9
 
 ?l[
 Plaats een blok naast de redstone stof lijn. daar waar deze endigt.
 Plaats op deze blok een toorts.
 plaats nu een dropper op deze toorts.
 Dupliceer nu  de rest van stap 8
 - Plaats nu een blok naast de toorts. Plaats op deze blok een vergelijker komend uit de dropper.  
 - Plaats een blok tegen de uitgang van de comparator en plaats een redstone toorts tegen deze blok.  
 - Plaats op de grond terhoogte van de toorts een blok.   
 - Plaats redston stof op deze blok en leg een lijn naar de vorige blok.
 ](
 ../MineCraftProjects/assets/projects/storage/tangotekv2/Stap9.png
 )

###Stap 10
?r[
plaats nu de 2 toortsen aangeduid op de tekening.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap10.png
)


###Stap 11
?l[
Plaats 5 hoppers in de volgende confiuratie. Om aan te duiden wat de richting is staan er pijltje op de hopper. 
De pijl toont waar de uitgang van de hopper naar toe wijst. indien er geen pijl is wijst de uitgang naar onder.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap11.png
)

###Stap 12
?r[
Plaats nu 3 hopper in de volgende configuratie. Zie ook nu weer naar de pijltjes om de richting van de uitgang te bepalen.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap12.png
)

###Stap 13

?l[
Plaats nu 2 hoppers met hun uitgang naar links en doe dit onder de hopper die naar een luchtblok wijst.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap13.png
)

?r[
Nu zijn de input en output van onze modules gemaakt.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap13b.png
)



###Stap 14
?l[
    plaats nu op elke kist een hopper. waarbij de uitvoer naar de kist wijst.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap14a.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap14b.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap14c.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap14d.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap14e.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap14f.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap14g.png
)

##Stap 15
?r[
In stap 3 hebben we een redstone toorts geplaats.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap3.png
)

?l[
Plaats nu een blok boven deze toorts.
plaats naast deze blok 3 slabs in een L configuratie. 
Zorg ervoor dat de bonvenkanten gelijklopen.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap15.png
)

###Stap 16
?r[
Plaats  nu een redstone block op de slab onder de kist.  
Plaats een blok op de slab naast de redstone.  
Plaats een repeater tegen de blok op de laatste vrije slab. De richting van de uitgang is naar de blok.
Zie de afbeelding hiernaast voor verduidelijking
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap16a.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap16b.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap16c.png
)

###Step 17
?l[
Ga naar de andere kant van de module en plaats een blok op de output hopper en plaats 2 slabs op dezelfde hoogte als de dropper.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap17.png
)

###Stap 18
?r[
Plaats een repeater in de richting van de blok. Verbind deze repeater en die aan de andere kant met elkaar dmv redstone.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap18.png
)


###Stap 19
?l[
Plaats op de 2 centrale hoppers 2 volle blokken.  
Plaats aan beide zijden in de richting van de kisten 2 slabs.  
Plaats een volle blok naast de hoppers. Er mot dus een opening zijn.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap19.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap19b.png
)


###Stap 20
?r[
Plaats een repeater in de richting van van elke blok.  
Verbind deze met redstone stof.  
Aan de binnenzijde plaatst men 2 redstone toortsen.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap20a.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap20b.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap20c.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap20d.png
)


###Stap 21

?l[
Herhaal het patroon van stap 19 en 20 no twee maal.
Hierdoor moet men hetzelfde zien als in de afbeelding.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap21a.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap21b.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap21c.png
)

###Stap 22
?r[
Maak nu de 'droppervator' door nog 7, naar bovengerichte, droppers op elk van de de huidige droppers te plaatsen.
Plaats nu boven aan de droppervator een dropper met de uitgang naar de kisten gericht.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap22a.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap22b.png
)


###Stap 23
?l[
Maak een verbinding van de droppers naar hun input hopper.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap23.png 
)


###Stap 24
?r[
Plaats nu een paar blokken tussen de hoppers die aan de droppers staan.  
Plaats aan de voorzijde van de blok een paar redstone toortsen.  
Deze zouden in lijn moeten zijn met de toortsen van de blokken daaronder
Plaats boven op de blokken een stukje redstone dust.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap24a.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap24b.png
)



###Stap 25
?l[
Verbind de restone van de droppervator met de redstoneclock.  
Ga naar de achterkant van de installatie. Maak tussen de 2 dropper Kolommen een opwaarts redstone traject.  
Doe dit door alternerend de bovenste slab te plaatsen aan een van de 2 kanten. en hierop een redstone stof te leggen. 
Plaats op de invoer hopper van de 2 de droppervator een stuk redstone. Dit verbind de volledig toren met het clock signaal.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap25.png
)

###Stap 26
?r[
Maak nu een toren van blokken en toortsen zoals in de afbeelding. De hoogste blok moet gelijk lopen met de hoogste droppers.
Plaats ook alle redstone toortsen zoals in de afbeelding.  
Alle toortsen aan de binnenkant zouden moeten branden.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap26a.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap26b.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap26c.png
)


###Stap 27
?l[
De laatste stap.  
Plaats nu toortsen op de buitenste witte blokken gericht naar de droppers. Dit is per kolom een totaal van 4 toortsen.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap27a.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Stap27b.png
)

##Module 1 is klaar

?r[
Onze module is nu klaar.

Bouw een 2de module aan de rechterkant naast de eerste module. laat 1 blok plaats tussen de 2 modules. 
](
../MineCraftProjects/assets/projects/storage/tangotekv2/DualModule.png
)

##Lag preventie.

Aangezien we hier met knipperende redstone werken kunnen we onbedoeld lag maken. Door de manier waarop minecraft en redstone werken zal bij elke 
redstone update een omgevingslicht update getriggered worden. Om dit tegen te gaan verlicht men de achter en tussen de modules met tortsen , gloeisteen blokken of zeelantaarns.
Als er voldoende ander licht aanwezig is zal er geen licht update gebeuren door de knipperende redstone.


##Verbinden van 2 systemen

?l[
Om 2 systeme met elkaar te verbinden moeten we de input van de 2de module verbinden met de ouput van de eerste verbinding.
We kunnen dit bekomen doot in ons voorbeeld 3 hoppers te plaatsen.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Conn1.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Conn2.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Conn3.png
)

##Extra input kisten.
?r[
We kunnen tussen 2 modules in ook een input kist plaatsen. Hierdoor kunnen we stukken van het systeem overslaan.  
Dit kan van pas komen als je toch weet dat een module niet gebruikt zal worden om de gewenst items op te slaan.
De aanpassing die moet gebeuren is heel klein. Op de hopper lijn tussen de ouput en input van 2 modules kunnen we een 2de hupperlijn koppelen.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/extraInput1.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/extrainput2.png
)

###strucuur bestand

een afgewertke versie van TangoTek multi item sorting systeem.
[download](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/projects/storage/tangotekv2/ttv2Structure.zip)
