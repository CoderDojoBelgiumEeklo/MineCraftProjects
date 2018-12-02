#Redstone vergelijker

De vergelijker is een redstone apparaat dat 2 verschillende redstone signalen kan verwerken.  
Als er geen "vergelijk" signaal is aangelsoten zal de vergelijker een signaal van de zelfde sterkte uitsturen als er binnenkomt.

![vergelijker2](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/img/basic/comparator/comparator.png?raw=true)

Het apparaat heeft 2 modussen:
- Een vergelijk mode, te herkennen aan het feit dat de voorste toorts niet is opgelicht.   
![Vergelijk](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/img/basic/redstone/redstonecomparatorcompare.png?raw=true)   
- De aftel mode, te herkennen aan het feit dat de voorste toorts die is opgelicht.   
![Substract](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/img/basic/redstone/redstonecomparatorsubstract.png?raw=true)   

Men kan het apparaat van modus laten wisselen door met de rechts te klikken op de voorste toorts.

##Doe het zelf

Bouw het volgende mechanisme 2 keer maar plaats een van de vergelijkers in de vergelijk mode en de andere in de aftel mode.
![Substract](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/img/basic/redstone/comparatortestcircuit.png?raw=true)

Met dit redstone apparaat kan je testen wat de verschillen zijn tussen de 2 modusen.

###Vergelijken
Eerst kijken we naar de vergelijk modus

Als het signaal op de verglijk ingang  lager of gelijk is aan de signaal sterkte van de ingang dan hebben we een gevoede uitgang.
De signaal sterkte aan de uitgang is even hoog als de signaal sterkte aan de ingang.

Test dit uit met het vergelijk mechanisme.



###Aftellen
Doe nu hetzelfde bij het mechanisme van de aftelmodus.

Het signaal aan de zijkant wordt afgeteld van het inkomende signaal.
Als de signaalsterkte aan de zijkant even hoog of hoger is dan aan de ingang dan is er geen actieve uitgang.
Anders gezegd de sterkte van het uitgangssignaal is de aftelling van het signaal aan de ingang min het signaal aan de zijkant.


##Uitlezen 
Een andere eigenschap van dit apparaat is het uitlezen van containers.

![Kist](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/img/basic/redstone/kistvergelijker.png?raw=true)

De vergelijker kan dit ook doen met een blok voor de container.

![Kist2](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/img/basic/redstone/kistmetblokvergelijker.png?raw=true)

Volgende items kunnen uitgelezen worden met een vergelijker
- Fornuis,  
- Brouwerij,   
- Hopper,   
- Hopperwagen op detector spoor,    
- Dispenser,    
- Dropper,   
- Chest,    
- Trapped chest,    
- Mijnkar met kist op detectorrail, 
- Cake, 
- Ketel, 
- Commandoblok, 
- Eind portaal frame,
- Item frame, 
- Nootblok, 
- Chulker doos (minecrqft 1.11)


### Het nerdie spul

Het bepalen van de uitgang sterkte wordt geaan met de volgende formule:   
```
signaal sterkte = geheel(1 + (( Som('Slot volheid' )) / (aantal sloten in de container)) * 14)
'Slot volheid' = (aantal items in het slot) / (max stack groote van item)
```

Een paar nuttige weetjes/mechanismes:

- Een vergelijker heeft dezelfde vertraging als een versterker op (1 tick vertraging)


Een paar mechanismes met comparator:

-Redstone klok. 

![camparatorklok](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/img/basic/redstone/redstonecomparatorklok.png?raw=true)

-Puls extender 

![camparatorklok](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/img/basic/redstone/pulsextender.png?raw=true)

-geautomatiseerde dropper circuit 

![camparatorklok](https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/img/basic/redstone/autodispenser.png?raw=true)

Voor meer info:
[Mumbo jumbo](https://www.youtube.com/watch?v=w_ZFRV6AT6E)
