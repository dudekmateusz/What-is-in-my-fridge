package Warunki;

import Library.Recipe;
import Library.Library;

public class LibraryControl {

    //tu mają być warunki, które sprawią, że jeśli podamy produkty, które mamy w lodówce, to na podstawie minimum 3 produktów podstawowych
    //wyświetlą się proponowane przepisy, które mają je w swojej bazie.

    //zmienne do kontrolowania programu
    private static final int EXIT = 0;
    private static final int SEARCH_RECIPE = 1;
    private static final int ADD_RECIPE = 2;
    private static final int RATE_RECIPE = 3;
    private static final int RATE_APP = 4;

    //zmienna do komunikacji z użytkownikiem
    private DataReader dataReader = new DataReader();

    //biblioteka przechowująca dane

    private Library library = new Library();

    //główna metoda programu, która pozwoli na wybór opcji i interakcję

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case SEARCH_RECIPE:
                    searchRecipe();
                    break;
                case ADD_RECIPE:
                    addRecipe();
                    break;
                case RATE_RECIPE:
                    rateRecipe();
                    break;
                case RATE_APP:
                    rateApp();
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wybierz ponownie: ");
            }
        } while (option != EXIT);
    }

    private void printOptions(){
            System.out.println("Wybierz opcję: ");
            System.out.println(SEARCH_RECIPE +" - Wpisz co masz w lodówce i wyszukaj przepis");
            System.out.println(ADD_RECIPE +" - Dodaj nowy przepis");
            System.out.println(RATE_RECIPE + " - Oceń ostatnio wykorzystany przepis");
            System.out.println(RATE_APP + " - Oceń aplikację");
            System.out.println(EXIT + " - Wyjście z programu");
    }
        //tu będę musiał jeszcze poszukać jak pobrać dane od użytkownika i jak program ma wybrać i wyświetlić przepis
        private void searchRecipe(){
            dataReader.chooseAndPrintRecipe();
    }
        private void addRecipe() {
            Recipe recipe = dataReader.readAndCreateRecipe();
            library.addRecipe(recipe);
    }
        //tutaj muszę stworzyć prawidłowo metodę na dodawanie do przepisu oceny pobieranej od użytkownika w skali od 1 do 5
        private void rateRecipe() {
            Recipe recipe = dataReader.recipeRating();
            library.addRecipeRating(recipe);
    }
        // tu też nie wiem jak stworzyć metodę, która będzie pobierać oceny od użytkownika i zapisywać je
        private void rateApp() {
            dataReader.readAndShowAppRating();
    }
        private void exit(){
            System.out.println("Dzięki za skorzystanie z aplikacji! Papa!");

            //zamknięcie strumienia wejścia
            dataReader.close();
    }
}
