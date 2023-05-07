package service;

import java.util.Scanner;

public class GameMenu {


    String userChoicePrompted;
    int userChoiceConverted;
    boolean isOk;
    Service service = new Service();
    boolean trueCondition = true;
    boolean trueConditionCheck;
    boolean ifPlayAgain = true;
    char kontynuujGre;

    Scanner scanner = new Scanner(System.in);


    public void menuPrompting() {

        while (trueCondition) {
            //choosingMenuOption();  --> jak zostawie to, to mi wyswietla menu podwojnie przy wybraniu opcji koniec gry
            trueCondition = switchMenu(choosingMenuOption());
        }
    }

    public int choosingMenuOption() {
        System.out.println("\t\t MENU" +
                "\n 1) ZASADY GRY." +
                "\n 2) ZAGRAJ." +
                "\n 3) WYJŚCIE.");

        isOk=true;  // bez tego przy wyborze opcji ZASADY i perobie powrotu do menu glownego nie daje nam ponownie mozliwosci wybooru pozycji w menu, ponieważ isOk jest false i pomija nam pętle while
        while (isOk) {
            try {
                userChoicePrompted = scanner.nextLine();
                userChoiceConverted = Integer.parseInt(userChoicePrompted);
                if (userChoiceConverted >= 1 && userChoiceConverted <= 3) {
                    isOk = false;
                } else System.out.println("Nie ma takiej pozycji w MENU");

            } catch (NumberFormatException e) {
                System.out.println("Błędny typ. Popraw,");
            }
        }
        return userChoiceConverted;

    }
    public boolean switchMenu(int userChoice) {
        switch (userChoice) {
            case 1:
                gameRules();  // tu będą zasady gry
                try {
                    System.out.println("Naciśnij klawisz ENTER aby powrócić do menu głównego.");
                    System.in.read();
                    trueConditionCheck = true;
                } catch (Exception e) {}
                break;

            case 2:
                service.startGame();
                System.out.println("Czy chcesz powrocic do MENU (Y) czy opusćic grę (N) ?");
                do {
                    String playAgain = scanner.nextLine();
                    if (Character.toUpperCase(playAgain.charAt(0)) == 'Y') {
                        trueConditionCheck = true;
                        ifPlayAgain = false;
                    } else if (Character.toUpperCase(playAgain.charAt(0)) == 'N') {
                        trueConditionCheck = false;
                        ifPlayAgain = false;
                        System.out.println("DO ZOBACZENIA!");
                    } else {
                        System.out.println("Nie ma takiej opcji. " +
                                "\n Czy chcesz powrocic do MENU (Y) czy opusćic grę (N) ?");
                        ifPlayAgain = true;
                    }
                }
                while (ifPlayAgain);
                break;

            case 3:
                trueConditionCheck = false;
                System.out.println("KONIEC GRY. DO ZOBACZENIA");
                break;

            default:
                System.out.println("ZŁY WYBÓR");
                break;

        } return trueConditionCheck;
    }

    public void gameRules(){
        System.out.println("\t\t OGÓLNE ZASADY GRY  'ZBIJAK'  ");
        System.out.println("ZASADY GRY\n" +
                "Celem gry zbijak jest wyeliminowanie przeciwnika poprzez jego zbicie i usunięcie z obszary gry (planszy).\n" +
                "W grze udział bierze 1 gracz oraz 3 wirtualnych przeciwników (Computer 1 / Computer 2 / Computer 3). W każdej rundzie gracz oraz wirtualni przeciwnicy wykonują po jednym ruchu na wirtualnej planszy. Gra kończy się gdy spełniony będzie jeden z dwóch warunków:\n" +
                "- wygraną gracza, gdy gracz zbije wszystkich wirtualnych przeciwników;\n" +
                "- przegraną gracza, gdy gracz zostanie zbity przez jednego z wirtualnych przeciwników.\n" +
                "Wirtualni przeciwnicy nie mogą zbijać siebie wzajemnie – może ich zbić tylko Gracz,\n" +
                "\n" +
                "TWORZENIE PLANSZY\n" +
                "Gra odbywa się na kwadratowej planszy o wymiarach X na X. O wymiarach planszy decyduje gracz, który Przed uruchomieniem rozgrywki zostaje poproszony o podanie jej wielkości. Plansza nie może być mniejsza niż 3 x 3. Próba utworzenia zbyt małej planszy zakończy się poproszeniem gracza o wpisanie większej wartości.\n" +
                "Podpowiedź: większa plansza to dłuższa rozgrywka. Zaleca się utworzenie planszy o wielkości 10x10.\n" +
                "\n" +
                "PORUSZANIE SIĘ PO PLANSZY\n" +
                "Gracz porusza się po wirtualnej planszy za pomocą klawiszy:\n" +
                "- W (ruch do góry);\n" +
                "- S (ruch na dół);\n" +
                "- A (ruch w lewo);\n" +
                "- D (ruch w prawo).\n" +
                "Po każdym ruchu następuje aktualizacja pozycji gracza, która następnie wyświetlana jest na ekranie. \n" +
                "W przypadku wykonania zabronionego ruchu (wyjście poza obszar planszy) gracz zostanie poproszony  o powtórzenie swojego ruchu. \n" +
                "\n" +
                "MECHANIZM ZBIJANIA\n" +
                "Zbicie gracza bądź przeciwnika dokonuje się, gdy gracz bądź przeciwnik po wykonaniu swojego ruchu znajda się na polu, na którym znajduje się przeciwnik. O zbiciu przeciwnika gracz zostanie poinformowany odpowiednim komentarzem. Po zbiciu wszystkich przeciwników gracz zostanie poinformowany o zakończeniu gry.\n" +
                "Jeśli gracz zostanie zbity przez przeciwnika zostanie poinformowany o zakończeniu gry.\n" +
                "\n");
    }
}



