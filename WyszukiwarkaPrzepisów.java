package Apka;

public class WyszukiwarkaPrzepisów {
    public static void main(String[] args) {
        final String appName = "Wyszukiwarka Przepisów v.01";


        //tu będzie program, który będzie pozwalał pobierając dane przepisów z biblioteki wyświetlać proponowane przepisy
        //tzn. klient wpisuje co ma w lodówce (minimum 3 skłądniki) i program na podstawie warunków z klasy "Warunki"
        //zaciągnie warunki wyświetlenia przepisów i zaproponuje przepisy, które mają w składzie przynajmniej 3 skłądniki
        //podstawowe. Zaproponuje także po co trzeba się wybrać do sklepu, a co jest składnikiem opcjonalnym(który można zastąpić)
        System.out.println(appName);
        System.out.println("Cześć! Pomogę Ci dzisiaj w zrobieniu pysznego obiadu.");
        System.out.println("Powiedz mi co masz w lodówce, a ja podpowiem, co można z tego zrobić.");
        System.out.println("Podaj produkty: ");
        //tu program będzie musiał zaciągnąć dane od użytkownika i wyświetlić propozycje obiadów

        System.out.println("Na podstawie wpisanych produktów mogę zaproponować Ci kilka przepisów.");
        //tu ma pojawić się lista przepisów, które mają w swoim składzie przynajmniej 3 składniki podstawowe

        System.out.println("Które danie najbardziej Ci pasuje?");
        //użytkownik będzie musiał w tym momencie wybrać które z zaproponowanych dań mu się podoba.

        System.out.println("Super! Do wykonania tego dania brakuje Ci jednak kilku składników.");
        System.out.println("Składniki podstawowe, które musisz dokupić: ");
        //tu ma się pojawić lista składników, których brakuje z listy skłądników podstawowych

        System.out.println("Dodatkowo, aby polepszyć smak potrawy polecam dodać: ");
        //tu ma się wyświetlić lista składników pomocniczych, które są w przepisie

        System.out.println("Masz już wszystko? W takim razie wyświetlam przepis.");
        //wyświetli się teraz sposób przygotowania

        System.out.println("Zrobione? Zjedzone? Daj znać ile rzeczywiście czasu zajęło Ci zrobienie tego dania.");
        //tu użytkownik będzie miał możliwość wpisania czasu wykonania obiadu
        System.out.println("Oceń jeszcze proszę w skali 1-5 jak bardzo Ci smakowało.");
        //tu użytkownik będzie mógł ocenić danie
        //chciałbym, żeby dane z czasu wykonania i ocena się zapisywały tak, żeby po zebraniu min. 5 ocen dane się aktualizowały
        //i wyświetlały się kolejnym użytkownikom przy używaniu apki.

        System.out.println("Mam nadzieję, że jesteś zadowolony z mojej pracy. Do zobaczenia!");
        //tu program się będzie zamykał
    }
}
