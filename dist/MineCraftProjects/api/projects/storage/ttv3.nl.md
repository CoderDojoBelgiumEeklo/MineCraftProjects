# Tango tek Multi item storage sytem v3 by Powasaurus Rex

?v[ https://www.youtube.com/watch?v=npjJPlH6BZQ ]

Het volgende systeem is een herwerking van het tango tek systeem. Met een iets kleinere redstone voetprint.

Dezelfde regels van het vorige systeem tellen hier. Dit systeem zou niet mogen blokeren bij het verlaten rn terugkomen van de chunks.

**Minstens 1 item moet aanwezig zijn.**
 
 Met andere woorden er mag geen enkele plaats leeg zijn in de kisten.
  
 Voordeel van dit ontwerp is dat het modulair, gemakkelijk uitbreidbaar, is.  
 Laten we beginnen. Open een test wereld in minecraft 1.13+.  
 Op onderstaande foto's zie je een kamer met 8 modules. (De totale kamer bevat er 8).  
 
 ?c(
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/TangoTekStorageV2.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/TangoTekStorageRoomView.png?raw=true
 )

Voor deze uitleg houden we het op 2 modules.  
Dit om te tonen hoe het syteem werkt en hoe we tussen modules items doorgeven.  
Een module is minimum 4 bij 9 en 12 hoog (kisten en redstone logica voor de module).  
Men moet dus nog rekening houden met invoer van items en transport tussen meerdere modules.
 
Laten we beginnen met de eerste module.

Begin met het bouwen van een platform van 4 bij 9. en plaats ook de kisten voor het systeem.  
 Zie onderstaande afbeelding als referentie. Zoals je ziet heb je dus een constructie van in totaal 11 hoog en 4 breed en 9 lang
  
?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/ModuleReference.png?raw=true  )  

Eenmaal je dit geplaatst hebt kunnen we verder gaan met de bouw van dit opslag systeem.

##De redstone clock 


###Stap 1

Opgelet: Zoals je kan zien beginnen we een blok verder naar binnen. het circuit wordt uigelijnd op de achterste kisten. (optioneel kan je de voorste kisten verwijderen).

Plaats de volgende constructie. Vanaf de voorkant (kist kant) plaats  2 half slabs  voor de bovenzijde.
Plaats als derde blok een volle blok.
Hang hier een redstone toorts op. gericht naar de binnenkant van de 10*4.

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap1.png?raw=true  )


###Stap 2

Plaats nu een volle blok aan de voorkant naast de halve plaat.
plaats achter deze blok een repeater. met de uitgang naar de blok en de ingang aan de toorts. (De repeater zal stroom krijgen)
Verander de tick lengte van deze repeater naar 4.
Plaats nu een 2de repeater met zijn ouput naar dezelfde blok. (3de van 4 op de 10*4).
Laat deze op 1 tick staan.
Verbind de juist geplaatste blok met redstone dust met de blok met de toorts.

Als je dit correct gedaan hebt zal de lijn beginnen knipperen.

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap1.png?raw=true  )

##De puls verlenger

###Stap 3

plaats nu 4 vergelijkers (comparators) in volgende opstelling.
Vergeet de redstone dust niet aan de achterzijde 

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap3.png?raw=true  )

###Stap 4

Plaats een blok aan de comparator  waarvan de uitgang naar de kisten is gericht.
En hang hieraan een redstone toorts. Dit zal de redstone clock doen stoppen.
Vergeet ook niet om een restone dust naast de blok te plaatsen.

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap4.png?raw=true  )


##Voorbereiding voor de item lift.

###Stap 5

Plaats een herhaler(repeater) achter de puls verlenger. Opgelet de zijkant van de repeater wijst naar de puls verlenger.  
Deze repeater is nodig om ervoor te zorgen dat beide droppervators(liften) lang genoeg actief zijn.

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap5.png?raw=true  )

###Stap 6

Plaats nu volgende constuctie.  
Dit is een gedeelte van de lift pulsers. Dit zorgt ervoor dat onze clock actief zal zijn als er items in de lift zitten.
Vergeet de 2 nieuwe repeaters niet op 3 ticks in te stellen.

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap5.png?raw=true  )

###Stap 7

Nu plaatsen we de eerste droppers en hun detectie circuit. Beide systemen zijn identiek.

?c(
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap7a.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap7b.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap7c.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap7d.png?raw=true
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap7e.png?raw=true
)

##De droppervators

##stap 8

Plaats nu nog 8 droppers boven elke van de eerste droppers. Houd er rekening mee om de laatste naar voor te richten voor de eerste kollom en voor de tweede kollom naar buiten.

?c(
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap8a.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap8b.png?raw=true
)

##Stap 9

Nu gaan we de redstone plaatsen die de droppers zal activeren. Dit circuit kan zo hoog gaan als men wil.
de redstone dropper vators zijn klaar. Als een item in de onderste dropper steekt zal het door de lift bovenaan uitgespud worden.

?c(
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap9a.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap9b.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap9c.png?raw=true
)

##Item lijnen

###Stap 10

Plaats nu de volgende hopper lijnen. Kijk goed naar de pijltjes voor de richting van de hoppers.

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap10.png?raw=true  )

###Stap 11

Plaats nog 2 hoppers. Een hopper zonder pijl is naar beneden gericht.


?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap11.png?raw=true  )


###Stap 12

Plaats nu een blok tussen de 2 hopper invoerlijnen. plaats nu ook 3 stukken redstone stof zoals te zien in de contifuratie

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap12.png?raw=true  )


###Stap 13

Plaats nu een redstone lijn tussen de 2 hopper torens.

?c(
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap13a.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap13b.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap13c.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap13d.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap13e.png?raw=true
)

###Stap 14

Plaats nu een blok aan het clock signaal en plaats hierop een toorts. plaats op de toorts nog een blok.

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap14.png?raw=true  )

###Stap 15

Plaats nu het volgende circuit. Dit is onderdeel van het hopper lock systeem.
Vergeet ook de hopper extra hopper niet

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap15.png?raw=true  )

###Stap 16


Plaats nu hoppers die in de kisten lopen. Breng de hopper lijnen een hoger dan de kisten.

?c(
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap16a.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap16b.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap16c.png?raw=true
)

##Hopper lock

###Stap 17

nu gaan we het volgende circuit herhalen.

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap17.png?raw=true  )

Afgewerkt:
?c(
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap17a.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap17b.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap17c.png?raw=true,
 https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap17d.png?raw=true
)

###Stap 18

Voeg nu de laatste hopperlijnen toe.

?r[ ](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv3/stap18.png?raw=true  )


###Lag preventie.

Aangezien we hier met knipperende redstone werken kunnen we onbedoeld lag maken. Door de manier waarop minecraft en redstone werken zal bij elke 
redstone update een omgevingslicht update getriggered worden. Om dit tegen te gaan verlicht men de achter en tussen de modules met tortsen , gloeisteen blokken of zeelantaarns.
Als er voldoende ander licht aanwezig is zal er geen licht update gebeuren door de knipperende redstone.

##Verbinden van 2 systemen

Om 2 systeme met elkaar te verbinden moeten we de input van de 2de module verbinden met de ouput van de eerste verbinding.
We kunnen dit bekomen doot in ons voorbeeld 3 hoppers te plaatsen.

?c(
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Conn1.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Conn2.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/Conn3.png?raw=true
)

##Extra input kisten.

We kunnen tussen 2 modules in ook een input kist plaatsen. Hierdoor kunnen we stukken van het systeem overslaan.  
Dit kan van pas komen als je toch weet dat een module niet gebruikt zal worden om de gewenst items op te slaan.
De aanpassing die moet gebeuren is heel klein. Op de hopper lijn tussen de ouput en input van 2 modules kunnen we een 2de hupperlijn koppelen.


?c(
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/extraInput1.png?raw=true,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/TSSite/src/assets/projects/storage/tangotekv2/extrainput2.png?raw=true
)
