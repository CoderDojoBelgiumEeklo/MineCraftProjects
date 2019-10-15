# Tango tek Multi item storage sytem v3 by Powasaurus Rex

?v[ https://www.youtube.com/watch?v=npjJPlH6BZQ ]v?

Het volgende systeem is een herwerking van het tango tek systeem. Met een iets kleinere redstone voetprint.

Dezelfde regels van het vorige systeem tellen hier. Dit systeem zou niet mogen blokeren bij het verlaten rn terugkomen van de chunks.

**Minstens 1 item moet aanwezig zijn.**

Met andere woorden er mag geen enkele plaats leeg zijn in de kisten.

Voordeel van dit ontwerp is dat het modulair, gemakkelijk uitbreidbaar, is.

?r[
Laten we beginnen. Open een test wereld in minecraft 1.13+.  
Op de foto's zie je een kamer met 8 modules.

Voor deze uitleg houden we het op 2 modules.  
Dit om te tonen hoe het syteem werkt en hoe we tussen modules items doorgeven.  
Een module is minimum 4 breed bij 9 lang en 12 hoog (kisten en redstone logica voor de module).  
Men moet dus nog rekening houden met invoer van items en transport tussen meerdere modules.

](
../MineCraftProjects/assets/projects/storage/tangotekv2/TangoTekStorageV2.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/TangoTekStorageRoomView.png
)r?

Laten we beginnen met de eerste module.

?l[
Begin met het bouwen van een platform van 4 bij 9. en plaats ook de kisten voor het systeem.  
Zie onderstaande afbeelding als referentie. Zoals je ziet heb je dus een constructie van in totaal 11 hoog en 4 breed en 9 lang
Eenmaal je dit geplaatst hebt kunnen we verder gaan met de bouw van dit opslag systeem.
](../MineCraftProjects/assets/projects/storage/tangotekv3/ModuleReference.png)l?

##De redstone klok

###Stap 1

?r[
Opgelet: Zoals je kan zien beginnen we een blok verder naar binnen. het circuit wordt uigelijnd op de achterste kisten. (optioneel kan je de voorste kisten verwijderen).

Plaats de volgende constructie. Vanaf de voorkant (kist kant) plaats 2 half slabs voor de bovenzijde.
Plaats als derde blok een volle blok.
Hang hier een redstone toorts op. gericht naar de binnenkant van de 10\*4.
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap1.png )r?

###Stap 2

?l[
Plaats nu een volle blok aan de voorkant naast de halve plaat.
plaats achter deze blok een repeater. met de uitgang naar de blok en de ingang aan de toorts. (De repeater zal stroom krijgen)
Verander de tick lengte van deze repeater naar 4.
Plaats nu een 2de repeater met zijn ouput naar dezelfde blok. (3de van 4 op de 10\*4).
Laat deze op 1 tick staan.
Verbind de juist geplaatste blok met redstone dust met de blok met de toorts.

Als je dit correct gedaan hebt zal de lijn beginnen knipperen.
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap2.png )l?

##De puls verlenger

###Stap 3

?r[
Plaats nu 4 vergelijkers (comparators) in volgende opstelling.
Vergeet de redstone dust niet aan de achterzijde
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap3.png)r?

###Stap 4

?l[
Plaats een blok aan de comparator waarvan de uitgang naar de kisten is gericht.
En hang hieraan een redstone toorts. Dit zal de redstone clock doen stoppen.
Vergeet ook niet om een restone dust naast de blok te plaatsen.
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap4.png)l?

##Voorbereiding voor de item lift.
 
###Stap 5

?r[
Plaats een herhaler(repeater) achter de puls verlenger. Opgelet de zijkant van de repeater wijst naar de puls verlenger.  
Deze repeater is nodig om ervoor te zorgen dat beide droppervators(liften) lang genoeg actief zijn.
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap5.png)r?

###Stap 6

?l[
Plaats nu volgende constuctie.  
Dit is een gedeelte van de lift pulsers. Dit zorgt ervoor dat onze clock actief zal zijn als er items in de lift zitten.
Vergeet de 2 nieuwe repeaters niet op 3 ticks in te stellen.
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap5.png)l?

###Stap 7

?r[Nu plaatsen we de eerste droppers en hun detectie circuit. Beide systemen zijn identiek.
gebruik de foto's hiernaast om te helpen met het plaatsen van de blokken](
../MineCraftProjects/assets/projects/storage/tangotekv3/stap7a.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap7b.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap7c.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap7d.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap7e.png
)r?

##De item liften of droppervators

##stap 8

?l[
Plaats nu nog 8 droppers boven elke van de eerste droppers. Houd er rekening mee om de laatste naar voor te richten voor de eerste kollom en voor de tweede kollom naar buiten.
](
../MineCraftProjects/assets/projects/storage/tangotekv3/stap8a.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap8b.png
)l?

##Stap 9

?r[
Nu gaan we de redstone plaatsen die de droppers zal activeren. Dit circuit kan zo hoog gaan als men wil.
de redstone dropper vators zijn klaar. Als een item in de onderste dropper steekt zal het door de lift bovenaan uitgespud worden.
](
../MineCraftProjects/assets/projects/storage/tangotekv3/stap9a.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap9b.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap9c.png
)r?

##Item lijnen

Deze lijnen voeden de 2 item liften (droppervators)

###Stap 10

?l[
Plaats een sequentie van hoppers zoals getoond op de afbeelding hiernaast. Kijk goed naar de pijltjes voor de richting van de hoppers. ](../MineCraftProjects/assets/projects/storage/tangotekv3/stap10.png)l?

###Stap 11

?r[ Plaats 2 hoppers op de hopper lijn die naar de rechter item lift gaat.
Zie de afbeelding voor de positie.
Een hopper zonder pijl is naar beneden gericht.
Men zou nu een hopper moeten hebben die gelijk loopt met de vloer blok onder de eerste kist.
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap11.png)r?

###Stap 12

?l[
Plaats nu een blok tussen de 2 hopper invoerlijnen. deze blok loopt gelijk met de onderste hopperlijn
Plaats ook 3 stukken redstone stof zoals te zien in de contifuratie
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap12.png)l?

###Stap 13

?r[
Plaats nu een verticale redstone lijn tussen de 2 hopper torens.
Met deze lijn verplaatsen we het redstone signaal van beneden naar boven.
Zie het hoofdstuk over redstone voor een voorbeeld.
](
../MineCraftProjects/assets/projects/storage/tangotekv3/stap13a.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap13b.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap13c.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap13d.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap13e.png
)r?

###Stap 14

?l[
Plaats een blok aan het klok signaal en plaats hierop een toorts.
Plaats op de toorts nog een blok.
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap14.png)l?

###Stap 15

?r[
Plaats nu het volgende circuit. Dit is onderdeel van het hopper lock systeem.
Vergeet ook de hopper extra hopper niet
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap15.png)r?

###Stap 16

?l[
Plaats nu hoppers die in de kisten lopen. Breng de hopper lijnen een hoger dan de kisten.
](
../MineCraftProjects/assets/projects/storage/tangotekv3/stap16a.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap16b.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap16c.png
)l?

##Hopper lock

###Stap 17

?r[
Nu de hoppers aan de kisten zijn geplaatst herhalen we het volgende circuit.
Start onderaan en werk af naar boven toe. Vergeet de redstone toortsen niet.
](../MineCraftProjects/assets/projects/storage/tangotekv3/stap17.png)r?

Afgewerkt:
?l[
Als alle hopper locks geplaatst zou men het volgende moeten zien.
](
../MineCraftProjects/assets/projects/storage/tangotekv3/stap17a.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap17b.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap17c.png,
../MineCraftProjects/assets/projects/storage/tangotekv3/stap17d.png
)l?

###Stap 18

?r[ Voeg nu de laatste hopperlijnen toe.
Hiermee verbinden we de droppervators met de filters.](../MineCraftProjects/assets/projects/storage/tangotekv3/stap18.png)r?

###Lag preventie.

Aangezien we hier met knipperende redstone werken kunnen we onbedoeld lag maken. Door de manier waarop minecraft en redstone werken zal bij elke
redstone update een omgevingslicht update getriggered worden. Om dit tegen te gaan verlicht men de achter en tussen de modules met tortsen , gloeisteen blokken of zeelantaarns.
Als er voldoende ander licht aanwezig is zal er geen licht update gebeuren door de knipperende redstone.

##Verbinden van 2 systemen

?l[
Om 2 systeme met elkaar te verbinden moeten we de input van de 2de module verbinden met de ouput van de eerste verbinding.
We kunnen dit bekomen door in ons voorbeeld 3 hoppers te plaatsen.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/Conn1.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Conn2.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/Conn3.png
)l?

##Extra input kisten.

?r[
We kunnen tussen 2 modules in ook een input kist plaatsen. Hierdoor kunnen we stukken van het systeem overslaan.
Dit kan van pas komen als je toch weet dat een module niet gebruikt zal worden om de gewenste items op te slaan.
De aanpassing die moet gebeuren is heel klein. Op de hopper lijn tussen de ouput en input van 2 modules kunnen we een 2de hupperlijn koppelen.
](
../MineCraftProjects/assets/projects/storage/tangotekv2/extraInput1.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/extrainput2.png
)r?
