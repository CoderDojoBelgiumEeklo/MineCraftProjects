#Logic gates/ logische poorten

##Wat zijn Logische poorten

Logische poorten zijn onderdeel van de circuits binnen in de computer. Ze nemen een of meerdere INPUTS/INGANGEN.
Afhankelijk van de soort logica gebruikt door de poort worden de INPUTS/INGANGEN met elkaar vergeleken.
Men krijgt één of meerdere OUTPUT/UITGANG waarden terug.

##Hoe werkt het

Poorten weken op basis van een AAN/UIT logica. Er is stroom (1) of er is geen stroom (0).
Dit noemen we binaire logica. De poort kijkt naar de ingangen om te zien wie 1 of 0 is en geeft een 1 of 0 terug als uitgang.

##Link naar Minecraft

We kunnen dit elektisch signaal vergelijken met redstone. Men heeft een signaal (redstone actief of 1) of men heeft geen signaal (redstone inactief of 0).

## Basis Poorten

We onderscheiden 4 bais poorten:

|  Engelse naam | Nederlandse naam   |
|---|---|
| AND  | EN  |
| OR   |  OF |
| NOT  | NIET|
| XOR  | XOF |

## Extended poorten

3 extensies of combinaties voor andere poorten

|  Engelse naam | Nederlandse naam   |
|---|---|
| NAND  | NEN  |
| NOR |  NOF |
| XNOR  | XOF|

## De waarheidstabel

?r[
Om een poort te modeleren maken we gerbuik van een waarheidstable. in deze tabel vinden we een lijst van INGANGEN en UITGANGEN.
Waarbij elke combinatie van ingangs status het gewenste gedrag toont aan de uitgang.
Zoals men kan zien op de afbeeldingen worden ingangen van rechts naar links afgebeeld. uitgangen worden van links naar rechts afgebeeld.
We doen dit zodat we gemakkelijk een ingang of uitgang kunnen toevoegen aan de tabel.
De afbeelding aan de zijkant toont de situatie van een enpoort met 3 ingangen.
Een belangrijk punt bij het opstellen van de tabbel is de manier waarop elke signaal is opgebouwd.
Voorbeeld signaal A of de eerste ingang zal altijd afwisselend een 0 of een 1 zijn.
Het 2de signaal zal altijd afwisselend 2 nullen en dan 2 eenen tonen.
Het 3de signaal gaat 4 nullen en dan 4 maal één tonen. 
Zoals je dus ziet bij elk bijkomend signaal verdubbelen we de opeenvolgen van  nullen en eenen.
Als er een vierde signaal zou zijn hadden we we afwisselend 8 nullen en dan 8 eenen.

Hoe weet je hoe veel lijenen je moet hebben? Dit bepaald men door de macht van 2.
Een poort met 3 uitgangen heeft 2³ mogelijke combinaties of 2 * 2 * 2 = 8 mogelijke ingangs schakelingen.
 
](
../MineCraftProjects/assets/logic/TruthTable.PNG
)

