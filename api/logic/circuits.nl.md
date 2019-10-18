#Poorten & circuits


Naarmate men meer leert over redstone, zal men op zoek gaan naar goede ontwerpen voor verschillende logische poorten.
Hier vind u een overzichtje van  deze zaken.

##Legende
- Blauwe blokken = ingang
- Rode blokken = output
- Zwarte blokken = onderdeel van het circuit
- Als je het niet kan zien is het niet aanwezig
- Verticala ontwerpen zijn tegen een muur gebouwd voor betere zichtbaarheid
- Sommige ontwerpen vereisen dat er een versterker gebruikt wordt voor de input, dit wil zeggen dat je er niet zomaar een draad in kan laten lopen. Dit wordt "Sterk vermogen" genoemd
- indien niet anders vermeld zijn versterkers ingesteld op 1 tick vertraging (of het doet er niet toe)
- ![twee](https://i.imgur.com/xDeEN1Q.jpg) \ ![drie](https://i.imgur.com/1Uh1lkD.jpg) \ ![vier](https://i.imgur.com/j6QU4uC.jpg) - aantal ticks vertraging van de versterker
- ![kleefzuiger](https://i.imgur.com/1m8FXnS.jpg) - kleefzuiger
- ![Zuiger](https://i.imgur.com/MJOStyk.jpg) - Zuiger
- ![Hopperrichting](https://i.imgur.com/YtOQERb.jpg) - Richting van de trechter/dropper
- ![aantalItems](https://i.imgur.com/4y5H7vX.jpg) - Geeft een indicatie van het aantal items in een container. Niet stapelbaar, tenzij anders vermeld

- Dit is een vertaling van een forum pagina. zie de minecraft forums voor de originele versie [bron](https://www.minecraftforum.net/forums/minecraft-java-edition/redstone-discussion-and/351967-ultimate-collection-of-redstone-circuits)

##poorten

Een poort is een circuit dat geen interne staat heeft (geen geschidenis, geen geheugen), maw de ingang(en) bepalen de status van de uitgang(en). Dit is vergelijkbaar met een wiskundige formule.

We starten meestal met poorten met 2 ingangen en 1 uitgang omdat dit de gemakkelijkste zijn - dit is ook bekend als binaire Booleaanse bewerkingen / functies (opgelet: deze "binaire" verwijst naar twee ingangen, niet dat er twee toestanden zijn). 
De verschillende poorten hebben naman als: EN (AND), N-EN (NAND), OF (OR), N-OF (NOR), NIET (NOT), X-Of (XOR), X-N-OF (XNOR) 

Van de 4 = 2 ^ 2 ^ 1 mogelijke unaire poorten, dwz poorten met 1 invoer en 1 uitvoer, is alleen NIET interessant genoeg om een veel gebruikte naam te hebben, de andere 3 zouden een langere omschrijvende naam nodig hebben "constant uit zijn, de invoer negeren", "constante op "en" output hetzelfde als de invoer ".

Een waarheidstabel is een compacte manier om alle gevallen op te schrijven die kunnen voorkomen, dus dit is hoe poorten vaak worden gedefinieerd.
Hieronder zie je een voorbeeld voor een en-poort met 3 ingangen en 1 uitgang

![TruthTable]()

Sommige poorten zijn een stuk gemakkelijker te realiseren dan andere, afhankelijk van de "hardware" waarmee we werken.
In Minecraft geeft het spel ons alleen OF-poorten (blokken en draden die alternatief kunnen worden aangedreven vanuit verschillende richtingen) en NIET poorten (redstone-fakkels). Maar dit volstaat om alle andere dingen te bouwen, bijvoorbeeld in redstone wordt "a EN b" feitelijk gebouwd als "NIET (NIET A OF NIET B)" (deze gelijkwaardigheid staat bekend als de wet van De Morgan).

##monostables

Als we toegeven dat de output van een circuit niet alleen afhankelijk is van de inputs (op een bepaald moment), maar ook van zijn eigen geschiedenis (bijvoorbeeld de laatste output), kunnen we het geen 'gate' noemen.

Een eenvoudig voorbeeld hiervan zijn monostabiele circuits: na het veranderen van de status van hun output (actief worden als ze een input ontvangen) zullen ze na een tijdje terugkeren naar hun vroegere (inactieve) output. We kunnen dus zeggen dan de minecraft knop een eenvoudig monostabiel circuit is. De knop is beperkt tot direct gebruikersingang).

Dus de output van een monostabiele puls zal altijd een puls zijn, d.w.z. een signaal dat aan- en weer uitschakelt (en met signaal bedoel ik een bepaalde tijdsequentie van aan / uit-toestanden op een enkele draad).

Er zijn verschillende meer gespecialiseerde namen voor monostabiele apparaten, met de nadruk op hoe lang de uitvoer duurt (de uitgang hoog is) in vrelatie tot de duur van de ingang:
Als de outputpuls kort is vergeleken met de input (maar de input is ook een puls), dan noemen we ze pulse verkortters (of pulse limiters).
Als de uitgangsimpuls langer is dan de ingangsimpuls, noemen we ze pulsverlengers (pulse sustainers of pulse lengtheners).
Als het ons niet uitmaakt hoe lang de invoer aan blijft (kan zelfs onbepaald zijn), noemen we ze flankdetectoren (edge detecctors).
Soms zijn we meer geïnteresseerd in wanneer een signaal wordt geschakeld: 
- Detectie van uit naar aan (sijgende flank detectie of Rising edge detection)

	- Wanneer het signaal aan de ingang van hoog naar laag gaat krijgen we een puls aan de uitgang.
- Detectie van aan naar uit (dalende flank detectie of falling edge detection)

	- Wanneer een signaal van hoog naar laag wijzigt zullen we een puls krijgen aan de uitgang.
- Detectie van laag naar hoog en hoog naar laag	(dubbele flank detectie of dual edge detection)

	- Wanneer we een verandering aan het ingang signaal willen detecteren kunnen we geburik maken van een dubbele flank detector. dit combineert een stijgende en dalende flank detector. (later meer hierover).

##Latch of geheugen

Een andere belangrijke schakeling is een geheugencel, ook wel een latch of een flip-flop genoemd, de laatste suggereert dat deze niet één maar twee stabiele uitgangstoestanden hebben (daarom worden deze circuits ook wel bistabiel genoemd). Denk aan 'stabiel', want de output zou hetzelfde kunnen blijven, zelfs als sommige van de ingangen veranderen. Op welke manier de invoer wordt gebruikt om die uitvoer te regelen (d.w.z. welke veranderingen in de ingangen belangrijk worden geacht) is het verschil tussen de meest gebruikelijke geheugencellen:

 - Een SR of RS Latch
   - Dit is een cell met 2 ingangen in om te zetten en in om te resseten. de volgorde van de S en R bepalen de schakel regels. (later meer hierover)
   
 - Een T Flip Flop
   - Dit is een cell met 1 ingang. De uitgang volgt de ingang. (vergelijkbaar met een minecraft hendel)
   
 - Een D Flip Flop
   - Dit is een cell met 2 ingangen, meestal genaamd data en write. De uitgang volgt de ingang als de conditie aan het write signaal voldaan is (maw als er een stijgende flank is aan het write signaal)
     
 Zowel de t als de D Flip Flop maken vaak intern gebruik van een interne SR-latch. Soms worden ook hybrides gecreered waarop men ook de S en R ingangen kan manipuleren.
 
 ##Clocks     

Nu hebben we circuits gezien met een enkele stabiele uitgangstoestand (monostabiel) en 
twee stabiele uitgangstoestanden (bistabiele). 
Hoe zit het met schakelingen waarbij geen van beide uitvoeringen stabiel is, d.w.z. Aan wordt na een tijd uit en vice versa? Dit zijn klokken (en je kunt ze ook wel stabiele circuits noemen).

Er zijn drie interessante cijfers die een klok definiëren: hoe lang blijft hij aan (de pulsduur), hoe lang blijft hij uit en de som van de twee (de periode).

Soms is het voldoende om alleen de periode te vertellen (hoelang tot deze weer aan gaat), maar ik raad aan om altijd de pulsduur te vertellen (bijv. Als ik "een 1/4 klok" zeg, ik bedoel een klok die op voor 1 van de 4 tikken, maar tot nu toe lijkt er op dit forum geen conventie te zijn).

Een alternatieve manier om dat te doen is om de duty-cycle van de klok te definiëren: de pulsduur gedeeld door de periode.
