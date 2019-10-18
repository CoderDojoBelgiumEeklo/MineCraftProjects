#Versterker

?c(../MineCraftProjects/assets/basic/redstone/repeater.png)c?

Een Redstone-Repeater heeft drie hoofd functies: het is een versterker, een diode, en een vertrager.
Het blok herhaalt de signalen die het ontvangt als een netwerkbrug, zodat het niet langer nodig is elke 15 blokken
twee not-gates te gebruiken. Signalen worden enkel in sommige richtingen aanvaard, wat er voor zorgt dat het blok 
meer als diode werkt in een elektrisch circuit. Het vertraagt ook het signaal door de 1-4 tikken (instelbaar),  
zodat lange tijd circuits der regelaars niet langer meer nodig zijn voor tijd mechanismen. 


##Gebruik   
De versterker heeft meerdere gebruiken vanwege zijn complexe aard. Iedere mogelijke functie wordt hieronder beschreven. Deze functies kunnen worden benut samen met het verminderen van het vereiste aantal versterkers in een circuit.    
   
   
##Versterker
De voornaamste functie van de versterker is om het passerende redstone signaal te "verversen", waardoor het door nog eens 16 blokken kan stromen. Voorheen kon dit alleen bereikt worden met een/twee niet-poorten (not-gates). Een versterker kan ook een signaal vast houden door een andere versterker tegen de zijkant van de eerste te plaatsen en die te voeren met redstone. Hierdoor ontstaat een "repeater lock", die het signaal vast houdt die in de eerste versterker kwam.    
   
   
##Als Kabel/Diode
De versterker aanvaardt alleen aan de achterkant invoer (dichtstbijzijnde kant als men hem plaatst) en stuurt slechts vooraan uitvoer (de overkant). Hij heeft geen interactie met omliggende ruimten. Dit maakt hem zeer nuttig in dicht opeengepakte circuits.


Alle volgenden kunnen dienen als invoer voor een versterker als ze er direct achter zijn geplaatst:

- Een stuk redstone kabel, die zich (vanaf 1.7) direct aan de versterker hecht
- Een redstone fakkel
- Een blok door kabel of een andere methode opgeladen.
- Elk type schakelaar (hendel, knop, drukplaat, enz.)
- Een andere versterker, wijzend in de zelfde richting
- Een redstone blok

Alle volgenden kunnen de uitvoer van een versterker ontvangen als ze er direct voor zijn geplaatst:

- Een stuk redstone kabel, ongeacht de richting
- Elk type blok dat kan worden opgeladen (Die zal de lading dan op de zelfde manier verspreiden als bij het plaatsen over een fakkel)
- Een blok door kabel of een andere methode opgeladen.
- Elk type schakelaar (hendel, knop, drukplaat, enz.)
- Een andere versterker, wijzend in de zelfde richting

Opmerkelijk versterker gedrag omvat:

- Een blok dat de versterkers uitvoer ontvangt verspreid daarna direct de lading (op de zelfde manier als bij het plaatsen over een fakkel)
- Een enkel stuk redstone kabel wat de versterkers uitvoer ontvangt kan direct de 'straight-up-to-the-block' regel omzeilen. Standaard zal het kruis-vormig verschijnen en kan tot drie blokken inschakelen.

Met ingang van de Beta 1.3 uitgave, vertoont een apparaat recht voor een versterker geplaatst vreemd gedrag. Als de invoer van de versterker een redstone kabel of fakkel is, lijkt het effect op het apparaat te worden omgekeerd. En wanneer de invoer iets anders is wordt het apparaat helemaal niet beïnvloed door de versterker. Als versterker en apparaat door kabels zijn verbonden, werkt alles zoals verwacht.

Een andere fout in de Beta 1.3 uitgave is dat de versterkers falen met het bijwerken van stand als hun invoer een blok is, opgeladen door een redstone kabel, met het naastliggende stuk kabel vernield. Als de kabel die de versterker voed wordt vernietigd, zal de versterker aan blijven tot er iets anders gebeurd wat een bijwerking veroorzaakt. Zoals het plaatsen van een blok ernaast.

##Als Klok/Vertrager
Door recht te klikken op de versterker, kan men de vertraging in stellen van één tot vier tienden van een seconde. Langere vertragingen kunnen worden gemaakt met meerdere versterkers; bijvoorbeeld, twee versterkers ingesteld op '4' en nog één op '2' zullen 1 seconde vertraging opleveren.

Versterkers vereenvoudigingen de aanleg van vertragingslijnen aanzienlijk en bieden veel korreligere tijdmeting dan een reeks redstone fakkels. Bijvoorbeeld, een versterker met een lange lijn van redstone voor vertraging loopt sneller dan hetzelfde ontwerp met bij elke vier stukken redstone een versterker, waardoor compactere vertraging ontstaat.

Voorheen was de simpelst mogelijke klok een "5-klok". Gemaakt door vijf redstone fakkels te koppelen (met eigenlijk 10 tikken- 5 aan en 5 uit). Deze zelfde klok kan thans worden toegepast met slechts één fakkel en één versterker, verbonden in een lus met de versterker (/vertrager) ingesteld op 4 (de hoogste stand). De vertraging instellen op 3 geeft een 4-klok, die fiks wat bekabeling vereist om van fakkels alleen te maken.


>Bron:
>[Minecraftpedia](https://minecraft.gamepedia.com/repeater)
