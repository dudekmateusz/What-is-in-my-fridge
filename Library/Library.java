package Library;

public class Library {
    public static void main(String[] args) {

        Recipe[] recipes = new Recipe[1000];

        //tu będzie baza przepisów wpisana ręcznie, dopóki nie nauczę się zaciągać bazy z internetu

        recipes[0] = new Recipe("Zupa z soczewicy z ziemniakami i kurczakiem","1 cebula, 1 marchewka,2 litry bulionu,1/2 szklanki czerwonej soczewicy, 3 ziemniaki, 1 pojedynczy filet z kurczaka, 2/3 szklanki przecieru pomidorowego","1/2 łyżeczki pieprzu, kurkumy, papryki słodkiej,oregano","Łatwe",30,   "W garnku na oliwie zeszklić pokrojoną w kosteczkę cebulę. Dodać obraną i startą marchewkę i wymieszać, chwilę razem podsmażać. Wlać bulion i zagotować. Dodać przepłukaną soczewicę oraz obrane i pokrojone w kostkę ziemniaki. Doprawić pieprzem, kurkumą, papryką i oregano oraz solą w razie potrzeby.W gotującą się zupę włożyć pokrojoną w małą kosteczkę pierś kurczaka. Przykryć garnek i gotować przez ok. 8 minut. Wlać przecier pomidorowy i gotować jeszcze przez 3 - 5 minut.Posypać zieleniną (np. szczypiorek, natka, koperek, rzeżucha) i podawać np. z pieczywem.");
        recipes[1] = new Recipe("Kasza bulgur na zielono","100g kaszy bulgur, 1 średnia cukinia, 1 średnia kalarepa, 2 małe cebule, 1 ząbek czosnku, 50-60g szpinaku, 50g startego sera","sól i pieprz, 2 łyżki oleju, 1 łyżka zimnego masła, pomidorki koktajlowe","Łatwe",20,"Kaszę gotuję wg przepisu na opakowaniu, skracając czas o ok. 3 minuty, by pozostała jędrna (w lekko osolonej wodzie). W tym samym czasie, gdy kasza się gotuje po kolei: podsmażam na oleju do zeszklenia pokrojoną w drobną kostkę cebulę. Do podsmażonej cebuli dorzucam równie drobno pokrojoną kalarepę - przykrywam patelnię i na małym ogniu smażę razem ok. 5 minut. Dodaję pokrojoną w kostkę cukinię (ze skórką), podsmażam kolejne 5 minut. Dodaję przeciśnięty przez praskę czosnek, posiekane liście szpinaku i masło, przykrywam i na małym ogniu smażę 2-3 minuty. Dodaję odsączoną, gorącą kaszę, mieszam i doprawiam do smaku solą i pieprzem. Na koniec dodaję starty ser, mieszam do jego rozpuszczenia, od razu podaję.");
    }
}
