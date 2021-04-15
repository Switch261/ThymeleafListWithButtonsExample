# ThymeleafListWithButtonsExample
Beispiel für Navigation durch eine Liste mithilfe von Buttons (Thymeleaf und Javascript)

# Ziel 
Auf einer HTML-Seite eine übergebene Liste elementweise mithilfe von Buttons durchgehen

# Ergebnis
Es gibt verschiedene Lösungen, alle basieren auf dem selben Ansatz. Der Unterschied liegt in den Graden der Verbesserung/Optimierung.
### Simple 
<http://localhost:8080/simple> <br>
Dies ist die grundlegendste Lösung. Um das erste Listenelement anzuzeigen, muss zunächste der Button "SHOW LIST" angeklickt werden.
Daraufhin wird das erste Element angezeigt. <br>
Mit den Buttons "Previous" und "Next" lässt sich zwischen den Elementen wechseln. Wenn man beim ersten bzw. letzten Element angekommen ist, bleibt der Button "Previous" bzw. "Next" ohne funktion, jedoch klickbar.
### Better
<http://localhost:8080/better> <br>
Dies ist eine weiterentwickelte Lösung. <br>
Das erste Listenelement wird automatisch angezeigt, sobald die Seite geladen wurde (siehe body onload). <br>
Mit den Buttons "Previous" und "Next" lässt sich zwischen den Elementen wechseln. Wenn man beim ersten bzw. letzten Element angekommen ist, bleibt der Button "Previous" bzw. "Next" ohne funktion, und ist nicht mehr klickbar (disabled)
### Optimized 
http://localhost:8080/optimized <br> 
Dies ist eine weitere weiterentwickelte Lösung. <br>
Beinhaltet alle verbesserungen von "Better", wurde jedoch weiter verbessert, sodass als Index nicht mehr das Field Index im Listenelement verwendet wird, sondern der Index anhand des Wertes der Listenfunktion `list.getIndexOf(element)`. <br>
Hierzu wird lediglich eine Vergleichsoperation im Listenelement `element.equals()` benötigt, die einen eindeutigen Wert für jedes Listenelement zurückgibt.

# Links
## HTML ID Feld: Informationen und in Javascript nutzen
https://www.w3schools.com/html/html_id.asp

## HTML Elemente (nicht) sichtbar machen (Javascript)
https://stackoverflow.com/questions/9456289/how-to-make-a-div-visible-and-invisible-with-javascript

## Javascript Funktionsaufruf mit Thymeleaf-Variablen
https://stackoverflow.com/questions/26526037/javascript-function-call-with-thymeleaf
https://www.programmersought.com/article/90811610750/

## Thymeleafe disable Button
https://stackoverflow.com/questions/52441267/thymeleaf-disabling-a-component/52444010

## Thymeleafe Methode aufrufen mit Parameter
http://forum.thymeleaf.org/invoking-a-method-on-model-with-parameter-td4026846.html