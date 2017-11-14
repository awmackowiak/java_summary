/*
* W poniższym przykładzie pokażę tobie jak zdefiniować i odwołać się (wykożystać zdefinowane zmienne).
*/

public class Zmienne {

    /*
    * Zmienne definuje się wedle ponieższego szablonu:
    * <zasięg> <static/final> <typ/rodzaj> <nazwa> = <wartość>;
    * zasieg - wyróżniamy 3 typy zasięgu zmienny bądz funkcji, a mianowicie: public, private, protected, default.
    *          Zmienna "public" widoczna w każdym ciele programu i z możiwościa odwolania się do niej bez przeszkód.
               Zmienna "protected"  pozwala na dostęp do danego elementu tylko dla klas dziedziczących oraz klas z tego samego pakietu
               Zmienna "private" dostęp do danego elementu ograniczony tylko do klasy w, którym jest ZDEFINIOWANY.
               Zmienna "default" pozwala na dostęp do danego elementu tylko klasom z danego pakietu (nie istnieje słowo w Javie określające ten rodzaj dostępu, jeżeli chcemy go użyć to po prostu nie podajemy żadnego modyfikatora)
    * static - slowo static definiuje ze zmienna o tej nazwie jest definiowana raz w pamięci i jest dziedziczona w każdych klasach/emelentach. Ale można ją nadpisać.
    * final - słowo "final" to nic innego jak określa zmienną, która do końca swojego życia będzie miała zadeklarowana wartość, której NIE możemy ZMIENIĆ.
    * type/rodzaj - String (Ciąg znaków), int (liczby calkowite), double (liczby zmienno przecinkowe), boolean (watorść logiczna True lub False)
    * nazwa - Dowlona nazwa pod która będzie widoczna zmienna. (To nic innego jak referencja do miejsca w pamięci komputera, pod którym znjdować się będzie wartość). Nazwa zmiennej ma swoją konwencję nazewniczą, iż ZACZYNA SIE OD MALYCH !LITER!. Mogą występować takie znaki specjalne jak "_". 
    * = - Znak równości w programowaniu to nic innego jak znak PRZYPISANIA!
    * wartość - zawartość jaka ma być przechowywana pod danna zmienna
    *
    * Poniżej przedstawiam sposób deklarowania zmiennych:
    */

    private static String imie = "Arthur";   // Definicja zmiennej typu String. HINT: Wszystko co znajdować się będzie w "" trakotwane jest jako wartość String(ciąg znaków)
    private static int wiek = 30;            // Definicja zmiennej wiek, która jest warości integer (int, licza całkowita). HINT: Jak widać liczby reprezentowane są bez jakichkolwiek ""
    private static double wyplata = 1000.10; // Definicja zmiennej "wyplata", która przechowuje wartość "double". HINT: Przy definicja wartości "double" separatorem liczb dziesietnych jest "." (kropka), a nie "," (przecinek)
    private static boolean pelnoletniosc = true;    // Definicja wartości "pełnoletność" typu logicznego PRAWDA/FAŁSZ (boolean).

    /* Istnieje mozliwość zdefiowania zmiennych, bez konieczności przypisania jej jakiejkolwiek warosci.
    * Przykład ponieżej:
    * Definujemy zmienna "Kraj" ale jej wartość przypiszemy w funkcji "main"
    */
    private static String kraj;

    public static void main(String[] args) {
       /*
       * Jeśli już mamy zdeklarowane zmienne możemy się do nich odwołać o PRZEZ ICH NAZWĘ.
       */
	System.out.println(imie);          // Wykożystujemy zmienna "imie" aby wyprintować jej zawartość na ekranie dzięki funkcji "System.out.println", która już nam dodaje znak nowej lini po wyprinotowaniu/wypisaniu na ekran.
        System.out.println(wiek);          // Wypiszemy teraz zawartość zmiennej "wiek".
	System.out.println(wyplata);       // Analogicznie jak wyżej...
        System.out.println(pelnoletniosc); //

        // Ponieżej przypisujemy wartość do wcześniej zdeklarowanej zmiennej
        kraj = "Poznan";
	System.out.println(kraj);
        
        // Sposob nadpisania wartości to nic innego jak przypisanie nowej wartości do danej zmiennej:
        wiek = 31;
        System.out.println(wiek);
    }

}
