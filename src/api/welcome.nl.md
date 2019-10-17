#CoderDojo

?c(
../MineCraftProjects/assets/brand.png
)c?

#[CoderDojo Belgium](https://www.coderdojobelgium.be/nl)

Welkom bij de startpagina van deze site. Aan de rechterkant ziet u de verschillende secties die u kunt raadplegen.
Het doel van deze site is om verschillende onderwerpen binnen minecraft te verzamelen voor het gebruik van Dojo's.

#Gebruik van de site.
Elke afbeelding is annklikbaar. Door een afbeelding aante klikken zal er een pop-up openen die de afbeelding op een groter formaat weergeeft.
Indien het een reeks aan afbeeldingen (carousel) is kan men door aan de linker of de rechterkant van de afbeelding te klikken naar de volgende afbeelding in de sequentie gaan.

##Aanmaken van markdown bestanden en menu items.

Voor het helpen met het uitbreiden van de site raden we u aan om het excelbestand dat in de gitrepository zit te gebruiken.
Hierin kan men gemakkelijk de nodige aanpassingen en uitbreidingen op het menu doen.
Alsook lege stub bestanden laten aanmaken voor niet onderwerpen.
Zet het uitput pad in voor uw systeem door de cell F2 naar de juiste map te laten wijzen.

##Markdown syntax

Deze site draait op een aangepaste markdown versie.
Alle standaard commandos zijn aanwezig maar er zijn een paar extensies gedaan.

###Carousel
Er is een carousel component voorzien. Hiermee kan men afbeelding groeperen in een component in plaats van alle afbeelding achterelkaar te plaatsen.
Men zal pijltjes links en rechts hebben om van afbeelding te wissen. Indien er maar 1 afbeelding in de lijst aanwezig is zullen de pijltjes niet getoond worden.

####Voorbeeld:
Dit is een carousel met 2 afbeelding.

?c(../MineCraftProjects/assets/projects/storage/tangotekv2/TangoTekStorageV2.png,
../MineCraftProjects/assets/projects/storage/tangotekv2/TangoTekStorageRoomView.png)c?

####Syntax:
Begin met een vraagteken gevolgd door een c.
Plaats tussen ronde haakjes alle urls naar afbeeldingen.
Elke afbeelding moet op een nieuwe lijn staan.

<pre>
&#63;c(afbeelding1 url,
 afbeelding2 url)c&#63;
</pre>

###Layout Right/ Layout Left
Een component waarbij men een tekst vak met een carousel item heeft.
De afbeelding staat aan de rechter of linker kant van de tekst.

####Voorbeeld:

?l[
Dit is een voorbeeld met een afbeelding aan de linkerzijde.
](../MineCraftProjects/assets/projects/storage/tangotekv3/ModuleReference.png)l?

?r[
Dit is een voorbeeld met een afbeelding aan de rechterzijde.
](../MineCraftProjects/assets/projects/storage/tangotekv3/ModuleReference.png)r?

?t[
Dit is een voorbeeld met een afbeelding aan de bovenzijde.
](../MineCraftProjects/assets/projects/storage/tangotekv3/ModuleReference.png)t?

?b[
Dit is een voorbeeld met een afbeelding aan de onderzijde.
](../MineCraftProjects/assets/projects/storage/tangotekv3/ModuleReference.png)b?

####Syntax:

syntax voor een links gealigneerde afbeelding.

<pre>
&#63;l&#8261;
Dit is een voorbeeld met een afbeelding aan de linkerzijde.
](../MineCraftProjects/assets/projects/storage/tangotekv3/ModuleReference.png)l&#63;
</pre>

syntax voor een rechts gealigneerde afbeelding.

<pre>
&#63;r&#8261;
Dit is een voorbeeld met een afbeelding aan de rechterzijde.
](../MineCraftProjects/assets/projects/storage/tangotekv3/ModuleReference.png)r&#63;
</pre>

<pre>
&#63;r&#8261;
Dit is een voorbeeld met een afbeelding aan de bovenzijde.
](../MineCraftProjects/assets/projects/storage/tangotekv3/ModuleReference.png)r&#63;
</pre>

<pre>
&#63;r&#8261;
Dit is een voorbeeld met een afbeelding aan de onderzijde.
](../MineCraftProjects/assets/projects/storage/tangotekv3/ModuleReference.png)r&#63;
</pre>

###You-tube speler

Maak het mogelijk om you tube filmpjes in de site te steken.

####Voorbeeld
?v[ https://www.youtube.com/watch?v=npjJPlH6BZQ ]v?

####Syntax

<pre>
&#63;v&#8261;
https://www.youtube.com/watch?v=npjJPlH6BZQ
]v&#63;
</pre>
