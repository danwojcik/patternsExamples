# patternsExamples
## Przykłady ćwiczeń na najpopularniejsze wzorce projektowe. Podzielone na trzy grupy: behawioralne, kreacyjne i strukturalne.
## Wzorce behawioralne:
* chain - Pozwala przekazywać żądania według łańcucha obiektów obsługujących. 
          Otrzymawszy żądanie, każdy z obiektów obsługujących decyduje o zrealizowaniu żądania lub przekazaniu go do swojego następnika w łańcuchu.
* command - Zmienia żądanie w samodzielny obiekt zawierający wszystkie informacje o tym żądaniu. 
            Taka transformacja pozwala na parametryzowanie metod przy przy użyciu różnych żądań. 
            Oprócz tego umożliwia opóźnianie lub kolejkowanie wykonywania żądań oraz pozwala na cofanie operacji.
* state - Pozwala obiektowi zmienić swoje zachowanie gdy zmieni się jego wewnętrzny stan. Wygląda to tak, jakby obiekt zmienił swoją klasę.
* strategy - Pozwala zdefiniować rodzinę algorytmów, umieścić je w osobnych klasach i uczynić obiekty tych klas wymienialnymi.
* templateMethod - Definiuje szkielet algorytmu w klasie bazowej, 
                   ale umożliwia podklasom nadpisanie poszczególnych etapów algorytmu bez konieczności zmiany jego struktury.
## Wzorce kreacyjne:
* abstractFactory - Umożliwia tworzenie rodzin spokrewnionych ze sobą obiektów bez określania ich konkretnych klas.
* builder - Daje możliwość konstruowania złożonych obiektów krok po kroku. 
            Wzorzec ten pozwala produkować różne typy oraz reprezentacje obiektu używając tego samego kodu konstrukcyjnego.
* factory - 
* prototype - Umożliwia kopiowanie istniejących obiektów bez tworzenia zależności pomiędzy twoim kodem, a ich klasami.
* singelton - Pozwala zachować pewność, że istnieje wyłącznie jedna instancja danej klasy oraz istnieje dostęp do niej w przestrzeni globalnej.
## Wzorce strukturalne:
* adapter - Pozwala na współdziałanie obiektów o niekompatybilnych interfejsach.
* composite - Pozwala komponować obiekty w struktury drzewiaste, a potem traktować je tak, jakby były one osobnymi obiektami.
* decorator - Pozwala nadać dodatkowe obowiązki obiektom poprzez umieszczenie tych obiektów w specjalnych obiektach opakowujących, 
              które zawierają odpowiednie zachowania.
* fasade - Wyposaża bibliotekę, framework lub inny złożony zestaw klas w uproszczony interfejs.
* flyweight - Pozwala zmieścić większą liczbę obiektów w dostępnej pamięci RAM poprzez współdzielenie elementów opisujących stan obiektu. 
              Część opisu stanu jest wspólna dla wielu obiektów, więc nie muszą one zawierać kopii wszystkich danych.
* proxy - Pozwala tworzyć zastępcę dla innego obiektu. Pełnomocnik nadzoruje dostęp do pierwotnego obiektu, 
          pozwalając na wykonanie jakiejś czynności przed lub po przekazaniu do niego żądania.
                 
