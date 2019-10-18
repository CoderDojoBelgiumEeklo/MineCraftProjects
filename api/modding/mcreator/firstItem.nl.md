#Ons eerste item

##Wat is een item

Een item in minecraft is een object dat niet rechtstreeks in de wereld kan geplaatst worden. Het bestaat enkel in inventarissen en spelers handen.

## laten we starten

Laten we ons eerste item aanmaken. kies een werkruimte op het hoofdscherm en wacht tot dit is ingeladen.

Eenmaal de werkruimte is ingeladen hernoem deze naar "MijnCoderDojoMod".

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/startupcompleted.PNG
 )

Als eerste item in onze mod gaan we een metalen staaf maken.

##Stap 1: Maken van de afbeelding.

Voor we ons metalen staaf maken moeten we de afbeelding maken die we gaan gebruiken.

Ga naar de tools tab.

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/toolstab.PNG
 )

Klik op Create Item/Block Texture.

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/toolsnewtexture.PNG
 )

We krijgen nu de bovenstaande interface te zien. Deze interface kunnen we op een gemakkelijke manier de afbeelding maken voor onze staaf.
Zoal je ziet is er standaard een afbeelding gemaakt die op een erts lijkt.

###Doe:

- Zorg er voor dat by "Layer 2" in plaats van "ore" op "ingot" staat.
- Verander op "Layer 1" de "stone" ook naar ingot .
- Kies nu een kleur op layer 2 door op de knop met de 3 puntjes te klikken.

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot.PNG
 )

- Klik nu op de tekst use.
- Op de pop-up kies de knop "Item".

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/texturetypeselection.PNG
 )

- Geef nu de naam in voor het item. Om de afbeelding een naam te geven gebruiken we een conventie waarbij de name van het item en de naam van de afgeelding gelijklopend zijn.
Geef de volgende naam in "coderdojo_ingot". we gebruiken "_ingot" om aan te duiden dat het om een afbeelding van een staaf gaat.

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/workspacemodelementscreateitemname.PNG
 )

-Klik op OK
-Klik nu op Exit.

In het overzicht zien we nu onze afbeelding staan
%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/workspacetexture1.PNG
 )



##Stap 2: Maken van het de bar 

Ga terug naar "Mod elements" en klik op het grote kruis.
Kis nu voor het menu  met de naam "item".

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/workspacemodelementscreateitem.PNG
 )

We krijgen nu een pop-up waarin we ons item kunnen aanmaken. We zullen ons item "CoderDojo_Ingot" noemen.
Vul dit in en klik op "Create new item"


%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/workspacemodelementscreateitemname.PNG
 )

We krijgen nu het eerste configuratie scherm te zien. Hierin bepalen we de afbeelding van onze staaf, op welke manier de staaf  door minecraft gerendered wordt.

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemcoderdojoingot.PNG
 )

###Doe:

- Klik op op het witt vlak boven "Item texture".
- Kies de afbeelding die je juist hebt toegevoegd en klik op select.

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/textureselection.PNG
 )

- Voor de rest moeten men niets instellen.

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot1.PNG
 )

- Klik op de "Next" knop.
- Nu configureren we wat standaard zaken voor onze metalen staaf.

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot2.PNG
 )

  * Naam van onze staaf in minecraft: We kiezen hier voor "CoderDojo Ingot"
  * Creative inventory tab: in welke tab moet ons item verschijnen
  * stack size: Hoevel items passen er in 1 stack
  * Enchantibility Wat is het niveau voor de betoveringen (Goud heeft een niveau van 22 voor gereedschap en 25 voor pantser, ijzer heeft een nieveau van 14 voor gereedschap en 9 voor pantser). Hoe hoger dit getal hoe beter de betoveringen kunnen zijn.
  Aangezien dit een een gewone staaf is hebben we geen betovering nodig.
  * Max usage duration : niet van toepassing voor de staaf. Dit is hoeveel keer we ons stuk kunnen gebruiken.
  * Type of tool: wat is het tpye van gereedschap, 1 geen gereedschap, 1.5 zwaard, groter dan 2 een gereedschap
  * item damage count: niet van toepassing, onze staaf doet geen schade.
  * Can destroy any block: niet van toepassing; indien dit actief is zal onze staaf alle blokken in het spel kunnen verwijderen, inclusief bedrock
  * Does item stay in crafting grid when crafted: Wordt het item verbruikt als het een onderdeel is van een recept
  * Can be dropped as grass seed: moet er een kans bestaan dat het verwijderen van grass dit item teruggeeft. zoals met zaden gebeurd.
 - klik op Next
 
 Nu komen we op een scherm waar we ons item kunnen laten reageren op zaken die in het spel gebeuren.
 
%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot3.PNG
 )

We gaan onze bar chatberichten laten geven wanneer we in de lucht kliken en wanneer we op een block klikken.

###Doe:
- Zoek de tekst When right clicked in air(player loc.)
- Standaard krijgen we voor deze actie de x,y en z locatie van de speler, de wereld waarin het gebeurd, de entitie die de actie uitvoerd en de itemstack waartoe onze "CoderDoko Ingot" behoort.
- Klik op het plusje naast (no procedure)
- Nu krijgen we een blockly/scratch interface waarin we kunnen programeren 

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot3.PNG
 )

  * Hierin Sie je standaard een 'event trigger- triggered by external call' dit is het start punt van onze programeer boom.
- Klik op player management
- Zoek nu naar 'Send message to provided entity'

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot4.PNG
 )

- Sleep dit onder de start blok
- Vul een bericht in
- Zet de "show in action bar" op true

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot5.PNG
 )

- Klik op "add procedure" => let op de naam links van de knop.

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot6.PNG
 )

- zoals je ziet is onze interface aangepast; we zien  dat "world" en "entity" een kleur hebben gekregen. 
  * Dit omdat we afhankelijk zijn van deze minecraft objecten.
- Waar voorheen "(no procedure)" staat zie je nu de naam van de procedure die we gemaakt hebben in de vorige stap.

- Doe nu hetzelfde voor "When right clicked on block(hand loc.) . Geef een andere tekst in en zet de "show in action bar" op false.

- Klik op 'Next'


Ons eerste item is nu gemaakt.

%istart%
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot7.PNG
 )

Natuurlijk moeten we dit testen dus klik op de "play knop" => ronde knop met het driehoekje.
Je zal naast de "Console" tekst een groen puntje zien verschijnen. Dit geeft aan dat de mod aan het bouwen is.

Als alles correct is uitgevoerd zal er een minecraft isntantie opstarten met je mod in.
  * Dit is een afgezonderde minecraft instantie. Je zal geen werelden terug vinden van je eigen speel instanties.

Maak een nieuwe wereld aan in creative/creatief.
Zoek ons item op in de diversen tab van het creatief menu.
Als je nu klikt in de lucht of op een blok zal je de tekst zien verschijnen.

?c(
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot8.PNG,
https://github.com/CoderDojoBelgiumEeklo/MineCraftProjects/blob/gh-pages/assets/modding/mcreator/newitemingotcoderdojoingot9.PNG
)c?



 ##Ons eerste item is klaar.
