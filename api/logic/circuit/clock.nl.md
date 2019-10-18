#Redstone klok.

Een redstone clock is een circuit dat en pulsernde signaal genereert eenmaal het gevoed wordt/
Er bestaan vershillende vormen van klokken. De meeste klokken breken door chunkloading hou hier dus rekening mee.


##Hopper klok

De hopper klok maakt gebruik van de bewwging van items in de hopper om een klok signaal te maken.

![hopperclock](../MineCraftProjects/assets/basic/redstone/HopperClock.png)
![hopperclock2](../MineCraftProjects/assets/basic/redstone/HopperClock2.png)

Deze klok heeft een kans op breken ivm chunkloading.

##Comparator klok.

Dit is een klok die niet breekt door chunkloading.
Men plaatst en vergelijker in aftel modus
De vergelijker krijgt een signaal (door een hendel, redstoneblok, door een container uit te lezen).
We gebruiken de uitgang van de vergelijker als 1 van de zij ingangen. 

![compqratorclock](../MineCraftProjects/assets/basic/redstone/comparatorClock.png)
![compqratorclock](../MineCraftProjects/assets/basic/redstone/comparatorClock2.png)


![compqratorclock](../MineCraftProjects/assets/logic/circuit/comparatorClock.png)
![compqratorclock](../MineCraftProjects/assets/logic/circuit/comparatorClock2.png)
?c(
../MineCraftProjects/assets/basic/redstone/comparatorClock.png,
../MineCraftProjects/assets/basic/redstone/comparatorClock2.png,
../MineCraftProjects/assets/logic/circuit/comparatorClock.png, +
../MineCraftProjects/assets/logic/circuit/comparatorClock2.png +
)c?


Bij elke stap vanaf de uitgang verliezen we 1 sterkte eenheid. we maken 2 stappen dus het signaal aan de vergelijk ingang is 2 laager dan het originele input signaal.
Doordat onze  vergelijker in aftel modus staat trekken we een tick later die waarde af van de ingang waardoor we een waarde krijgen van 2 aan de uitgang.
Deze signaal sterkte is te laag om de vergelijk ingang te bereiken.
Dus 1 tick later is het uitgang signaal weer op ingangs niveau waardoor we de vergelijk ingang bereiken en deze weer aftrekken van de ingang. 


Zoals vermeld bij vergelijker zit er een 1 tick redstone vertraging op de verwerking van het signaal.
Het is door deze update vertraging dat deze klok gecreerd wordt.

Het pulserende signaal dat we hier creeren kan bijvoorbeeld gebruikt worden voor een lamp te laten pulseren.


